package com.krds.accuweatherapi;

public final class ApiSession {
    
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
    }
    
    public LocationApi getLocationApi() {
        return new LocationApi(this);
    }
    
    public CurrentConditionsApi getCurrentConditionsApi(String locationKey) {
        return new CurrentConditionsApi(this, locationKey);
    }
    
   
    public static class Builder {
        
        private String URL = "http://dataservice.accuweather.com";
        private String apiKey;
        private int connectTimeout = -1;
        private int readTimeout = -1;
        private String language = "en-us";
        
        public Builder(String apiKey) {
            this.apiKey = apiKey;
        } 
        
        public ApiSession build() {
            return new ApiSession(URL, apiKey, connectTimeout, readTimeout, language);
        }
        
        public Builder url(String URL) {
            this.URL = URL;
            return this;
        }
        
        public Builder withApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        
        public Builder connectTimeout(int timeout) {
            this.connectTimeout = timeout;
            return this;
        }
        
        public Builder readTimeout(int timeout) {
            this.readTimeout = timeout;
            return this;
        }
        
        public Builder language(String lang) {
            this.language = lang;
            return this;
        }
    }
}