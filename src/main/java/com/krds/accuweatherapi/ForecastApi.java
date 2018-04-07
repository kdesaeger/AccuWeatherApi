package com.krds.accuweatherapi;

import com.krds.accuweatherapi.exceptions.ApiException;
import com.krds.accuweatherapi.exceptions.UnauthorizedException;
import com.krds.accuweatherapi.model.Forecast;
import java.util.Optional;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Wrapper class around the AccuWeather Forecast API
 * @see https://developer.accuweather.com/accuweather-forecast-api/apis
 */
public class ForecastApi extends BaseApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(ForecastApi.class);
   
    private String BASE_URL = "/forecasts/v1";
    
    private String locationKey = "";
    
    public ForecastApi(ApiSession session, String locationKey) {
        super(session);
        this.BASE_URL = this.session.URL + BASE_URL;
        this.locationKey = locationKey;
    }
    
    /**
     * Returns the forecast for the next x days
     * @param days The DayPeriod
     * @return The forecast
     * @see com.krds.accuweatherapi.DayPeriod
     * @throws UnauthorizedException When the session API key is rejected
     * @throws ApiException In case of a problem with the AccuWeather Rest API call
     */
    public Optional<Forecast> getDailyXdays(DayPeriod days) throws UnauthorizedException, ApiException {
        
        if (days == null) {
            throw new IllegalArgumentException("Missing DayPeriod parameter");
        }
        
        String url = String.format("%s/daily/%dday/%s.json?details=true&apikey=%s&language=%s", this.BASE_URL, days.getDays(), 
                this.locationKey, this.session.apiKey, this.session.language);
        
        LOGGER.debug("getDailyXdays URL: {}", url);
        
        try {
            return Optional.ofNullable(client.target(url).request(MediaType.APPLICATION_JSON).get(Forecast.class));
        } catch (NotAuthorizedException e) {
            throw new UnauthorizedException(e);
        } catch (BadRequestException e) {
            throw new ApiException(e);
        }
        
    }
    
    /**
     * Returns the forecast for the next x hours
     * @param hours The HourPeriod
     * @return The forecast
     * @see com.krds.accuweatherapi.HourPeriod
     * @throws UnauthorizedException When the session API key is rejected
     * @throws ApiException In case of a problem with the AccuWeather Rest API call
     */
    public Optional<Forecast> getHourlyXhours(HourPeriod hours) throws UnauthorizedException, ApiException {
        
        if (hours == null) {
            throw new IllegalArgumentException("Missing HourPeriod parameter");
        }
        
        if (hours != HourPeriod.HOURS_1 && hours != HourPeriod.HOURS_12 && hours != HourPeriod.HOURS_24
                 && hours != HourPeriod.HOURS_72 && hours != HourPeriod.HOURS_120) {
            throw new IllegalArgumentException("Current conditions can only be retrieved for 1, 12, 24, 72 or 120 hour HourPeriods");
        }
        
        String url = String.format("%s/hourly/%dhour/%s.json?details=true&apikey=%s&language=%s", this.BASE_URL, hours.getHours(), 
                this.locationKey, this.session.apiKey, this.session.language);
        
        LOGGER.debug("getHourlyXhours URL: {}", url);
        
        try {
            return Optional.ofNullable(client.target(url).request(MediaType.APPLICATION_JSON).get(Forecast.class));
        } catch (NotAuthorizedException e) {
            throw new UnauthorizedException(e);
        } catch (BadRequestException e) {
            throw new ApiException(e);
        }
        
    }

}
