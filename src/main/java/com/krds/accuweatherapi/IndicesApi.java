package com.krds.accuweatherapi;

import com.krds.accuweatherapi.exceptions.ApiException;
import com.krds.accuweatherapi.exceptions.UnauthorizedException;
import com.krds.accuweatherapi.model.CurrentConditionsList;
import com.krds.accuweatherapi.model.GeoPositionSearchResult;
import com.krds.accuweatherapi.model.Indices;
import java.util.Optional;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndicesApi extends BaseApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndicesApi.class);
   
    private String BASE_URL = "/indices/v1/daily";
    private String locationKey = "";
    
    public IndicesApi(ApiSession session, String locationKey) {
        super(session);
        this.BASE_URL = new StringBuilder(this.session.URL).append(BASE_URL).toString();
        this.locationKey = locationKey;
    }
    
    public Optional<Indices> getIndicesForGroup(int groupId) throws UnauthorizedException, ApiException {
        
        String url = String.format("%s/1day/%s/groups/%d.json?details=true&apikey=%s&language=%s", this.BASE_URL, 
                this.locationKey, groupId, this.session.apiKey, this.session.language);
        
        LOGGER.debug("getIndicesForGroup URL: {}", url);
        
        try {
            return Optional.ofNullable(client.target(url).request(MediaType.APPLICATION_JSON).get(Indices.class));
        } catch (NotAuthorizedException e) {
            throw new UnauthorizedException(e);
        } catch (BadRequestException e) {
            throw new ApiException(e);
        }
    }

}
