package io.aquatech.dto.alarms;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
"alarmName",
"timestamp",
"status",
"imei",
"originalData",
"cryptographicData",
"alarmDetail",
"alarmDetailNode"
})
public class ServiceData {

@JsonProperty("alarmName")
private String alarmName;
@JsonProperty("timestamp")
private String timestamp;
@JsonProperty("status")
private Integer status;
@JsonProperty("imei")
private Object imei;
@JsonProperty("originalData")
private String originalData;
@JsonProperty("cryptographicData")
private Object cryptographicData;
@JsonProperty("alarmDetail")
private String alarmDetail;
@JsonProperty("alarmDetailNode")
private AlarmDetailNode alarmDetailNode;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("alarmName")
public String getAlarmName() {
return alarmName;
}

@JsonProperty("alarmName")
public void setAlarmName(String alarmName) {
this.alarmName = alarmName;
}

@JsonProperty("timestamp")
public String getTimestamp() {
return timestamp;
}

@JsonProperty("timestamp")
public void setTimestamp(String timestamp) {
this.timestamp = timestamp;
}

@JsonProperty("status")
public Integer getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(Integer status) {
this.status = status;
}

@JsonProperty("imei")
public Object getImei() {
return imei;
}

@JsonProperty("imei")
public void setImei(Object imei) {
this.imei = imei;
}

@JsonProperty("originalData")
public String getOriginalData() {
return originalData;
}

@JsonProperty("originalData")
public void setOriginalData(String originalData) {
this.originalData = originalData;
}

@JsonProperty("cryptographicData")
public Object getCryptographicData() {
return cryptographicData;
}

@JsonProperty("cryptographicData")
public void setCryptographicData(Object cryptographicData) {
this.cryptographicData = cryptographicData;
}

@JsonProperty("alarmDetail")
public String getAlarmDetail() {
return alarmDetail;
}

@JsonProperty("alarmDetail")
public void setAlarmDetail(String alarmDetail) {
this.alarmDetail = alarmDetail;
}

@JsonProperty("alarmDetailNode")
public AlarmDetailNode getAlarmDetailNode() {
return alarmDetailNode;
}

@JsonProperty("alarmDetailNode")
public void setAlarmDetailNode(AlarmDetailNode alarmDetailNode) {
this.alarmDetailNode = alarmDetailNode;
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