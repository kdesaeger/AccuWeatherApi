package com.krds.accuweatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoPositionSearchResult {

    @JsonProperty("Key")
    private String key;
    
    @JsonProperty("LocalizedName")
    private String name;
    
    @JsonProperty("PrimaryPostalCode")
    private String postalCode;
    
    @JsonProperty("Country")
    private Country country;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "GeoPositionSearchResult{" + "key=" + key + ", name=" + name + ", postalCode=" + postalCode + ", country=" + country + '}';
    }

    
    
}
