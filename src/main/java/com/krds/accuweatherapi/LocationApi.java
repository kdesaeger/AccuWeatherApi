package com.krds.accuweatherapi;

import com.krds.accuweatherapi.exceptions.ApiException;
import com.krds.accuweatherapi.exceptions.UnauthorizedException;
import com.krds.accuweatherapi.model.GeoPositionSearchResult;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocationApi extends BaseApi {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(LocationApi.class);
    
    private String BASE_URL = "/locations/v1/cities/geoposition/search.json?apikey=";

    protected LocationApi(ApiSession session) {
        super(session);
        this.BASE_URL = this.session.URL + BASE_URL + this.session.apiKey + "&language=" + this.session.language;
    }
    
    public GeoPositionSearchResult geoPosition(double lat, double lng) throws UnauthorizedException, ApiException {
        
        String url = BASE_URL + "&q=" + Double.toString(lat) + "," + Double.toString(lng);
        
        LOGGER.debug(String.format("Geolocation URL: ", url));
      
        try {
            return client.target(url).request(MediaType.APPLICATION_JSON).get(GeoPositionSearchResult.class);
        } catch (NotAuthorizedException e) {
            throw new UnauthorizedException(e);
        } catch (BadRequestException e) {
            throw new ApiException(e);
        }
    }
}
