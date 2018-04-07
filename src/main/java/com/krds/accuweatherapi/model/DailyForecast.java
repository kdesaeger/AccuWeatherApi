
package com.krds.accuweatherapi.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Date",
    "EpochDate",
    "Sun",
    "Moon",
    "Temperature",
    "RealFeelTemperature",
    "RealFeelTemperatureShade",
    "HoursOfSun",
    "DegreeDaySummary",
    "AirAndPollen",
    "Day",
    "Night",
    "Sources",
    "MobileLink",
    "Link"
})
public class DailyForecast implements Serializable
{

    @JsonProperty("Date")
    private String date;
    @JsonProperty("EpochDate")
    private Integer epochDate;
    @JsonProperty("Sun")
    private Sun sun;
    @JsonProperty("Moon")
    private Moon moon;
    @JsonProperty("Temperature")
    private Temperature temperature;
    @JsonProperty("RealFeelTemperature")
    private RealFeelTemperature realFeelTemperature;
    @JsonProperty("RealFeelTemperatureShade")
    private RealFeelTemperatureShade realFeelTemperatureShade;
    @JsonProperty("HoursOfSun")
    private Double hoursOfSun;
    @JsonProperty("DegreeDaySummary")
    private DegreeDaySummary degreeDaySummary;
    @JsonProperty("AirAndPollen")
    private List<AirAndPollen> airAndPollen = null;
    @JsonProperty("Day")
    private Day day;
    @JsonProperty("Night")
    private Night night;
    @JsonProperty("Sources")
    private List<String> sources = null;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8896601372238442198L;

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("EpochDate")
    public Integer getEpochDate() {
        return epochDate;
    }

    @JsonProperty("EpochDate")
    public void setEpochDate(Integer epochDate) {
        this.epochDate = epochDate;
    }

    @JsonProperty("Sun")
    public Sun getSun() {
        return sun;
    }

    @JsonProperty("Sun")
    public void setSun(Sun sun) {
        this.sun = sun;
    }

    @JsonProperty("Moon")
    public Moon getMoon() {
        return moon;
    }

    @JsonProperty("Moon")
    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("RealFeelTemperature")
    public RealFeelTemperature getRealFeelTemperature() {
        return realFeelTemperature;
    }

    @JsonProperty("RealFeelTemperature")
    public void setRealFeelTemperature(RealFeelTemperature realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
    }

    @JsonProperty("RealFeelTemperatureShade")
    public RealFeelTemperatureShade getRealFeelTemperatureShade() {
        return realFeelTemperatureShade;
    }

    @JsonProperty("RealFeelTemperatureShade")
    public void setRealFeelTemperatureShade(RealFeelTemperatureShade realFeelTemperatureShade) {
        this.realFeelTemperatureShade = realFeelTemperatureShade;
    }

    @JsonProperty("HoursOfSun")
    public Double getHoursOfSun() {
        return hoursOfSun;
    }

    @JsonProperty("HoursOfSun")
    public void setHoursOfSun(Double hoursOfSun) {
        this.hoursOfSun = hoursOfSun;
    }

    @JsonProperty("DegreeDaySummary")
    public DegreeDaySummary getDegreeDaySummary() {
        return degreeDaySummary;
    }

    @JsonProperty("DegreeDaySummary")
    public void setDegreeDaySummary(DegreeDaySummary degreeDaySummary) {
        this.degreeDaySummary = degreeDaySummary;
    }

    @JsonProperty("AirAndPollen")
    public List<AirAndPollen> getAirAndPollen() {
        return airAndPollen;
    }

    @JsonProperty("AirAndPollen")
    public void setAirAndPollen(List<AirAndPollen> airAndPollen) {
        this.airAndPollen = airAndPollen;
    }

    @JsonProperty("Day")
    public Day getDay() {
        return day;
    }

    @JsonProperty("Day")
    public void setDay(Day day) {
        this.day = day;
    }

    @JsonProperty("Night")
    public Night getNight() {
        return night;
    }

    @JsonProperty("Night")
    public void setNight(Night night) {
        this.night = night;
    }

    @JsonProperty("Sources")
    public List<String> getSources() {
        return sources;
    }

    @JsonProperty("Sources")
    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    @JsonProperty("MobileLink")
    public String getMobileLink() {
        return mobileLink;
    }

    @JsonProperty("MobileLink")
    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    @JsonProperty("Link")
    public String getLink() {
        return link;
    }

    @JsonProperty("Link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
