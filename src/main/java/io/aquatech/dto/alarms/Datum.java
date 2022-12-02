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
"serviceId",
"serviceData"
})
public class Datum {

@JsonProperty("serviceId")
private String serviceId;
@JsonProperty("serviceData")
private ServiceData serviceData;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("serviceId")
public String getServiceId() {
return serviceId;
}

@JsonProperty("serviceId")
public void setServiceId(String serviceId) {
this.serviceId = serviceId;
}

@JsonProperty("serviceData")
public ServiceData getServiceData() {
return serviceData;
}

@JsonProperty("serviceData")
public void setServiceData(ServiceData serviceData) {
this.serviceData = serviceData;
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