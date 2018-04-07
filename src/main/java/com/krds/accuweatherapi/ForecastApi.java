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

public class ForecastApi extends BaseApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(ForecastApi.class);
   
    private String BASE_URL = "/forecasts/v1";
    
    private String locationKey = "";
    
    public ForecastApi(ApiSession session, String locationKey) {
        super(session);
        this.BASE_URL = new StringBuilder(this.session.URL).append(BASE_URL).toString();
        this.locationKey = locationKey;
    }
    
    public Optional<Forecast> getDailyXdays(int days) throws UnauthorizedException, ApiException {
        
        String url = String.format("%s/daily/%dday/%s.json?details=true&apikey=%s&language=%s", this.BASE_URL, days, 
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

}
