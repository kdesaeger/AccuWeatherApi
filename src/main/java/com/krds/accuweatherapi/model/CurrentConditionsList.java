package com.krds.accuweatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentConditionsList extends ArrayList<CurrentConditions> {
  
}
