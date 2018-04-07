
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
    "Heating",
    "Cooling"
})
public class DegreeDaySummary implements Serializable
{

    @JsonProperty("Heating")
    private Heating heating;
    @JsonProperty("Cooling")
    private Cooling cooling;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7422261487311975394L;

    @JsonProperty("Heating")
    public Heating getHeating() {
        return heating;
    }

    @JsonProperty("Heating")
    public void setHeating(Heating heating) {
        this.heating = heating;
    }

    @JsonProperty("Cooling")
    public Cooling getCooling() {
        return cooling;
    }

    @JsonProperty("Cooling")
    public void setCooling(Cooling cooling) {
        this.cooling = cooling;
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
