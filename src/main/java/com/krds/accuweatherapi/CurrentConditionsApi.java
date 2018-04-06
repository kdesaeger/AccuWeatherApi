package com.krds.accuweatherapi;

import com.krds.accuweatherapi.model.CurrentConditions;
import com.krds.accuweatherapi.model.CurrentConditionsList;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientProperties;

public class CurrentConditionsApi {

    private static String BASE_URL = "/currentconditions/v1/";

    private final ApiSession session;
    
    private final Client client = ClientBuilder.newClient();
    
    protected CurrentConditionsApi(ApiSession session, String locationKey) {
        this.session = session;
        CurrentConditionsApi.BASE_URL = this.session.URL + BASE_URL + locationKey + ".json?details=true&apikey=" + this.session.apiKey + "&language=" + this.session.language;
        
        if (this.session.connectTimeout != -1) {
            client.property(ClientProperties.CONNECT_TIMEOUT,  this.session.connectTimeout);
        }
        if (this.session.readTimeout != -1) {
            client.property(ClientProperties.READ_TIMEOUT, this.session.readTimeout);
        }        
        
    }
    
    public CurrentConditions get() throws UnauthorizedException {
           
        System.err.println(CurrentConditionsApi.BASE_URL);
        
        try {
            CurrentConditionsList results = client.target(CurrentConditionsApi.BASE_URL).request(MediaType.APPLICATION_JSON).get(CurrentConditionsList.class);
            if (results != null && !results.isEmpty()) {
                return results.get(0);
            } 
            return null;
        } catch (NotAuthorizedException e) {
            throw new UnauthorizedException(e);
        }
        
    }
    
}
