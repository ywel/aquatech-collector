package io.aquatech.billing;

import java.util.HashMap;
import java.util.List;
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
"serviceType",
"eventTime",
"data"
})
public class Services {

@JsonProperty("serviceId")
private String serviceId;
@JsonProperty("serviceType")
private String serviceType;
@JsonProperty("eventTime")
private String eventTime;
@JsonProperty("data")
private List<Datum> data = null;

@JsonProperty("serviceId")
public String getServiceId() {
return serviceId;
}

@JsonProperty("serviceId")
public void setServiceId(String serviceId) {
this.serviceId = serviceId;
}

@JsonProperty("serviceType")
public String getServiceType() {
return serviceType;
}

@JsonProperty("serviceType")
public void setServiceType(String serviceType) {
this.serviceType = serviceType;
}

@JsonProperty("eventTime")
public String getEventTime() {
return eventTime;
}

@JsonProperty("eventTime")
public void setEventTime(String eventTime) {
this.eventTime = eventTime;
}

@JsonProperty("data")
public List<Datum> getData() {
return data;
}

@JsonProperty("data")
public void setData(List<Datum> data) {
this.data = data;
}



}