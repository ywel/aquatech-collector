package io.aquatech.dto.alarms;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"meterCode",
"alarmType",
"timeStamp",
"alarmStatus"
})
public class AlarmTelemetry {
@JsonProperty("meterCode")
private String meterCode;
@JsonProperty("alarmType")
private String alarmType;
@JsonProperty("timeStamp")
private String timeStamp;
@JsonProperty("alarmStatus")
private Boolean alarmStatus;

@JsonProperty("meterCode")
public String getMeterCode() {
return meterCode;
}

@JsonProperty("meterCode")
public void setMeterCode(String meterCode) {
this.meterCode = meterCode;
}

@JsonProperty("alarmType")
public String getAlarmType() {
return alarmType;
}

@JsonProperty("alarmType")
public void setAlarmType(String alarmType) {
this.alarmType = alarmType;
}

@JsonProperty("timeStamp")
public String getTimeStamp() {
return timeStamp;
}

@JsonProperty("timeStamp")
public void setTimeStamp(String timeStamp) {
this.timeStamp = timeStamp;
}

@JsonProperty("alarmStatus")
public Boolean getAlarmStatus() {
return alarmStatus;
}

@JsonProperty("alarmStatus")
public void setAlarmStatus(Boolean alarmStatus) {
this.alarmStatus = alarmStatus;
}



}