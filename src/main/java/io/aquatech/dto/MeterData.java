package io.aquatech.dto;

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
"meterCode",
"imsi",
"accumulatedFlowRate",
"daillyFowRate",
"waterTemperature",
"bateryVoltage",
"signalStrength",
"timeTaken",
"waterPressure",
"temperature"
})
public class MeterData {

@JsonProperty("meterCode")
private String meterCode;
@JsonProperty("imsi")
private String imsi;
@JsonProperty("accumulatedFlowRate")
private String accumulatedFlowRate;
@JsonProperty("daillyFowRate")
private String daillyFowRate;
@JsonProperty("waterTemperature")
private String waterTemperature;
@JsonProperty("bateryVoltage")
private String bateryVoltage;
@JsonProperty("signalStrength")
private String signalStrength;
@JsonProperty("timeTaken")
private String timeTaken;
@JsonProperty("waterPressure")
private String waterPressure;

private String cumulativeWorkTime;
private String dailyReverseFlow;
private String dailyReverseUseWaterTime;
private String dailyUseWaterTime;
private String flowIntervral;
private String internalTemperature;
private String intervalFlow;
private String lowestFlowRateTime;
private String lowestReverseFlowRate;
private String lowestReverseFlowRateTime;
private String negativeCumulativeFlow;
private String peakFlowRateTime;
private String peakReverseFlowRate;
private String peakReverseFlowRateTime;
private String positiveCumulativeFlow;
private String pressInteveral;
private String pressure;
private String reverseCumulativeWorkTime;
private String reverseFlowIntervral;
private String reverseIntervalFlow;
private String temperatureInterval;






private MeterAlarm  meterAlarm;


public MeterData() {
	
}

public MeterData(String meterCode, String imsi) {
	this.imsi = imsi;
	this.meterCode = meterCode;
}

public MeterData(String meterCode, String imsi, String accumulatedFlowRate, String daillyFowRate,
		String waterTemperature, String bateryVoltage, String signalStrength, String timeTaken, String waterPressure,
		MeterAlarm meterAlarm) {
	super();
	this.meterCode = meterCode;
	this.imsi = imsi;
	this.accumulatedFlowRate = accumulatedFlowRate;
	this.daillyFowRate = daillyFowRate;
	this.waterTemperature = waterTemperature;
	this.bateryVoltage = bateryVoltage;
	this.signalStrength = signalStrength;
	this.timeTaken = timeTaken;
	this.waterPressure = waterPressure;
	this.meterAlarm = meterAlarm;
}

@JsonProperty("meterCode")
public String getMeterCode() {
return meterCode;
}

@JsonProperty("meterCode")
public void setMeterCode(String meterCode) {
this.meterCode = meterCode;
}

@JsonProperty("imsi")
public String getImsi() {
return imsi;
}

@JsonProperty("imsi")
public void setImsi(String imsi) {
this.imsi = imsi;
}

@JsonProperty("accumulatedFlowRate")
public String getAccumulatedFlowRate() {
return accumulatedFlowRate;
}

@JsonProperty("accumulatedFlowRate")
public void setAccumulatedFlowRate(String accumulatedFlowRate) {
this.accumulatedFlowRate = accumulatedFlowRate;
}

@JsonProperty("daillyFowRate")
public String getDaillyFowRate() {
return daillyFowRate;
}

@JsonProperty("daillyFowRate")
public void setDaillyFowRate(String daillyFowRate) {
this.daillyFowRate = daillyFowRate;
}

@JsonProperty("waterTemperature")
public String getWaterTemperature() {
return waterTemperature;
}

@JsonProperty("waterTemperature")
public void setWaterTemperature(String waterTemperature) {
this.waterTemperature = waterTemperature;
}

@JsonProperty("bateryVoltage")
public String getBateryVoltage() {
return bateryVoltage;
}

@JsonProperty("bateryVoltage")
public void setBateryVoltage(String bateryVoltage) {
this.bateryVoltage = bateryVoltage;
}

@JsonProperty("signalStrength")
public String getSignalStrength() {
return signalStrength;
}

@JsonProperty("signalStrength")
public void setSignalStrength(String signalStrength) {
this.signalStrength = signalStrength;
}

@JsonProperty("timeTaken")
public String getTimeTaken() {
return timeTaken;
}

@JsonProperty("timeTaken")
public void setTimeTaken(String timeTaken) {
this.timeTaken = timeTaken;
}

@JsonProperty("waterPressure")
public String getWaterPressure() {
return waterPressure;
}

@JsonProperty("waterPressure")
public void setWaterPressure(String waterPressure) {
this.waterPressure = waterPressure;
}

public MeterAlarm getMeterAlarm() {
	return meterAlarm;
}

public void setMeterAlarm(MeterAlarm meterAlarm) {
	this.meterAlarm = meterAlarm;
}

public String getCumulativeWorkTime() {
	return cumulativeWorkTime;
}

public void setCumulativeWorkTime(String cumulativeWorkTime) {
	this.cumulativeWorkTime = cumulativeWorkTime;
}

public String getDailyReverseFlow() {
	return dailyReverseFlow;
}

public void setDailyReverseFlow(String dailyReverseFlow) {
	this.dailyReverseFlow = dailyReverseFlow;
}

public String getDailyReverseUseWaterTime() {
	return dailyReverseUseWaterTime;
}

public void setDailyReverseUseWaterTime(String dailyReverseUseWaterTime) {
	this.dailyReverseUseWaterTime = dailyReverseUseWaterTime;
}

public String getDailyUseWaterTime() {
	return dailyUseWaterTime;
}

public void setDailyUseWaterTime(String dailyUseWaterTime) {
	this.dailyUseWaterTime = dailyUseWaterTime;
}

public String getFlowIntervral() {
	return flowIntervral;
}

public void setFlowIntervral(String flowIntervral) {
	this.flowIntervral = flowIntervral;
}

public String getInternalTemperature() {
	return internalTemperature;
}

public void setInternalTemperature(String internalTemperature) {
	this.internalTemperature = internalTemperature;
}

public String getIntervalFlow() {
	return intervalFlow;
}

public void setIntervalFlow(String intervalFlow) {
	this.intervalFlow = intervalFlow;
}

public String getLowestFlowRateTime() {
	return lowestFlowRateTime;
}

public void setLowestFlowRateTime(String lowestFlowRateTime) {
	this.lowestFlowRateTime = lowestFlowRateTime;
}

public String getLowestReverseFlowRate() {
	return lowestReverseFlowRate;
}

public void setLowestReverseFlowRate(String lowestReverseFlowRate) {
	this.lowestReverseFlowRate = lowestReverseFlowRate;
}

public String getLowestReverseFlowRateTime() {
	return lowestReverseFlowRateTime;
}

public void setLowestReverseFlowRateTime(String lowestReverseFlowRateTime) {
	this.lowestReverseFlowRateTime = lowestReverseFlowRateTime;
}

public String getNegativeCumulativeFlow() {
	return negativeCumulativeFlow;
}

public void setNegativeCumulativeFlow(String negativeCumulativeFlow) {
	this.negativeCumulativeFlow = negativeCumulativeFlow;
}

public String getPeakFlowRateTime() {
	return peakFlowRateTime;
}

public void setPeakFlowRateTime(String peakFlowRateTime) {
	this.peakFlowRateTime = peakFlowRateTime;
}

public String getPeakReverseFlowRate() {
	return peakReverseFlowRate;
}

public void setPeakReverseFlowRate(String peakReverseFlowRate) {
	this.peakReverseFlowRate = peakReverseFlowRate;
}

public String getPeakReverseFlowRateTime() {
	return peakReverseFlowRateTime;
}

public void setPeakReverseFlowRateTime(String peakReverseFlowRateTime) {
	this.peakReverseFlowRateTime = peakReverseFlowRateTime;
}

public String getPositiveCumulativeFlow() {
	return positiveCumulativeFlow;
}

public void setPositiveCumulativeFlow(String positiveCumulativeFlow) {
	this.positiveCumulativeFlow = positiveCumulativeFlow;
}

public String getPressInteveral() {
	return pressInteveral;
}

public void setPressInteveral(String pressInteveral) {
	this.pressInteveral = pressInteveral;
}

public String getPressure() {
	return pressure;
}

public void setPressure(String pressure) {
	this.pressure = pressure;
}

public String getReverseCumulativeWorkTime() {
	return reverseCumulativeWorkTime;
}

public void setReverseCumulativeWorkTime(String reverseCumulativeWorkTime) {
	this.reverseCumulativeWorkTime = reverseCumulativeWorkTime;
}

public String getReverseFlowIntervral() {
	return reverseFlowIntervral;
}

public void setReverseFlowIntervral(String reverseFlowIntervral) {
	this.reverseFlowIntervral = reverseFlowIntervral;
}

public String getReverseIntervalFlow() {
	return reverseIntervalFlow;
}

public void setReverseIntervalFlow(String reverseIntervalFlow) {
	this.reverseIntervalFlow = reverseIntervalFlow;
}

public String getTemperatureInterval() {
	return temperatureInterval;
}

public void setTemperatureInterval(String temperatureInterval) {
	this.temperatureInterval = temperatureInterval;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("MeterData [meterCode=");
	builder.append(meterCode);
	builder.append(", imsi=");
	builder.append(imsi);
	builder.append(", accumulatedFlowRate=");
	builder.append(accumulatedFlowRate);
	builder.append(", daillyFowRate=");
	builder.append(daillyFowRate);
	builder.append(", waterTemperature=");
	builder.append(waterTemperature);
	builder.append(", bateryVoltage=");
	builder.append(bateryVoltage);
	builder.append(", signalStrength=");
	builder.append(signalStrength);
	builder.append(", timeTaken=");
	builder.append(timeTaken);
	builder.append(", waterPressure=");
	builder.append(waterPressure);
	builder.append(", cumulativeWorkTime=");
	builder.append(cumulativeWorkTime);
	builder.append(", dailyReverseFlow=");
	builder.append(dailyReverseFlow);
	builder.append(", dailyReverseUseWaterTime=");
	builder.append(dailyReverseUseWaterTime);
	builder.append(", dailyUseWaterTime=");
	builder.append(dailyUseWaterTime);
	builder.append(", flowIntervral=");
	builder.append(flowIntervral);
	builder.append(", internalTemperature=");
	builder.append(internalTemperature);
	builder.append(", intervalFlow=");
	builder.append(intervalFlow);
	builder.append(", lowestFlowRateTime=");
	builder.append(lowestFlowRateTime);
	builder.append(", lowestReverseFlowRate=");
	builder.append(lowestReverseFlowRate);
	builder.append(", lowestReverseFlowRateTime=");
	builder.append(lowestReverseFlowRateTime);
	builder.append(", negativeCumulativeFlow=");
	builder.append(negativeCumulativeFlow);
	builder.append(", peakFlowRateTime=");
	builder.append(peakFlowRateTime);
	builder.append(", peakReverseFlowRate=");
	builder.append(peakReverseFlowRate);
	builder.append(", peakReverseFlowRateTime=");
	builder.append(peakReverseFlowRateTime);
	builder.append(", positiveCumulativeFlow=");
	builder.append(positiveCumulativeFlow);
	builder.append(", pressInteveral=");
	builder.append(pressInteveral);
	builder.append(", pressure=");
	builder.append(pressure);
	builder.append(", reverseCumulativeWorkTime=");
	builder.append(reverseCumulativeWorkTime);
	builder.append(", reverseFlowIntervral=");
	builder.append(reverseFlowIntervral);
	builder.append(", reverseIntervalFlow=");
	builder.append(reverseIntervalFlow);
	builder.append(", temperatureInterval=");
	builder.append(temperatureInterval);
	builder.append(", meterAlarm=");
	builder.append(meterAlarm);
	builder.append("]");
	return builder.toString();
}







}