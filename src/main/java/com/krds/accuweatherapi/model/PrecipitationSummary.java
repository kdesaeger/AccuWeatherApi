
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
    "Precipitation",
    "PastHour",
    "Past3Hours",
    "Past6Hours",
    "Past9Hours",
    "Past12Hours",
    "Past18Hours",
    "Past24Hours"
})
public class PrecipitationSummary implements Serializable
{

    @JsonProperty("Precipitation")
    private Precipitation precipitation;
    @JsonProperty("PastHour")
    private PastHour pastHour;
    @JsonProperty("Past3Hours")
    private Past3Hours past3Hours;
    @JsonProperty("Past6Hours")
    private Past6Hours past6Hours;
    @JsonProperty("Past9Hours")
    private Past9Hours past9Hours;
    @JsonProperty("Past12Hours")
    private Past12Hours past12Hours;
    @JsonProperty("Past18Hours")
    private Past18Hours past18Hours;
    @JsonProperty("Past24Hours")
    private Past24Hours past24Hours;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4775762577941161495L;

    @JsonProperty("Precipitation")
    public Precipitation getPrecipitation() {
        return precipitation;
    }

    @JsonProperty("Precipitation")
    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    @JsonProperty("PastHour")
    public PastHour getPastHour() {
        return pastHour;
    }

    @JsonProperty("PastHour")
    public void setPastHour(PastHour pastHour) {
        this.pastHour = pastHour;
    }

    @JsonProperty("Past3Hours")
    public Past3Hours getPast3Hours() {
        return past3Hours;
    }

    @JsonProperty("Past3Hours")
    public void setPast3Hours(Past3Hours past3Hours) {
        this.past3Hours = past3Hours;
    }

    @JsonProperty("Past6Hours")
    public Past6Hours getPast6Hours() {
        return past6Hours;
    }

    @JsonProperty("Past6Hours")
    public void setPast6Hours(Past6Hours past6Hours) {
        this.past6Hours = past6Hours;
    }

    @JsonProperty("Past9Hours")
    public Past9Hours getPast9Hours() {
        return past9Hours;
    }

    @JsonProperty("Past9Hours")
    public void setPast9Hours(Past9Hours past9Hours) {
        this.past9Hours = past9Hours;
    }

    @JsonProperty("Past12Hours")
    public Past12Hours getPast12Hours() {
        return past12Hours;
    }

    @JsonProperty("Past12Hours")
    public void setPast12Hours(Past12Hours past12Hours) {
        this.past12Hours = past12Hours;
    }

    @JsonProperty("Past18Hours")
    public Past18Hours getPast18Hours() {
        return past18Hours;
    }

    @JsonProperty("Past18Hours")
    public void setPast18Hours(Past18Hours past18Hours) {
        this.past18Hours = past18Hours;
    }

    @JsonProperty("Past24Hours")
    public Past24Hours getPast24Hours() {
        return past24Hours;
    }

    @JsonProperty("Past24Hours")
    public void setPast24Hours(Past24Hours past24Hours) {
        this.past24Hours = past24Hours;
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
