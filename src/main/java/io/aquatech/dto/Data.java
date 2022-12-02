package io.aquatech.dto;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"signalStrength",
"dailyActivityTime",
"swVersion",
"batteryVoltage",
"imsi",
"meterType",
"originalData",
"timeOfReading",
"internalTemperature",
"dailyUseWaterTime",
"dailyReverseFlow",
"cumulativeFlow",
"positiveCumulativeFlow",
"negativeCumulativeFlow",
"cumulativeWorkTime",
"dailyFlow",
"peakFlowRate",
"peakFlowRateTime",
"lowestFlowRate",
"lowestFlowRateTime",
"peakReverseFlowRate",
"peakReverseFlowRateTime",
"lowestReverseFlowRate",
"lowestReverseFlowRateTime",
"reverseCumulativeWorkTime",
"dailyReverseUseWaterTime",
"rawData",
"intervalFlow",
"flowIntervral",
"reverseIntervalFlow",
"reverseFlowIntervral",
"temperature",
"temperatureInterval",
"pressure",
"pressInteveral",
"lowFlowAlarm",
"highFlowAlarm",
"tamperAlarm",
"lowBatteryAlarm",
"batteryRunOutAlarm",
"highInternalTemperature",
"reverseFlowAlarm",
"highPressureAlarm",
"lowPressureAlarm",
"highTemperatureAlarm",
"lowTemperatureAlarm",
"innerErrorAlarm",
"storageFault",
"waterTempratureSensorFault",
"pressureSensorFault",
"reserveAlarm17",
"reserveAlarm18",
"reserveAlarm19",
"reserveAlarm20",
"reserveAlarm21",
"reserveAlarm22",
"reserveAlarm23",
"reserveAlarm24",
"reserveAlarm25",
"reserveAlarm26",
"lowReverseFlowAlarm",
"highReverseFlowAlarm",
"communicationAlarm",
"psmAlarm",
"reserveAlarm31",
"reserveAlarm32",
"innerTempratureSensorFault"
})
public class Data implements Serializable
{

@JsonProperty("signalStrength")
private Integer signalStrength;
@JsonProperty("dailyActivityTime")
private Integer dailyActivityTime;
@JsonProperty("swVersion")
private String swVersion;
@JsonProperty("batteryVoltage")
private Integer batteryVoltage;
@JsonProperty("imsi")
private String imsi;
@JsonProperty("meterType")
private Integer meterType;
@JsonProperty("originalData")
private String originalData;
@JsonProperty("timeOfReading")
private String timeOfReading;
@JsonProperty("internalTemperature")
private Integer internalTemperature;
@JsonProperty("dailyUseWaterTime")
private Integer dailyUseWaterTime;
@JsonProperty("dailyReverseFlow")
private Float dailyReverseFlow;
@JsonProperty("cumulativeFlow")
private Float cumulativeFlow;
@JsonProperty("positiveCumulativeFlow")
private Float positiveCumulativeFlow;
@JsonProperty("negativeCumulativeFlow")
private Float negativeCumulativeFlow;
@JsonProperty("cumulativeWorkTime")
private Integer cumulativeWorkTime;
@JsonProperty("dailyFlow")
private Float dailyFlow;
@JsonProperty("peakFlowRate")
private Float peakFlowRate;
@JsonProperty("peakFlowRateTime")
private String peakFlowRateTime;
@JsonProperty("lowestFlowRate")
private Float lowestFlowRate;
@JsonProperty("lowestFlowRateTime")
private String lowestFlowRateTime;
@JsonProperty("peakReverseFlowRate")
private Float peakReverseFlowRate;
@JsonProperty("peakReverseFlowRateTime")
private String peakReverseFlowRateTime;
@JsonProperty("lowestReverseFlowRate")
private Float lowestReverseFlowRate;
@JsonProperty("lowestReverseFlowRateTime")
private String lowestReverseFlowRateTime;
@JsonProperty("reverseCumulativeWorkTime")
private String reverseCumulativeWorkTime;
@JsonProperty("dailyReverseUseWaterTime")
private String dailyReverseUseWaterTime;
@JsonProperty("rawData")
private String rawData;

@JsonProperty("intervalFlow")
private List<Double> intervalFlow= new ArrayList<Double>();
@JsonProperty("flowIntervral")
private Integer flowIntervral;
@JsonProperty("reverseIntervalFlow")
private List<Float> reverseIntervalFlow = new ArrayList<Float>();
@JsonProperty("reverseFlowIntervral")

private List<Float> reverseFlowIntervral = new ArrayList<Float>();
@JsonProperty("temperature")
private List<Double> temperature = null;
@JsonProperty("temperatureInterval")
private Integer temperatureInterval;
@JsonProperty("pressure")
private List<Float> pressure = new ArrayList<Float>();
@JsonProperty("pressInteveral")
private List<Float> pressInteveral = new ArrayList<Float>();
@JsonProperty("lowFlowAlarm")
private Integer lowFlowAlarm;
@JsonProperty("highFlowAlarm")
private Integer highFlowAlarm;
@JsonProperty("tamperAlarm")
private Integer tamperAlarm;
@JsonProperty("lowBatteryAlarm")
private Integer lowBatteryAlarm;
@JsonProperty("batteryRunOutAlarm")
private Integer batteryRunOutAlarm;
@JsonProperty("highInternalTemperature")
private Integer highInternalTemperature;
@JsonProperty("reverseFlowAlarm")
private Integer reverseFlowAlarm;
@JsonProperty("highPressureAlarm")
private Integer highPressureAlarm;
@JsonProperty("lowPressureAlarm")
private Integer lowPressureAlarm;
@JsonProperty("highTemperatureAlarm")
private Integer highTemperatureAlarm;
@JsonProperty("lowTemperatureAlarm")
private Integer lowTemperatureAlarm;
@JsonProperty("innerErrorAlarm")
private Integer innerErrorAlarm;
@JsonProperty("storageFault")
private Integer storageFault;
@JsonProperty("waterTempratureSensorFault")
private Integer waterTempratureSensorFault;
@JsonProperty("pressureSensorFault")
private Integer pressureSensorFault;
@JsonProperty("reserveAlarm17")
private Integer reserveAlarm17;
@JsonProperty("reserveAlarm18")
private Integer reserveAlarm18;
@JsonProperty("reserveAlarm19")
private Integer reserveAlarm19;
@JsonProperty("reserveAlarm20")
private Integer reserveAlarm20;
@JsonProperty("reserveAlarm21")
private Integer reserveAlarm21;
@JsonProperty("reserveAlarm22")
private Integer reserveAlarm22;
@JsonProperty("reserveAlarm23")
private Integer reserveAlarm23;
@JsonProperty("reserveAlarm24")
private Integer reserveAlarm24;
@JsonProperty("reserveAlarm25")
private Integer reserveAlarm25;
@JsonProperty("reserveAlarm26")
private Integer reserveAlarm26;
@JsonProperty("lowReverseFlowAlarm")
private Integer lowReverseFlowAlarm;
@JsonProperty("highReverseFlowAlarm")
private Integer highReverseFlowAlarm;
@JsonProperty("communicationAlarm")
private Integer communicationAlarm;
@JsonProperty("psmAlarm")
private Integer psmAlarm;
@JsonProperty("reserveAlarm31")
private Integer reserveAlarm31;
@JsonProperty("reserveAlarm32")
private Integer reserveAlarm32;
@JsonProperty("innerTempratureSensorFault")
private Integer innerTempratureSensorFault;
private final static long serialVersionUID = 3224600887819085282L;

@JsonProperty("signalStrength")
public Integer getSignalStrength() {
return signalStrength;
}

@JsonProperty("signalStrength")
public void setSignalStrength(Integer signalStrength) {
this.signalStrength = signalStrength;
}

@JsonProperty("dailyActivityTime")
public Integer getDailyActivityTime() {
return dailyActivityTime;
}

@JsonProperty("dailyActivityTime")
public void setDailyActivityTime(Integer dailyActivityTime) {
this.dailyActivityTime = dailyActivityTime;
}

@JsonProperty("swVersion")
public String getSwVersion() {
return swVersion;
}

@JsonProperty("swVersion")
public void setSwVersion(String swVersion) {
this.swVersion = swVersion;
}

@JsonProperty("batteryVoltage")
public Integer getBatteryVoltage() {
return batteryVoltage;
}

@JsonProperty("batteryVoltage")
public void setBatteryVoltage(Integer batteryVoltage) {
this.batteryVoltage = batteryVoltage;
}

@JsonProperty("imsi")
public String getImsi() {
return imsi;
}

@JsonProperty("imsi")
public void setImsi(String imsi) {
this.imsi = imsi;
}

@JsonProperty("meterType")
public Integer getMeterType() {
return meterType;
}

@JsonProperty("meterType")
public void setMeterType(Integer meterType) {
this.meterType = meterType;
}

@JsonProperty("originalData")
public String getOriginalData() {
return originalData;
}

@JsonProperty("originalData")
public void setOriginalData(String originalData) {
this.originalData = originalData;
}

@JsonProperty("timeOfReading")
public String getTimeOfReading() {
return timeOfReading;
}

@JsonProperty("timeOfReading")
public void setTimeOfReading(String timeOfReading) {
this.timeOfReading = timeOfReading;
}

@JsonProperty("internalTemperature")
public Integer getInternalTemperature() {
return internalTemperature;
}

@JsonProperty("internalTemperature")
public void setInternalTemperature(Integer internalTemperature) {
this.internalTemperature = internalTemperature;
}

@JsonProperty("dailyUseWaterTime")
public Integer getDailyUseWaterTime() {
return dailyUseWaterTime;
}

@JsonProperty("dailyUseWaterTime")
public void setDailyUseWaterTime(Integer dailyUseWaterTime) {
this.dailyUseWaterTime = dailyUseWaterTime;
}

@JsonProperty("dailyReverseFlow")
public Float getDailyReverseFlow() {
return dailyReverseFlow;
}

@JsonProperty("dailyReverseFlow")
public void setDailyReverseFlow(Float dailyReverseFlow) {
this.dailyReverseFlow = dailyReverseFlow;
}

@JsonProperty("cumulativeFlow")
public Float getCumulativeFlow() {
return cumulativeFlow;
}

@JsonProperty("cumulativeFlow")
public void setCumulativeFlow(Float cumulativeFlow) {
this.cumulativeFlow = cumulativeFlow;
}

@JsonProperty("positiveCumulativeFlow")
public Float getPositiveCumulativeFlow() {
return positiveCumulativeFlow;
}

@JsonProperty("positiveCumulativeFlow")
public void setPositiveCumulativeFlow(Float positiveCumulativeFlow) {
this.positiveCumulativeFlow = positiveCumulativeFlow;
}

@JsonProperty("negativeCumulativeFlow")
public Float getNegativeCumulativeFlow() {
return negativeCumulativeFlow;
}

@JsonProperty("negativeCumulativeFlow")
public void setNegativeCumulativeFlow(Float negativeCumulativeFlow) {
this.negativeCumulativeFlow = negativeCumulativeFlow;
}

@JsonProperty("cumulativeWorkTime")
public Integer getCumulativeWorkTime() {
return cumulativeWorkTime;
}

@JsonProperty("cumulativeWorkTime")
public void setCumulativeWorkTime(Integer cumulativeWorkTime) {
this.cumulativeWorkTime = cumulativeWorkTime;
}

@JsonProperty("dailyFlow")
public Float getDailyFlow() {
return dailyFlow;
}

@JsonProperty("dailyFlow")
public void setDailyFlow(Float dailyFlow) {
this.dailyFlow = dailyFlow;
}

@JsonProperty("peakFlowRate")
public Float getPeakFlowRate() {
return peakFlowRate;
}

@JsonProperty("peakFlowRate")
public void setPeakFlowRate(Float peakFlowRate) {
this.peakFlowRate = peakFlowRate;
}

@JsonProperty("peakFlowRateTime")
public String getPeakFlowRateTime() {
return peakFlowRateTime;
}

@JsonProperty("peakFlowRateTime")
public void setPeakFlowRateTime(String peakFlowRateTime) {
this.peakFlowRateTime = peakFlowRateTime;
}

@JsonProperty("lowestFlowRate")
public Float getLowestFlowRate() {
return lowestFlowRate;
}

@JsonProperty("lowestFlowRate")
public void setLowestFlowRate(Float lowestFlowRate) {
this.lowestFlowRate = lowestFlowRate;
}

@JsonProperty("lowestFlowRateTime")
public String getLowestFlowRateTime() {
return lowestFlowRateTime;
}

@JsonProperty("lowestFlowRateTime")
public void setLowestFlowRateTime(String lowestFlowRateTime) {
this.lowestFlowRateTime = lowestFlowRateTime;
}

@JsonProperty("peakReverseFlowRate")
public Float getPeakReverseFlowRate() {
return peakReverseFlowRate;
}

@JsonProperty("peakReverseFlowRate")
public void setPeakReverseFlowRate(Float peakReverseFlowRate) {
this.peakReverseFlowRate = peakReverseFlowRate;
}

@JsonProperty("peakReverseFlowRateTime")
public String getPeakReverseFlowRateTime() {
return peakReverseFlowRateTime;
}

@JsonProperty("peakReverseFlowRateTime")
public void setPeakReverseFlowRateTime(String peakReverseFlowRateTime) {
this.peakReverseFlowRateTime = peakReverseFlowRateTime;
}

@JsonProperty("lowestReverseFlowRate")
public Float getLowestReverseFlowRate() {
return lowestReverseFlowRate;
}

@JsonProperty("lowestReverseFlowRate")
public void setLowestReverseFlowRate(Float lowestReverseFlowRate) {
this.lowestReverseFlowRate = lowestReverseFlowRate;
}

@JsonProperty("lowestReverseFlowRateTime")
public String getLowestReverseFlowRateTime() {
return lowestReverseFlowRateTime;
}

@JsonProperty("lowestReverseFlowRateTime")
public void setLowestReverseFlowRateTime(String lowestReverseFlowRateTime) {
this.lowestReverseFlowRateTime = lowestReverseFlowRateTime;
}

@JsonProperty("reverseCumulativeWorkTime")
public String getReverseCumulativeWorkTime() {
return reverseCumulativeWorkTime;
}

@JsonProperty("reverseCumulativeWorkTime")
public void setReverseCumulativeWorkTime(String reverseCumulativeWorkTime) {
this.reverseCumulativeWorkTime = reverseCumulativeWorkTime;
}

@JsonProperty("dailyReverseUseWaterTime")
public String getDailyReverseUseWaterTime() {
return dailyReverseUseWaterTime;
}

@JsonProperty("dailyReverseUseWaterTime")
public void setDailyReverseUseWaterTime(String dailyReverseUseWaterTime) {
this.dailyReverseUseWaterTime = dailyReverseUseWaterTime;
}

@JsonProperty("rawData")
public String getRawData() {
return rawData;
}

@JsonProperty("rawData")
public void setRawData(String rawData) {
this.rawData = rawData;
}





@JsonProperty("flowIntervral")
public Integer getFlowIntervral() {
return flowIntervral;
}

@JsonProperty("flowIntervral")
public void setFlowIntervral(Integer flowIntervral) {
this.flowIntervral = flowIntervral;
}

@JsonProperty("reverseIntervalFlow")
public List<Float> getReverseIntervalFlow() {
return reverseIntervalFlow;
}

@JsonProperty("reverseIntervalFlow")
public void setReverseIntervalFlow(List<Float> reverseIntervalFlow) {
this.reverseIntervalFlow = reverseIntervalFlow;
}

@JsonProperty("reverseFlowIntervral")
public List<Float> getReverseFlowIntervral() {
return reverseFlowIntervral;
}

@JsonProperty("reverseFlowIntervral")
public void setReverseFlowIntervral(List<Float> reverseFlowIntervral) {
this.reverseFlowIntervral = reverseFlowIntervral;
}

@JsonProperty("temperature")
public List<Double> getTemperature() {
return temperature;
}

@JsonProperty("temperature")
public void setTemperature(List<Double> temperature) {
this.temperature = temperature;
}

@JsonProperty("temperatureInterval")
public Integer getTemperatureInterval() {
return temperatureInterval;
}

@JsonProperty("temperatureInterval")
public void setTemperatureInterval(Integer temperatureInterval) {
this.temperatureInterval = temperatureInterval;
}

@JsonProperty("pressure")
public List<Float> getPressure() {
return pressure;
}

@JsonProperty("pressure")
public void setPressure(List<Float> pressure) {
this.pressure = pressure;
}

@JsonProperty("pressInteveral")
public List<Float> getPressInteveral() {
return pressInteveral;
}

@JsonProperty("pressInteveral")
public void setPressInteveral(List<Float> pressInteveral) {
	 if (pressInteveral != null)
	this.pressInteveral = pressInteveral;
}

@JsonProperty("lowFlowAlarm")
public Integer getLowFlowAlarm() {
return lowFlowAlarm;
}

@JsonProperty("lowFlowAlarm")
public void setLowFlowAlarm(Integer lowFlowAlarm) {
this.lowFlowAlarm = lowFlowAlarm;
}

@JsonProperty("highFlowAlarm")
public Integer getHighFlowAlarm() {
return highFlowAlarm;
}

@JsonProperty("highFlowAlarm")
public void setHighFlowAlarm(Integer highFlowAlarm) {
this.highFlowAlarm = highFlowAlarm;
}

@JsonProperty("tamperAlarm")
public Integer getTamperAlarm() {
return tamperAlarm;
}

@JsonProperty("tamperAlarm")
public void setTamperAlarm(Integer tamperAlarm) {
this.tamperAlarm = tamperAlarm;
}

@JsonProperty("lowBatteryAlarm")
public Integer getLowBatteryAlarm() {
return lowBatteryAlarm;
}

@JsonProperty("lowBatteryAlarm")
public void setLowBatteryAlarm(Integer lowBatteryAlarm) {
this.lowBatteryAlarm = lowBatteryAlarm;
}

@JsonProperty("batteryRunOutAlarm")
public Integer getBatteryRunOutAlarm() {
return batteryRunOutAlarm;
}

@JsonProperty("batteryRunOutAlarm")
public void setBatteryRunOutAlarm(Integer batteryRunOutAlarm) {
this.batteryRunOutAlarm = batteryRunOutAlarm;
}

@JsonProperty("highInternalTemperature")
public Integer getHighInternalTemperature() {
return highInternalTemperature;
}

@JsonProperty("highInternalTemperature")
public void setHighInternalTemperature(Integer highInternalTemperature) {
this.highInternalTemperature = highInternalTemperature;
}

@JsonProperty("reverseFlowAlarm")
public Integer getReverseFlowAlarm() {
return reverseFlowAlarm;
}

@JsonProperty("reverseFlowAlarm")
public void setReverseFlowAlarm(Integer reverseFlowAlarm) {
this.reverseFlowAlarm = reverseFlowAlarm;
}

@JsonProperty("highPressureAlarm")
public Integer getHighPressureAlarm() {
return highPressureAlarm;
}

@JsonProperty("highPressureAlarm")
public void setHighPressureAlarm(Integer highPressureAlarm) {
this.highPressureAlarm = highPressureAlarm;
}

@JsonProperty("lowPressureAlarm")
public Integer getLowPressureAlarm() {
return lowPressureAlarm;
}

@JsonProperty("lowPressureAlarm")
public void setLowPressureAlarm(Integer lowPressureAlarm) {
this.lowPressureAlarm = lowPressureAlarm;
}

@JsonProperty("highTemperatureAlarm")
public Integer getHighTemperatureAlarm() {
return highTemperatureAlarm;
}

@JsonProperty("highTemperatureAlarm")
public void setHighTemperatureAlarm(Integer highTemperatureAlarm) {
this.highTemperatureAlarm = highTemperatureAlarm;
}

@JsonProperty("lowTemperatureAlarm")
public Integer getLowTemperatureAlarm() {
return lowTemperatureAlarm;
}

@JsonProperty("lowTemperatureAlarm")
public void setLowTemperatureAlarm(Integer lowTemperatureAlarm) {
this.lowTemperatureAlarm = lowTemperatureAlarm;
}

@JsonProperty("innerErrorAlarm")
public Integer getInnerErrorAlarm() {
return innerErrorAlarm;
}

@JsonProperty("innerErrorAlarm")
public void setInnerErrorAlarm(Integer innerErrorAlarm) {
this.innerErrorAlarm = innerErrorAlarm;
}

@JsonProperty("storageFault")
public Integer getStorageFault() {
return storageFault;
}

@JsonProperty("storageFault")
public void setStorageFault(Integer storageFault) {
this.storageFault = storageFault;
}

@JsonProperty("waterTempratureSensorFault")
public Integer getWaterTempratureSensorFault() {
return waterTempratureSensorFault;
}

@JsonProperty("waterTempratureSensorFault")
public void setWaterTempratureSensorFault(Integer waterTempratureSensorFault) {
this.waterTempratureSensorFault = waterTempratureSensorFault;
}

@JsonProperty("pressureSensorFault")
public Integer getPressureSensorFault() {
return pressureSensorFault;
}

@JsonProperty("pressureSensorFault")
public void setPressureSensorFault(Integer pressureSensorFault) {
this.pressureSensorFault = pressureSensorFault;
}

@JsonProperty("reserveAlarm17")
public Integer getReserveAlarm17() {
return reserveAlarm17;
}

@JsonProperty("reserveAlarm17")
public void setReserveAlarm17(Integer reserveAlarm17) {
this.reserveAlarm17 = reserveAlarm17;
}

@JsonProperty("reserveAlarm18")
public Integer getReserveAlarm18() {
return reserveAlarm18;
}

@JsonProperty("reserveAlarm18")
public void setReserveAlarm18(Integer reserveAlarm18) {
this.reserveAlarm18 = reserveAlarm18;
}

@JsonProperty("reserveAlarm19")
public Integer getReserveAlarm19() {
return reserveAlarm19;
}

@JsonProperty("reserveAlarm19")
public void setReserveAlarm19(Integer reserveAlarm19) {
this.reserveAlarm19 = reserveAlarm19;
}

@JsonProperty("reserveAlarm20")
public Integer getReserveAlarm20() {
return reserveAlarm20;
}

@JsonProperty("reserveAlarm20")
public void setReserveAlarm20(Integer reserveAlarm20) {
this.reserveAlarm20 = reserveAlarm20;
}

@JsonProperty("reserveAlarm21")
public Integer getReserveAlarm21() {
return reserveAlarm21;
}

@JsonProperty("reserveAlarm21")
public void setReserveAlarm21(Integer reserveAlarm21) {
this.reserveAlarm21 = reserveAlarm21;
}

@JsonProperty("reserveAlarm22")
public Integer getReserveAlarm22() {
return reserveAlarm22;
}

@JsonProperty("reserveAlarm22")
public void setReserveAlarm22(Integer reserveAlarm22) {
this.reserveAlarm22 = reserveAlarm22;
}

@JsonProperty("reserveAlarm23")
public Integer getReserveAlarm23() {
return reserveAlarm23;
}

@JsonProperty("reserveAlarm23")
public void setReserveAlarm23(Integer reserveAlarm23) {
this.reserveAlarm23 = reserveAlarm23;
}

@JsonProperty("reserveAlarm24")
public Integer getReserveAlarm24() {
return reserveAlarm24;
}

@JsonProperty("reserveAlarm24")
public void setReserveAlarm24(Integer reserveAlarm24) {
this.reserveAlarm24 = reserveAlarm24;
}

@JsonProperty("reserveAlarm25")
public Integer getReserveAlarm25() {
return reserveAlarm25;
}

@JsonProperty("reserveAlarm25")
public void setReserveAlarm25(Integer reserveAlarm25) {
this.reserveAlarm25 = reserveAlarm25;
}

@JsonProperty("reserveAlarm26")
public Integer getReserveAlarm26() {
return reserveAlarm26;
}

@JsonProperty("reserveAlarm26")
public void setReserveAlarm26(Integer reserveAlarm26) {
this.reserveAlarm26 = reserveAlarm26;
}

@JsonProperty("lowReverseFlowAlarm")
public Integer getLowReverseFlowAlarm() {
return lowReverseFlowAlarm;
}

@JsonProperty("lowReverseFlowAlarm")
public void setLowReverseFlowAlarm(Integer lowReverseFlowAlarm) {
this.lowReverseFlowAlarm = lowReverseFlowAlarm;
}

@JsonProperty("highReverseFlowAlarm")
public Integer getHighReverseFlowAlarm() {
return highReverseFlowAlarm;
}

@JsonProperty("highReverseFlowAlarm")
public void setHighReverseFlowAlarm(Integer highReverseFlowAlarm) {
this.highReverseFlowAlarm = highReverseFlowAlarm;
}

@JsonProperty("communicationAlarm")
public Integer getCommunicationAlarm() {
return communicationAlarm;
}

@JsonProperty("communicationAlarm")
public void setCommunicationAlarm(Integer communicationAlarm) {
this.communicationAlarm = communicationAlarm;
}

@JsonProperty("psmAlarm")
public Integer getPsmAlarm() {
return psmAlarm;
}

@JsonProperty("psmAlarm")
public void setPsmAlarm(Integer psmAlarm) {
this.psmAlarm = psmAlarm;
}

@JsonProperty("reserveAlarm31")
public Integer getReserveAlarm31() {
return reserveAlarm31;
}

@JsonProperty("reserveAlarm31")
public void setReserveAlarm31(Integer reserveAlarm31) {
this.reserveAlarm31 = reserveAlarm31;
}

@JsonProperty("reserveAlarm32")
public Integer getReserveAlarm32() {
return reserveAlarm32;
}

@JsonProperty("reserveAlarm32")
public void setReserveAlarm32(Integer reserveAlarm32) {
this.reserveAlarm32 = reserveAlarm32;
}

@JsonProperty("innerTempratureSensorFault")
public Integer getInnerTempratureSensorFault() {
return innerTempratureSensorFault;
}

@JsonProperty("innerTempratureSensorFault")
public void setInnerTempratureSensorFault(Integer innerTempratureSensorFault) {
this.innerTempratureSensorFault = innerTempratureSensorFault;
}

public List<Double> getIntervalFlow() {
	return intervalFlow;
}

public void setIntervalFlow(List<Double> intervalFlow) {
	this.intervalFlow = intervalFlow;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Data [signalStrength=");
	builder.append(signalStrength);
	builder.append(", dailyActivityTime=");
	builder.append(dailyActivityTime);
	builder.append(", swVersion=");
	builder.append(swVersion);
	builder.append(", batteryVoltage=");
	builder.append(batteryVoltage);
	builder.append(", imsi=");
	builder.append(imsi);
	builder.append(", meterType=");
	builder.append(meterType);
	builder.append(", originalData=");
	builder.append(originalData);
	builder.append(", timeOfReading=");
	builder.append(timeOfReading);
	builder.append(", internalTemperature=");
	builder.append(internalTemperature);
	builder.append(", dailyUseWaterTime=");
	builder.append(dailyUseWaterTime);
	builder.append(", dailyReverseFlow=");
	builder.append(dailyReverseFlow);
	builder.append(", cumulativeFlow=");
	builder.append(cumulativeFlow);
	builder.append(", positiveCumulativeFlow=");
	builder.append(positiveCumulativeFlow);
	builder.append(", negativeCumulativeFlow=");
	builder.append(negativeCumulativeFlow);
	builder.append(", cumulativeWorkTime=");
	builder.append(cumulativeWorkTime);
	builder.append(", dailyFlow=");
	builder.append(dailyFlow);
	builder.append(", peakFlowRate=");
	builder.append(peakFlowRate);
	builder.append(", peakFlowRateTime=");
	builder.append(peakFlowRateTime);
	builder.append(", lowestFlowRate=");
	builder.append(lowestFlowRate);
	builder.append(", lowestFlowRateTime=");
	builder.append(lowestFlowRateTime);
	builder.append(", peakReverseFlowRate=");
	builder.append(peakReverseFlowRate);
	builder.append(", peakReverseFlowRateTime=");
	builder.append(peakReverseFlowRateTime);
	builder.append(", lowestReverseFlowRate=");
	builder.append(lowestReverseFlowRate);
	builder.append(", lowestReverseFlowRateTime=");
	builder.append(lowestReverseFlowRateTime);
	builder.append(", reverseCumulativeWorkTime=");
	builder.append(reverseCumulativeWorkTime);
	builder.append(", dailyReverseUseWaterTime=");
	builder.append(dailyReverseUseWaterTime);
	builder.append(", rawData=");
	builder.append(rawData);
	builder.append(", intervalFlow=");
	builder.append(intervalFlow);
	builder.append(", flowIntervral=");
	builder.append(flowIntervral);
	builder.append(", reverseIntervalFlow=");
	builder.append(reverseIntervalFlow);
	builder.append(", reverseFlowIntervral=");
	builder.append(reverseFlowIntervral);
	builder.append(", temperature=");
	builder.append(temperature);
	builder.append(", temperatureInterval=");
	builder.append(temperatureInterval);
	builder.append(", pressure=");
	builder.append(pressure);
	builder.append(", pressInteveral=");
	builder.append(pressInteveral);
	builder.append(", lowFlowAlarm=");
	builder.append(lowFlowAlarm);
	builder.append(", highFlowAlarm=");
	builder.append(highFlowAlarm);
	builder.append(", tamperAlarm=");
	builder.append(tamperAlarm);
	builder.append(", lowBatteryAlarm=");
	builder.append(lowBatteryAlarm);
	builder.append(", batteryRunOutAlarm=");
	builder.append(batteryRunOutAlarm);
	builder.append(", highInternalTemperature=");
	builder.append(highInternalTemperature);
	builder.append(", reverseFlowAlarm=");
	builder.append(reverseFlowAlarm);
	builder.append(", highPressureAlarm=");
	builder.append(highPressureAlarm);
	builder.append(", lowPressureAlarm=");
	builder.append(lowPressureAlarm);
	builder.append(", highTemperatureAlarm=");
	builder.append(highTemperatureAlarm);
	builder.append(", lowTemperatureAlarm=");
	builder.append(lowTemperatureAlarm);
	builder.append(", innerErrorAlarm=");
	builder.append(innerErrorAlarm);
	builder.append(", storageFault=");
	builder.append(storageFault);
	builder.append(", waterTempratureSensorFault=");
	builder.append(waterTempratureSensorFault);
	builder.append(", pressureSensorFault=");
	builder.append(pressureSensorFault);
	builder.append(", reserveAlarm17=");
	builder.append(reserveAlarm17);
	builder.append(", reserveAlarm18=");
	builder.append(reserveAlarm18);
	builder.append(", reserveAlarm19=");
	builder.append(reserveAlarm19);
	builder.append(", reserveAlarm20=");
	builder.append(reserveAlarm20);
	builder.append(", reserveAlarm21=");
	builder.append(reserveAlarm21);
	builder.append(", reserveAlarm22=");
	builder.append(reserveAlarm22);
	builder.append(", reserveAlarm23=");
	builder.append(reserveAlarm23);
	builder.append(", reserveAlarm24=");
	builder.append(reserveAlarm24);
	builder.append(", reserveAlarm25=");
	builder.append(reserveAlarm25);
	builder.append(", reserveAlarm26=");
	builder.append(reserveAlarm26);
	builder.append(", lowReverseFlowAlarm=");
	builder.append(lowReverseFlowAlarm);
	builder.append(", highReverseFlowAlarm=");
	builder.append(highReverseFlowAlarm);
	builder.append(", communicationAlarm=");
	builder.append(communicationAlarm);
	builder.append(", psmAlarm=");
	builder.append(psmAlarm);
	builder.append(", reserveAlarm31=");
	builder.append(reserveAlarm31);
	builder.append(", reserveAlarm32=");
	builder.append(reserveAlarm32);
	builder.append(", innerTempratureSensorFault=");
	builder.append(innerTempratureSensorFault);
	builder.append("]");
	return builder.toString();
}





}