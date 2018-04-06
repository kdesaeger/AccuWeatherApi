package com.krds.accuweatherapi;

import com.krds.accuweatherapi.model.CurrentConditions;
import com.krds.accuweatherapi.model.CurrentConditionsList;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.core.MediaType;

public class CurrentConditionsApi extends BaseApi {

    private String BASE_URL = "/currentconditions/v1/";

    protected CurrentConditionsApi(ApiSession session, String locationKey) {
        super(session);
        this.BASE_URL = this.session.URL + BASE_URL + locationKey + ".json?details=true&apikey=" + this.session.apiKey + "&language=" + this.session.language;
    }
    
    public CurrentConditions get() throws UnauthorizedException {
      
        try {
            CurrentConditionsList results = client.target(this.BASE_URL).request(MediaType.APPLICATION_JSON).get(CurrentConditionsList.class);
            if (results != null && !results.isEmpty()) {
                return results.get(0);
            } 
            return null;
        } catch (NotAuthorizedException e) {
            throw new UnauthorizedException(e);
        }
        
    }
    
}
