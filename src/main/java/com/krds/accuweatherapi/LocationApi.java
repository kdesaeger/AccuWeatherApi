package com.krds.accuweatherapi;

import com.krds.accuweatherapi.exceptions.ApiException;
import com.krds.accuweatherapi.exceptions.UnauthorizedException;
import com.krds.accuweatherapi.model.GeoPositionSearchResult;
import java.util.Optional;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Wrapper class around the AccuWeather Locations API
 * @see https://developer.accuweather.com/accuweather-locations-api/apis
 */
public class LocationApi extends BaseApi {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(LocationApi.class);
    
    private String BASE_URL = "/locations/v1";

    protected LocationApi(ApiSession session) {
        super(session);
        this.BASE_URL = this.session.URL + BASE_URL;
    }
    
    /**
     * Returns information about a specific location
     * @param lat   The latitude
     * @param lng   The longitude
     * @return Location information
     * @throws UnauthorizedException When the session API key is rejected
     * @throws ApiException In case of a problem with the AccuWeather Rest API call
     */
    public Optional<GeoPositionSearchResult> geoPosition(double lat, double lng) throws UnauthorizedException, ApiException {
        
        String url = String.format("%s/cities/geoposition/search.json?apikey=%s&language=%s&q=%s,%s", BASE_URL, this.session.apiKey, 
                this.session.language, Double.toString(lat), Double.toString(lng));
        
        LOGGER.debug("Geolocation URL: {}", url);
      
        try {
            return Optional.ofNullable(client.target(url).request(MediaType.APPLICATION_JSON).get(GeoPositionSearchResult.class));
        } catch (NotAuthorizedException e) {
            throw new UnauthorizedException(e);
        } catch (ClientErrorException e) {
            throw new ApiException(e);
        }
    }
}
