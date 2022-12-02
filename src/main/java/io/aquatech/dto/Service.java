package io.aquatech.dto;


import java.io.Serializable;
import java.util.Date;
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
public class Service implements Serializable
{

@JsonProperty("serviceId")
private String serviceId;
@JsonProperty("serviceType")
private String serviceType;
@JsonProperty("eventTime")
private Date eventTime;
@JsonProperty("data")

private Data data;
private final static long serialVersionUID = -4634946648664826100L;

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
public Date getEventTime() {
return eventTime;
}

@JsonProperty("eventTime")
public void setEventTime(Date eventTime) {
this.eventTime = eventTime;
}

@JsonProperty("data")
public Data getData() {
return data;
}

@JsonProperty("data")
public void setData(Data data) {
this.data = data;
}

@Override
public String toString() {
	return "Service [serviceId=" + serviceId + ", serviceType=" + serviceType + ", eventTime=" + eventTime + ", data="
			+ data + "]";
}





}