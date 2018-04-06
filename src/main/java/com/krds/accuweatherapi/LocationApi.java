package com.krds.accuweatherapi;

import com.krds.accuweatherapi.model.GeoPositionSearchResult;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientProperties;

public class LocationApi {
    
    private static String BASE_URL = "/locations/v1/cities/geoposition/search.json?apikey=";

    private final ApiSession session;
    
    private final Client client = ClientBuilder.newClient();
    
    protected LocationApi(ApiSession session) {
        this.session = session;
        LocationApi.BASE_URL = this.session.URL + BASE_URL + this.session.apiKey + "&language=" + this.session.language;
        
        if (this.session.connectTimeout != -1) {
            client.property(ClientProperties.CONNECT_TIMEOUT,  this.session.connectTimeout);
        }
        if (this.session.readTimeout != -1) {
            client.property(ClientProperties.READ_TIMEOUT, this.session.readTimeout);
        }
        
        
    }
    
    public GeoPositionSearchResult geoPosition(double lat, double lng) throws UnauthorizedException {
        
        String url = BASE_URL + "&q=" + Double.toString(lat) + "," + Double.toString(lng);
      
        System.err.println(url);
        
        try {
            return client.target(url).request(MediaType.APPLICATION_JSON).get(GeoPositionSearchResult.class);
        } catch (NotAuthorizedException e) {
            throw new UnauthorizedException(e);
        }
    }
}
