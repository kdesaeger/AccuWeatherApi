package com.krds.accuweatherapi;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import org.glassfish.jersey.client.ClientProperties;

/**
 * Abstract base class for Api classes
 */
public abstract class BaseApi {

    protected final ApiSession session;
    
    protected final Client client = ClientBuilder.newClient();
    
    protected BaseApi(ApiSession session) {
        
        this.session = session;
        
        if (this.session.connectTimeout != -1) {
            client.property(ClientProperties.CONNECT_TIMEOUT,  this.session.connectTimeout);
        }
        if (this.session.readTimeout != -1) {
            client.property(ClientProperties.READ_TIMEOUT, this.session.readTimeout);
        }
        
    }
}
