
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
    "Icon",
    "IconPhrase",
    "ShortPhrase",
    "LongPhrase",
    "PrecipitationProbability",
    "ThunderstormProbability",
    "RainProbability",
    "SnowProbability",
    "IceProbability",
    "Wind",
    "WindGust",
    "TotalLiquid",
    "Rain",
    "Snow",
    "Ice",
    "HoursOfPrecipitation",
    "HoursOfRain",
    "HoursOfSnow",
    "HoursOfIce",
    "CloudCover"
})
public class Day implements Serializable
{

    @JsonProperty("Icon")
    private Integer icon;
    @JsonProperty("IconPhrase")
    private String iconPhrase;
    @JsonProperty("ShortPhrase")
    private String shortPhrase;
    @JsonProperty("LongPhrase")
    private String longPhrase;
    @JsonProperty("PrecipitationProbability")
    private Integer precipitationProbability;
    @JsonProperty("ThunderstormProbability")
    private Integer thunderstormProbability;
    @JsonProperty("RainProbability")
    private Integer rainProbability;
    @JsonProperty("SnowProbability")
    private Integer snowProbability;
    @JsonProperty("IceProbability")
    private Integer iceProbability;
    @JsonProperty("Wind")
    private Wind wind;
    @JsonProperty("WindGust")
    private WindGust windGust;
    @JsonProperty("TotalLiquid")
    private TotalLiquid totalLiquid;
    @JsonProperty("Rain")
    private Rain rain;
    @JsonProperty("Snow")
    private Snow snow;
    @JsonProperty("Ice")
    private Ice ice;
    @JsonProperty("HoursOfPrecipitation")
    private Double hoursOfPrecipitation;
    @JsonProperty("HoursOfRain")
    private Double hoursOfRain;
    @JsonProperty("HoursOfSnow")
    private Double hoursOfSnow;
    @JsonProperty("HoursOfIce")
    private Double hoursOfIce;
    @JsonProperty("CloudCover")
    private Integer cloudCover;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3723953632047220469L;

    @JsonProperty("Icon")
    public Integer getIcon() {
        return icon;
    }

    @JsonProperty("Icon")
    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    @JsonProperty("IconPhrase")
    public String getIconPhrase() {
        return iconPhrase;
    }

    @JsonProperty("IconPhrase")
    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    @JsonProperty("ShortPhrase")
    public String getShortPhrase() {
        return shortPhrase;
    }

    @JsonProperty("ShortPhrase")
    public void setShortPhrase(String shortPhrase) {
        this.shortPhrase = shortPhrase;
    }

    @JsonProperty("LongPhrase")
    public String getLongPhrase() {
        return longPhrase;
    }

    @JsonProperty("LongPhrase")
    public void setLongPhrase(String longPhrase) {
        this.longPhrase = longPhrase;
    }

    @JsonProperty("PrecipitationProbability")
    public Integer getPrecipitationProbability() {
        return precipitationProbability;
    }

    @JsonProperty("PrecipitationProbability")
    public void setPrecipitationProbability(Integer precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    @JsonProperty("ThunderstormProbability")
    public Integer getThunderstormProbability() {
        return thunderstormProbability;
    }

    @JsonProperty("ThunderstormProbability")
    public void setThunderstormProbability(Integer thunderstormProbability) {
        this.thunderstormProbability = thunderstormProbability;
    }

    @JsonProperty("RainProbability")
    public Integer getRainProbability() {
        return rainProbability;
    }

    @JsonProperty("RainProbability")
    public void setRainProbability(Integer rainProbability) {
        this.rainProbability = rainProbability;
    }

    @JsonProperty("SnowProbability")
    public Integer getSnowProbability() {
        return snowProbability;
    }

    @JsonProperty("SnowProbability")
    public void setSnowProbability(Integer snowProbability) {
        this.snowProbability = snowProbability;
    }

    @JsonProperty("IceProbability")
    public Integer getIceProbability() {
        return iceProbability;
    }

    @JsonProperty("IceProbability")
    public void setIceProbability(Integer iceProbability) {
        this.iceProbability = iceProbability;
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

    @JsonProperty("TotalLiquid")
    public TotalLiquid getTotalLiquid() {
        return totalLiquid;
    }

    @JsonProperty("TotalLiquid")
    public void setTotalLiquid(TotalLiquid totalLiquid) {
        this.totalLiquid = totalLiquid;
    }

    @JsonProperty("Rain")
    public Rain getRain() {
        return rain;
    }

    @JsonProperty("Rain")
    public void setRain(Rain rain) {
        this.rain = rain;
    }

    @JsonProperty("Snow")
    public Snow getSnow() {
        return snow;
    }

    @JsonProperty("Snow")
    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    @JsonProperty("Ice")
    public Ice getIce() {
        return ice;
    }

    @JsonProperty("Ice")
    public void setIce(Ice ice) {
        this.ice = ice;
    }

    @JsonProperty("HoursOfPrecipitation")
    public Double getHoursOfPrecipitation() {
        return hoursOfPrecipitation;
    }

    @JsonProperty("HoursOfPrecipitation")
    public void setHoursOfPrecipitation(Double hoursOfPrecipitation) {
        this.hoursOfPrecipitation = hoursOfPrecipitation;
    }

    @JsonProperty("HoursOfRain")
    public Double getHoursOfRain() {
        return hoursOfRain;
    }

    @JsonProperty("HoursOfRain")
    public void setHoursOfRain(Double hoursOfRain) {
        this.hoursOfRain = hoursOfRain;
    }

    @JsonProperty("HoursOfSnow")
    public Double getHoursOfSnow() {
        return hoursOfSnow;
    }

    @JsonProperty("HoursOfSnow")
    public void setHoursOfSnow(Double hoursOfSnow) {
        this.hoursOfSnow = hoursOfSnow;
    }

    @JsonProperty("HoursOfIce")
    public Double getHoursOfIce() {
        return hoursOfIce;
    }

    @JsonProperty("HoursOfIce")
    public void setHoursOfIce(Double hoursOfIce) {
        this.hoursOfIce = hoursOfIce;
    }

    @JsonProperty("CloudCover")
    public Integer getCloudCover() {
        return cloudCover;
    }

    @JsonProperty("CloudCover")
    public void setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
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
