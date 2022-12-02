package io.aquatech.dto.alarms;

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
"continuousTimeThreshold",
"averageInstantFlow",
"maxInstantFlow",
"minInstantFlow"
})
public class AlarmDetailNode {

@JsonProperty("continuousTimeThreshold")
private Integer continuousTimeThreshold;
@JsonProperty("averageInstantFlow")
private Double averageInstantFlow;
@JsonProperty("maxInstantFlow")
private Double maxInstantFlow;
@JsonProperty("minInstantFlow")
private Double minInstantFlow;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("continuousTimeThreshold")
public Integer getContinuousTimeThreshold() {
return continuousTimeThreshold;
}

@JsonProperty("continuousTimeThreshold")
public void setContinuousTimeThreshold(Integer continuousTimeThreshold) {
this.continuousTimeThreshold = continuousTimeThreshold;
}

@JsonProperty("averageInstantFlow")
public Double getAverageInstantFlow() {
return averageInstantFlow;
}

@JsonProperty("averageInstantFlow")
public void setAverageInstantFlow(Double averageInstantFlow) {
this.averageInstantFlow = averageInstantFlow;
}

@JsonProperty("maxInstantFlow")
public Double getMaxInstantFlow() {
return maxInstantFlow;
}

@JsonProperty("maxInstantFlow")
public void setMaxInstantFlow(Double maxInstantFlow) {
this.maxInstantFlow = maxInstantFlow;
}

@JsonProperty("minInstantFlow")
public Double getMinInstantFlow() {
return minInstantFlow;
}

@JsonProperty("minInstantFlow")
public void setMinInstantFlow(Double minInstantFlow) {
this.minInstantFlow = minInstantFlow;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

public void setAdditionalProperties(Map<String, Object> additionalProperties) {
	this.additionalProperties = additionalProperties;
}



}