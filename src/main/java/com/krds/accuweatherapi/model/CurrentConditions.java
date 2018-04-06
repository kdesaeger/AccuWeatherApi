package com.krds.accuweatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentConditions {

    @JsonProperty("LocalObservationDateTime")
    private String localObservationDateTime;
    
    @JsonProperty("WeatherText")
    private String weatherText;

    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    @Override
    public String toString() {
        return "CurrentConditions{" + "localObservationDateTime=" + localObservationDateTime + ", weatherText=" + weatherText + '}';
    }
    
    
}
