package com.krds.accuweatherapi;

import com.krds.accuweatherapi.exceptions.ApiException;
import com.krds.accuweatherapi.exceptions.UnauthorizedException;
import com.krds.accuweatherapi.model.CurrentConditions;
import com.krds.accuweatherapi.model.CurrentConditionsList;
import java.util.Optional;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Wrapper class around the AccuWeather Current Conditions API
 * @see https://developer.accuweather.com/accuweather-current-conditions-api/apis
 */
public class CurrentConditionsApi extends BaseApi {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentConditionsApi.class);

    private String BASE_URL = "/currentconditions/v1/";
    private String locationKey = "";

    protected CurrentConditionsApi(ApiSession session, String locationKey) {
        super(session);
        this.BASE_URL = this.session.URL + BASE_URL;
        this.locationKey = locationKey;
    }
    
    /**
     * Retrieves the current conditions for the location key
     * @return The current conditions
     * @throws UnauthorizedException When the session API key is rejected
     * @throws ApiException In case of a problem with the AccuWeather Rest API call
     */
    public Optional<CurrentConditions> get() throws UnauthorizedException, ApiException {
      
        String url = String.format("%s%s.json?details=true&apikey=%s&language=%s", BASE_URL, this.locationKey, this.session.apiKey, this.session.language);
        
        LOGGER.debug("Current conditions URL: {}", url);
        
        try {            
            CurrentConditionsList results = client.target(url).request(MediaType.APPLICATION_JSON).get(CurrentConditionsList.class);
            if (results == null) {
                return Optional.empty();
            }
            return Optional.ofNullable(results.get(0));
        } catch (NotAuthorizedException e) {
            throw new UnauthorizedException(e);
        } catch (ClientErrorException e) {
            throw new ApiException(e);
        }
        
    }
    
}
