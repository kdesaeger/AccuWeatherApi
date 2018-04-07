package com.krds.accuweatherapi;

import com.krds.accuweatherapi.exceptions.UnauthorizedException;
import com.krds.accuweatherapi.model.CurrentConditions;
import com.krds.accuweatherapi.model.CurrentConditionsList;
import java.util.Optional;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrentConditionsApi extends BaseApi {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(CurrentConditionsApi.class);

    private String BASE_URL = "/currentconditions/v1/";

    protected CurrentConditionsApi(ApiSession session, String locationKey) {
        super(session);
        this.BASE_URL = this.session.URL + BASE_URL + locationKey + ".json?details=true&apikey=" + this.session.apiKey + "&language=" + this.session.language;
    }
    
    public Optional<CurrentConditions> get() throws UnauthorizedException {
      
        LOGGER.debug(String.format("Current conditions URL: ", this.BASE_URL));
        
        try {            
            CurrentConditionsList results = client.target(this.BASE_URL).request(MediaType.APPLICATION_JSON).get(CurrentConditionsList.class);
            return Optional.ofNullable(results.get(0));
        } catch (NotAuthorizedException e) {
            throw new UnauthorizedException(e);
        }
        
    }
    
}
