package io.aquatech.dto;


import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"notifyType",
"requestId",
"deviceId",
"gatewayId",
"meter_Id",
"meter_Type",
"services"
})
public class Reading 
{

@JsonProperty("notifyType")
private String notifyType;
@JsonProperty("requestId")
private String requestId;
@JsonProperty("deviceId")
private String deviceId;
@JsonProperty("gatewayId")
private String gatewayId;
@JsonProperty("meter_Id")
private Integer meter_Id;
@JsonProperty("meter_Type")
private Integer meter_Type;
@JsonProperty("services")
private List<Service> services = new ArrayList<Service>();

@JsonProperty("notifyType")
public String getNotifyType() {
return notifyType;
}

@JsonProperty("notifyType")
public void setNotifyType(String notifyType) {
this.notifyType = notifyType;
}

@JsonProperty("requestId")
public String getRequestId() {
return requestId;
}

@JsonProperty("requestId")
public void setRequestId(String requestId) {
this.requestId = requestId;
}

@JsonProperty("deviceId")
public String getDeviceId() {
return deviceId;
}

@JsonProperty("deviceId")
public void setDeviceId(String deviceId) {
this.deviceId = deviceId;
}

@JsonProperty("gatewayId")
public String getGatewayId() {
return gatewayId;
}

@JsonProperty("gatewayId")
public void setGatewayId(String gatewayId) {
this.gatewayId = gatewayId;
}



public Integer getMeter_Id() {
	return meter_Id;
}

public void setMeter_Id(Integer meter_Id) {
	this.meter_Id = meter_Id;
}


@JsonProperty("meter_Type")
public Integer getMeter_Type() {
	return meter_Type;
}

@JsonProperty("meter_Type")
public void setMeter_Type(Integer meter_Type) {
	this.meter_Type = meter_Type;
}

@JsonProperty("services")
public List<Service> getServices() {
return services;
}

@JsonProperty("services")
public void setServices(List<Service> services) {
this.services = services;
}

@Override
public String toString() {
	return "Reading [notifyType=" + notifyType + ", requestId=" + requestId + ", deviceId=" + deviceId + ", gatewayId="
			+ gatewayId + ", meterId=" + meter_Id + ", meterType=" + meter_Type + ", services=" + services
			+ ", getNotifyType()=" + getNotifyType() + ", getRequestId()=" + getRequestId() + ", getDeviceId()="
			+ getDeviceId() + ", getGatewayId()=" + getGatewayId() + ", getMeterId()=" + getMeter_Id()
			+ ", getMeterType()=" + getMeter_Type() + ", getServices()=" + getServices() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


}