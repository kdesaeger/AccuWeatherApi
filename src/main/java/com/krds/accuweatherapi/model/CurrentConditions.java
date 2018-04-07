
package com.krds.accuweatherapi.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LocalObservationDateTime",
    "EpochTime",
    "WeatherText",
    "WeatherIcon",
    "IsDayTime",
    "Temperature",
    "RealFeelTemperature",
    "RealFeelTemperatureShade",
    "RelativeHumidity",
    "DewPoint",
    "Wind",
    "WindGust",
    "UVIndex",
    "UVIndexText",
    "Visibility",
    "ObstructionsToVisibility",
    "CloudCover",
    "Ceiling",
    "Pressure",
    "PressureTendency",
    "Past24HourTemperatureDeparture",
    "ApparentTemperature",
    "WindChillTemperature",
    "WetBulbTemperature",
    "Precip1hr",
    "PrecipitationSummary",
    "TemperatureSummary",
    "MobileLink",
    "Link"
})
public class CurrentConditions implements Serializable
{

    @JsonProperty("LocalObservationDateTime")
    private String localObservationDateTime;
    @JsonProperty("EpochTime")
    private Integer epochTime;
    @JsonProperty("WeatherText")
    private String weatherText;
    @JsonProperty("WeatherIcon")
    private Integer weatherIcon;
    @JsonProperty("IsDayTime")
    private Boolean isDayTime;
    @JsonProperty("Temperature")
    private Temperature temperature;
    @JsonProperty("RealFeelTemperature")
    private RealFeelTemperature realFeelTemperature;
    @JsonProperty("RealFeelTemperatureShade")
    private RealFeelTemperatureShade realFeelTemperatureShade;
    @JsonProperty("RelativeHumidity")
    private Integer relativeHumidity;
    @JsonProperty("DewPoint")
    private DewPoint dewPoint;
    @JsonProperty("Wind")
    private Wind wind;
    @JsonProperty("WindGust")
    private WindGust windGust;
    @JsonProperty("UVIndex")
    private Integer uVIndex;
    @JsonProperty("UVIndexText")
    private String uVIndexText;
    @JsonProperty("Visibility")
    private Visibility visibility;
    @JsonProperty("ObstructionsToVisibility")
    private String obstructionsToVisibility;
    @JsonProperty("CloudCover")
    private Integer cloudCover;
    @JsonProperty("Ceiling")
    private Ceiling ceiling;
    @JsonProperty("Pressure")
    private Pressure pressure;
    @JsonProperty("PressureTendency")
    private PressureTendency pressureTendency;
    @JsonProperty("Past24HourTemperatureDeparture")
    private Past24HourTemperatureDeparture past24HourTemperatureDeparture;
    @JsonProperty("ApparentTemperature")
    private ApparentTemperature apparentTemperature;
    @JsonProperty("WindChillTemperature")
    private WindChillTemperature windChillTemperature;
    @JsonProperty("WetBulbTemperature")
    private WetBulbTemperature wetBulbTemperature;
    @JsonProperty("Precip1hr")
    private Precip1hr precip1hr;
    @JsonProperty("PrecipitationSummary")
    private PrecipitationSummary precipitationSummary;
    @JsonProperty("TemperatureSummary")
    private TemperatureSummary temperatureSummary;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3037547678072250059L;

    @JsonProperty("LocalObservationDateTime")
    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    @JsonProperty("LocalObservationDateTime")
    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    @JsonProperty("EpochTime")
    public Integer getEpochTime() {
        return epochTime;
    }

    @JsonProperty("EpochTime")
    public void setEpochTime(Integer epochTime) {
        this.epochTime = epochTime;
    }

    @JsonProperty("WeatherText")
    public String getWeatherText() {
        return weatherText;
    }

    @JsonProperty("WeatherText")
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    @JsonProperty("WeatherIcon")
    public Integer getWeatherIcon() {
        return weatherIcon;
    }

    @JsonProperty("WeatherIcon")
    public void setWeatherIcon(Integer weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    @JsonProperty("IsDayTime")
    public Boolean getIsDayTime() {
        return isDayTime;
    }

    @JsonProperty("IsDayTime")
    public void setIsDayTime(Boolean isDayTime) {
        this.isDayTime = isDayTime;
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

    @JsonProperty("RelativeHumidity")
    public Integer getRelativeHumidity() {
        return relativeHumidity;
    }

    @JsonProperty("RelativeHumidity")
    public void setRelativeHumidity(Integer relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    @JsonProperty("DewPoint")
    public DewPoint getDewPoint() {
        return dewPoint;
    }

    @JsonProperty("DewPoint")
    public void setDewPoint(DewPoint dewPoint) {
        this.dewPoint = dewPoint;
    }

    @JsonProperty("Wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("Wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonProperty("WindGust")
    public WindGust getWindGust() {
        return windGust;
    }

    @JsonProperty("WindGust")
    public void setWindGust(WindGust windGust) {
        this.windGust = windGust;
    }

    @JsonProperty("UVIndex")
    public Integer getUVIndex() {
        return uVIndex;
    }

    @JsonProperty("UVIndex")
    public void setUVIndex(Integer uVIndex) {
        this.uVIndex = uVIndex;
    }

    @JsonProperty("UVIndexText")
    public String getUVIndexText() {
        return uVIndexText;
    }

    @JsonProperty("UVIndexText")
    public void setUVIndexText(String uVIndexText) {
        this.uVIndexText = uVIndexText;
    }

    @JsonProperty("Visibility")
    public Visibility getVisibility() {
        return visibility;
    }

    @JsonProperty("Visibility")
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("ObstructionsToVisibility")
    public String getObstructionsToVisibility() {
        return obstructionsToVisibility;
    }

    @JsonProperty("ObstructionsToVisibility")
    public void setObstructionsToVisibility(String obstructionsToVisibility) {
        this.obstructionsToVisibility = obstructionsToVisibility;
    }

    @JsonProperty("CloudCover")
    public Integer getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("CloudCover")
    public void setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
    }

    @JsonProperty("Ceiling")
    public Ceiling getCeiling() {
        return ceiling;
    }

    @JsonProperty("Ceiling")
    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    @JsonProperty("Pressure")
    public Pressure getPressure() {
        return pressure;
    }

    @JsonProperty("Pressure")
    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("PressureTendency")
    public PressureTendency getPressureTendency() {
        return pressureTendency;
    }

    @JsonProperty("PressureTendency")
    public void setPressureTendency(PressureTendency pressureTendency) {
        this.pressureTendency = pressureTendency;
    }

    @JsonProperty("Past24HourTemperatureDeparture")
    public Past24HourTemperatureDeparture getPast24HourTemperatureDeparture() {
        return past24HourTemperatureDeparture;
    }

    @JsonProperty("Past24HourTemperatureDeparture")
    public void setPast24HourTemperatureDeparture(Past24HourTemperatureDeparture past24HourTemperatureDeparture) {
        this.past24HourTemperatureDeparture = past24HourTemperatureDeparture;
    }

    @JsonProperty("ApparentTemperature")
    public ApparentTemperature getApparentTemperature() {
        return apparentTemperature;
    }

    @JsonProperty("ApparentTemperature")
    public void setApparentTemperature(ApparentTemperature apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    @JsonProperty("WindChillTemperature")
    public WindChillTemperature getWindChillTemperature() {
        return windChillTemperature;
    }

    @JsonProperty("WindChillTemperature")
    public void setWindChillTemperature(WindChillTemperature windChillTemperature) {
        this.windChillTemperature = windChillTemperature;
    }

    @JsonProperty("WetBulbTemperature")
    public WetBulbTemperature getWetBulbTemperature() {
        return wetBulbTemperature;
    }

    @JsonProperty("WetBulbTemperature")
    public void setWetBulbTemperature(WetBulbTemperature wetBulbTemperature) {
        this.wetBulbTemperature = wetBulbTemperature;
    }

    @JsonProperty("Precip1hr")
    public Precip1hr getPrecip1hr() {
        return precip1hr;
    }

    @JsonProperty("Precip1hr")
    public void setPrecip1hr(Precip1hr precip1hr) {
        this.precip1hr = precip1hr;
    }

    @JsonProperty("PrecipitationSummary")
    public PrecipitationSummary getPrecipitationSummary() {
        return precipitationSummary;
    }

    @JsonProperty("PrecipitationSummary")
    public void setPrecipitationSummary(PrecipitationSummary precipitationSummary) {
        this.precipitationSummary = precipitationSummary;
    }

    @JsonProperty("TemperatureSummary")
    public TemperatureSummary getTemperatureSummary() {
        return temperatureSummary;
    }

    @JsonProperty("TemperatureSummary")
    public void setTemperatureSummary(TemperatureSummary temperatureSummary) {
        this.temperatureSummary = temperatureSummary;
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
