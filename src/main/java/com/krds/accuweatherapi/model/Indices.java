package com.krds.accuweatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Indices extends ArrayList<Index> {
  
}
