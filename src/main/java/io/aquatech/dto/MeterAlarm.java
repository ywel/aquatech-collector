package io.aquatech.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"meterCode",
"lowFlowAlarm",
"highFlowAlarm",
"tamperAlarm",
"lowBatteryAlarm",
"batteryRunoutAlarm",
"highInternalTemperature",
"reverseFlowAlarm",
"highPressureAlarm",
"lowPressureAlarm",
"highTemperatureAlarm",
"lowTemperatureAlarm",
"innerErrorAlarm",
"storageFault",
"lowReverseFlowAlarm",
"highReverseFlowAlarm",
"communicationAlarm",
"psmAlarm",
"transactionTime"
})
public class MeterAlarm {

@JsonProperty("meterCode")
private String meterCode;
@JsonProperty("lowFlowAlarm")
private int lowFlowAlarm;
@JsonProperty("highFlowAlarm")
private int highFlowAlarm;
@JsonProperty("tamperAlarm")
private int tamperAlarm;
@JsonProperty("lowBatteryAlarm")
private int lowBatteryAlarm;
@JsonProperty("batteryRunoutAlarm")
private int batteryRunoutAlarm;
@JsonProperty("highInternalTemperature")
private int highInternalTemperature;
@JsonProperty("reverseFlowAlarm")
private int reverseFlowAlarm;
@JsonProperty("highPressureAlarm")
private int highPressureAlarm;
@JsonProperty("lowPressureAlarm")
private int lowPressureAlarm;
@JsonProperty("highTemperatureAlarm")
private int highTemperatureAlarm;
@JsonProperty("lowTemperatureAlarm")
private int lowTemperatureAlarm;
@JsonProperty("innerErrorAlarm")
private int innerErrorAlarm;
@JsonProperty("storageFault")
private int storageFault;
@JsonProperty("lowReverseFlowAlarm")
private int lowReverseFlowAlarm;
@JsonProperty("highReverseFlowAlarm")
private int highReverseFlowAlarm;
@JsonProperty("communicationAlarm")
private int communicationAlarm;
@JsonProperty("psmAlarm")
private int psmAlarm;
@JsonProperty("transactionTime")
private Date transactionTime;


@JsonProperty("meterCode")
public String getMeterCode() {
return meterCode;
}

@JsonProperty("meterCode")
public void setMeterCode(String meterCode) {
this.meterCode = meterCode;
}

@JsonProperty("lowFlowAlarm")
public int getLowFlowAlarm() {
return lowFlowAlarm;
}

@JsonProperty("lowFlowAlarm")
public void setLowFlowAlarm(int lowFlowAlarm) {
this.lowFlowAlarm = lowFlowAlarm;
}

@JsonProperty("highFlowAlarm")
public int getHighFlowAlarm() {
return highFlowAlarm;
}

@JsonProperty("highFlowAlarm")
public void setHighFlowAlarm(int highFlowAlarm) {
this.highFlowAlarm = highFlowAlarm;
}

@JsonProperty("tamperAlarm")
public int getTamperAlarm() {
return tamperAlarm;
}

@JsonProperty("tamperAlarm")
public void setTamperAlarm(int tamperAlarm) {
this.tamperAlarm = tamperAlarm;
}

@JsonProperty("lowBatteryAlarm")
public int getLowBatteryAlarm() {
return lowBatteryAlarm;
}

@JsonProperty("lowBatteryAlarm")
public void setLowBatteryAlarm(int lowBatteryAlarm) {
this.lowBatteryAlarm = lowBatteryAlarm;
}

@JsonProperty("batteryRunoutAlarm")
public int getBatteryRunoutAlarm() {
return batteryRunoutAlarm;
}

@JsonProperty("batteryRunoutAlarm")
public void setBatteryRunoutAlarm(int batteryRunoutAlarm) {
this.batteryRunoutAlarm = batteryRunoutAlarm;
}

@JsonProperty("highInternalTemperature")
public int getHighInternalTemperature() {
return highInternalTemperature;
}

@JsonProperty("highInternalTemperature")
public void setHighInternalTemperature(int highInternalTemperature) {
this.highInternalTemperature = highInternalTemperature;
}

@JsonProperty("reverseFlowAlarm")
public int getReverseFlowAlarm() {
return reverseFlowAlarm;
}

@JsonProperty("reverseFlowAlarm")
public void setReverseFlowAlarm(int reverseFlowAlarm) {
this.reverseFlowAlarm = reverseFlowAlarm;
}

@JsonProperty("highPressureAlarm")
public int getHighPressureAlarm() {
return highPressureAlarm;
}

@JsonProperty("highPressureAlarm")
public void setHighPressureAlarm(int highPressureAlarm) {
this.highPressureAlarm = highPressureAlarm;
}

@JsonProperty("lowPressureAlarm")
public int getLowPressureAlarm() {
return lowPressureAlarm;
}

@JsonProperty("lowPressureAlarm")
public void setLowPressureAlarm(int lowPressureAlarm) {
this.lowPressureAlarm = lowPressureAlarm;
}

@JsonProperty("highTemperatureAlarm")
public int getHighTemperatureAlarm() {
return highTemperatureAlarm;
}

@JsonProperty("highTemperatureAlarm")
public void setHighTemperatureAlarm(int highTemperatureAlarm) {
this.highTemperatureAlarm = highTemperatureAlarm;
}

@JsonProperty("lowTemperatureAlarm")
public int getLowTemperatureAlarm() {
return lowTemperatureAlarm;
}

@JsonProperty("lowTemperatureAlarm")
public void setLowTemperatureAlarm(int lowTemperatureAlarm) {
this.lowTemperatureAlarm = lowTemperatureAlarm;
}

@JsonProperty("innerErrorAlarm")
public int getInnerErrorAlarm() {
return innerErrorAlarm;
}

@JsonProperty("innerErrorAlarm")
public void setInnerErrorAlarm(int innerErrorAlarm) {
this.innerErrorAlarm = innerErrorAlarm;
}

@JsonProperty("storageFault")
public int getStorageFault() {
return storageFault;
}

@JsonProperty("storageFault")
public void setStorageFault(int storageFault) {
this.storageFault = storageFault;
}

@JsonProperty("lowReverseFlowAlarm")
public int getLowReverseFlowAlarm() {
return lowReverseFlowAlarm;
}

@JsonProperty("lowReverseFlowAlarm")
public void setLowReverseFlowAlarm(int lowReverseFlowAlarm) {
this.lowReverseFlowAlarm = lowReverseFlowAlarm;
}

@JsonProperty("highReverseFlowAlarm")
public int getHighReverseFlowAlarm() {
return highReverseFlowAlarm;
}

@JsonProperty("highReverseFlowAlarm")
public void setHighReverseFlowAlarm(int highReverseFlowAlarm) {
this.highReverseFlowAlarm = highReverseFlowAlarm;
}

@JsonProperty("communicationAlarm")
public int getCommunicationAlarm() {
return communicationAlarm;
}

@JsonProperty("communicationAlarm")
public void setCommunicationAlarm(int communicationAlarm) {
this.communicationAlarm = communicationAlarm;
}

@JsonProperty("psmAlarm")
public int getPsmAlarm() {
return psmAlarm;
}

@JsonProperty("psmAlarm")
public void setPsmAlarm(int psmAlarm) {
this.psmAlarm = psmAlarm;
}

@JsonProperty("transactionTime")
public Date getTransactionTime() {
return transactionTime;
}

@JsonProperty("transactionTime")
public void setTransactionTime(Date transactionTime) {
this.transactionTime = transactionTime;
}

@Override
public String toString() {
	return "MeterAlarm [meterCode=" + meterCode + ", lowFlowAlarm=" + lowFlowAlarm + ", highFlowAlarm=" + highFlowAlarm
			+ ", tamperAlarm=" + tamperAlarm + ", lowBatteryAlarm=" + lowBatteryAlarm + ", batteryRunoutAlarm="
			+ batteryRunoutAlarm + ", highInternalTemperature=" + highInternalTemperature + ", reverseFlowAlarm="
			+ reverseFlowAlarm + ", highPressureAlarm=" + highPressureAlarm + ", lowPressureAlarm=" + lowPressureAlarm
			+ ", highTemperatureAlarm=" + highTemperatureAlarm + ", lowTemperatureAlarm=" + lowTemperatureAlarm
			+ ", innerErrorAlarm=" + innerErrorAlarm + ", storageFault=" + storageFault + ", lowReverseFlowAlarm="
			+ lowReverseFlowAlarm + ", highReverseFlowAlarm=" + highReverseFlowAlarm + ", communicationAlarm="
			+ communicationAlarm + ", psmAlarm=" + psmAlarm + ", transactionTime=" + transactionTime + "]";
}






}