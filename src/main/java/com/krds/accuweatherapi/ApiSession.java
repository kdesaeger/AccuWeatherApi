package com.krds.accuweatherapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Encapsulates an API session with the AccuWeather Rest API. Use a Builder to create a session.
 */
public final class ApiSession {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ApiSession.class);
    
    protected String URL;
    protected String apiKey;
    protected int connectTimeout = -1;
    protected int readTimeout = -1;
    protected String language = "en-us";

    private ApiSession(String URL, String apiKey, int connectTimeout, int readTimeout, String language) {
        this.URL = URL;
        this.apiKey = apiKey;
        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
        this.language = language;
        LOGGER.info("AccuWeather session info: {}", this.toString());
    }
    
    /**
     * Returns a LocationApi instance to use for making calls to the Locations API
     * @return The LocationApi instance
     */
    public LocationApi getLocationApi() {        
        return new LocationApi(this);
    }
    
    /**
     * Returns a CurrentConditionsApi instance to use for making calls to the Current Conditions API
     * @param locationKey   The AccuWeather location key to use, as returned from the Locations API
     * @return The CurrentConditionsApi instance
     */
    public CurrentConditionsApi getCurrentConditionsApi(String locationKey) {        
        return new CurrentConditionsApi(this, locationKey);
    }
    
    /**
     * Returns a IndicesApi instance to use for making calls to the Indices API
     * @param locationKey   The AccuWeather location key to use, as returned from the Locations API
     * @return The IndicesApi instance
     */
    public IndicesApi getIndicesApi(String locationKey) {        
        return new IndicesApi(this, locationKey);
    }
    
    /**
     * Returns a ForecastApi instance to use for making calls to the Forecasts API
     * @param locationKey   The AccuWeather location key to use, as returned from the Locations API
     * @return The ForecastApi instance
     */
    public ForecastApi getForecastApi(String locationKey) {        
        return new ForecastApi(this, locationKey);
    }

    @Override
    public String toString() {
        return "ApiSession{" + "URL=" + URL + ", apiKey=" + apiKey + ", connectTimeout=" + connectTimeout + ", readTimeout=" + readTimeout + ", language=" + language + '}';
    }
    
    /**
     * Builder to create an AccuWeather ApiSession instance.
     */
    public static class Builder {
        
        private String URL = "http://dataservice.accuweather.com";
        private final String apiKey;
        private int connectTimeout = -1;
        private int readTimeout = -1;
        private String language = "en-us";
        
        /**
         * Constructor
         * @param apiKey    The AccuWeather API key to use for the session 
         */
        public Builder(String apiKey) {
            this.apiKey = apiKey;
        } 
        
        /**
         * Builds the ApiSession instance using the configured parameters
         * @return The ApiSession instance
         */
        public ApiSession build() {
            return new ApiSession(URL, apiKey, connectTimeout, readTimeout, language);
        }
        
        /**
         * Sets the AccuWeather API base URL. Default value: <b>http://dataservice.accuweather.com</b>
         * @param URL   The base URL to use for AccuWeather API calls
         * @return The Builder instance
         */
        public Builder url(String URL) {
            this.URL = URL;
            return this;
        }
        
        /**
         * Sets the connection timeout
         * @param timeout   The timeout in milliseconds
         * @return The Builder instance
         */
        public Builder connectTimeout(int timeout) {
            this.connectTimeout = timeout;
            return this;
        }
        
        /**
         * Sets the read timeout
         * @param timeout   The timeout in milliseconds
         * @return The Builder instance
         */
        public Builder readTimeout(int timeout) {
            this.readTimeout = timeout;
            return this;
        }
        
        /**
         * Sets the language to use for localized names returned from AccuWeather. Defaults to "en-us"
         * @param lang  The locale identifier
         * @return The Builder instance
         */
        public Builder language(String lang) {
            this.language = lang;
            return this;
        }
    }
}
