
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
    "Past6HourRange",
    "Past12HourRange",
    "Past24HourRange"
})
public class TemperatureSummary implements Serializable
{

    @JsonProperty("Past6HourRange")
    private Past6HourRange past6HourRange;
    @JsonProperty("Past12HourRange")
    private Past12HourRange past12HourRange;
    @JsonProperty("Past24HourRange")
    private Past24HourRange past24HourRange;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3396203709342422386L;

    @JsonProperty("Past6HourRange")
    public Past6HourRange getPast6HourRange() {
        return past6HourRange;
    }

    @JsonProperty("Past6HourRange")
    public void setPast6HourRange(Past6HourRange past6HourRange) {
        this.past6HourRange = past6HourRange;
    }

    @JsonProperty("Past12HourRange")
    public Past12HourRange getPast12HourRange() {
        return past12HourRange;
    }

    @JsonProperty("Past12HourRange")
    public void setPast12HourRange(Past12HourRange past12HourRange) {
        this.past12HourRange = past12HourRange;
    }

    @JsonProperty("Past24HourRange")
    public Past24HourRange getPast24HourRange() {
        return past24HourRange;
    }

    @JsonProperty("Past24HourRange")
    public void setPast24HourRange(Past24HourRange past24HourRange) {
        this.past24HourRange = past24HourRange;
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
