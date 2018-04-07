
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
    "Name",
    "ID",
    "Ascending",
    "LocalDateTime",
    "EpochDateTime",
    "Value",
    "Category",
    "CategoryValue",
    "Text",
    "MobileLink",
    "Link"
})
public class Index implements Serializable
{

    @JsonProperty("Name")
    private String name;
    @JsonProperty("ID")
    private Integer iD;
    @JsonProperty("Ascending")
    private Boolean ascending;
    @JsonProperty("LocalDateTime")
    private String localDateTime;
    @JsonProperty("EpochDateTime")
    private Integer epochDateTime;
    @JsonProperty("Value")
    private Double value;
    @JsonProperty("Category")
    private String category;
    @JsonProperty("CategoryValue")
    private Integer categoryValue;
    @JsonProperty("Text")
    private String text;
    @JsonProperty("MobileLink")
    private String mobileLink;
    @JsonProperty("Link")
    private String link;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1942638856357666848L;

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ID")
    public Integer getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(Integer iD) {
        this.iD = iD;
    }

    @JsonProperty("Ascending")
    public Boolean getAscending() {
        return ascending;
    }

    @JsonProperty("Ascending")
    public void setAscending(Boolean ascending) {
        this.ascending = ascending;
    }

    @JsonProperty("LocalDateTime")
    public String getLocalDateTime() {
        return localDateTime;
    }

    @JsonProperty("LocalDateTime")
    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    @JsonProperty("EpochDateTime")
    public Integer getEpochDateTime() {
        return epochDateTime;
    }

    @JsonProperty("EpochDateTime")
    public void setEpochDateTime(Integer epochDateTime) {
        this.epochDateTime = epochDateTime;
    }

    @JsonProperty("Value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("Value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonProperty("Category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("CategoryValue")
    public Integer getCategoryValue() {
        return categoryValue;
    }

    @JsonProperty("CategoryValue")
    public void setCategoryValue(Integer categoryValue) {
        this.categoryValue = categoryValue;
    }

    @JsonProperty("Text")
    public String getText() {
        return text;
    }

    @JsonProperty("Text")
    public void setText(String text) {
        this.text = text;
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
