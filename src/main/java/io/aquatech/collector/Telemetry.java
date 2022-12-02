package io.aquatech.collector;

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
"timeTaken",
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
"intervalFlow",
"flowIntervral",
"reverseIntervalFlow",
"reverseFlowIntervral",
"temperature",
"temperatureInterval",
"pressure",
"pressInteveral",
"signalStrength",
"batteryVoltage"
})
public class Telemetry {

@JsonProperty("meterCode")
private String meterCode;
@JsonProperty("timeTaken")
private String timeTaken;
@JsonProperty("internalTemperature")
private Integer internalTemperature;
@JsonProperty("dailyUseWaterTime")
private Integer dailyUseWaterTime;
@JsonProperty("dailyReverseFlow")
private Integer dailyReverseFlow;
@JsonProperty("cumulativeFlow")
private Integer cumulativeFlow;
@JsonProperty("positiveCumulativeFlow")
private Integer positiveCumulativeFlow;
@JsonProperty("negativeCumulativeFlow")
private Integer negativeCumulativeFlow;
@JsonProperty("cumulativeWorkTime")
private Integer cumulativeWorkTime;
@JsonProperty("dailyFlow")
private Double dailyFlow;
@JsonProperty("peakFlowRate")
private Integer peakFlowRate;
@JsonProperty("peakFlowRateTime")
private String peakFlowRateTime;
@JsonProperty("lowestFlowRate")
private Integer lowestFlowRate;
@JsonProperty("lowestFlowRateTime")
private String lowestFlowRateTime;
@JsonProperty("intervalFlow")
private String intervalFlow;
@JsonProperty("flowIntervral")
private Integer flowIntervral;
@JsonProperty("reverseIntervalFlow")
private Integer reverseIntervalFlow;
@JsonProperty("reverseFlowIntervral")
private Integer reverseFlowIntervral;
@JsonProperty("temperature")
private String temperature;
@JsonProperty("temperatureInterval")
private Integer temperatureInterval;
@JsonProperty("pressure")
private String pressure;
@JsonProperty("pressInteveral")
private String pressInteveral;
@JsonProperty("signalStrength")
private Integer signalStrength;
@JsonProperty("batteryVoltage")
private Integer batteryVoltage;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("meterCode")
public String getMeterCode() {
return meterCode;
}

@JsonProperty("meterCode")
public void setMeterCode(String meterCode) {
this.meterCode = meterCode;
}

@JsonProperty("timeTaken")
public String getTimeTaken() {
return timeTaken;
}

@JsonProperty("timeTaken")
public void setTimeTaken(String timeTaken) {
this.timeTaken = timeTaken;
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
public Integer getDailyReverseFlow() {
return dailyReverseFlow;
}

@JsonProperty("dailyReverseFlow")
public void setDailyReverseFlow(Integer dailyReverseFlow) {
this.dailyReverseFlow = dailyReverseFlow;
}

@JsonProperty("cumulativeFlow")
public Integer getCumulativeFlow() {
return cumulativeFlow;
}

@JsonProperty("cumulativeFlow")
public void setCumulativeFlow(Integer cumulativeFlow) {
this.cumulativeFlow = cumulativeFlow;
}

@JsonProperty("positiveCumulativeFlow")
public Integer getPositiveCumulativeFlow() {
return positiveCumulativeFlow;
}

@JsonProperty("positiveCumulativeFlow")
public void setPositiveCumulativeFlow(Integer positiveCumulativeFlow) {
this.positiveCumulativeFlow = positiveCumulativeFlow;
}

@JsonProperty("negativeCumulativeFlow")
public Integer getNegativeCumulativeFlow() {
return negativeCumulativeFlow;
}

@JsonProperty("negativeCumulativeFlow")
public void setNegativeCumulativeFlow(Integer negativeCumulativeFlow) {
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
public Double getDailyFlow() {
return dailyFlow;
}

@JsonProperty("dailyFlow")
public void setDailyFlow(Double double1) {
this.dailyFlow = double1;
}

@JsonProperty("peakFlowRate")
public Integer getPeakFlowRate() {
return peakFlowRate;
}

@JsonProperty("peakFlowRate")
public void setPeakFlowRate(Integer peakFlowRate) {
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
public Integer getLowestFlowRate() {
return lowestFlowRate;
}

@JsonProperty("lowestFlowRate")
public void setLowestFlowRate(Integer lowestFlowRate) {
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

@JsonProperty("intervalFlow")
public String getIntervalFlow() {
return intervalFlow;
}

@JsonProperty("intervalFlow")
public void setIntervalFlow(String intervalFlow) {
this.intervalFlow = intervalFlow;
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
public Integer getReverseIntervalFlow() {
return reverseIntervalFlow;
}

@JsonProperty("reverseIntervalFlow")
public void setReverseIntervalFlow(Integer reverseIntervalFlow) {
this.reverseIntervalFlow = reverseIntervalFlow;
}

@JsonProperty("reverseFlowIntervral")
public Integer getReverseFlowIntervral() {
return reverseFlowIntervral;
}

@JsonProperty("reverseFlowIntervral")
public void setReverseFlowIntervral(Integer reverseFlowIntervral) {
this.reverseFlowIntervral = reverseFlowIntervral;
}

@JsonProperty("temperature")
public String getTemperature() {
return temperature;
}

@JsonProperty("temperature")
public void setTemperature(String temperature) {
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
public String getPressure() {
return pressure;
}

@JsonProperty("pressure")
public void setPressure(String pressure) {
this.pressure = pressure;
}

@JsonProperty("pressInteveral")
public String getPressInteveral() {
return pressInteveral;
}

@JsonProperty("pressInteveral")
public void setPressInteveral(String pressInteveral) {
this.pressInteveral = pressInteveral;
}

@JsonProperty("signalStrength")
public Integer getSignalStrength() {
return signalStrength;
}

@JsonProperty("signalStrength")
public void setSignalStrength(Integer signalStrength) {
this.signalStrength = signalStrength;
}

@JsonProperty("batteryVoltage")
public Integer getBatteryVoltage() {
return batteryVoltage;
}

@JsonProperty("batteryVoltage")
public void setBatteryVoltage(Integer batteryVoltage) {
this.batteryVoltage = batteryVoltage;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
	return "Telemetry [meterCode=" + meterCode + ", timeTaken=" + timeTaken + ", internalTemperature="
			+ internalTemperature + ", dailyUseWaterTime=" + dailyUseWaterTime + ", dailyReverseFlow="
			+ dailyReverseFlow + ", cumulativeFlow=" + cumulativeFlow + ", positiveCumulativeFlow="
			+ positiveCumulativeFlow + ", negativeCumulativeFlow=" + negativeCumulativeFlow + ", cumulativeWorkTime="
			+ cumulativeWorkTime + ", dailyFlow=" + dailyFlow + ", peakFlowRate=" + peakFlowRate + ", peakFlowRateTime="
			+ peakFlowRateTime + ", lowestFlowRate=" + lowestFlowRate + ", lowestFlowRateTime=" + lowestFlowRateTime
			+ ", intervalFlow=" + intervalFlow + ", flowIntervral=" + flowIntervral + ", reverseIntervalFlow="
			+ reverseIntervalFlow + ", reverseFlowIntervral=" + reverseFlowIntervral + ", temperature=" + temperature
			+ ", temperatureInterval=" + temperatureInterval + ", pressure=" + pressure + ", pressInteveral="
			+ pressInteveral + ", signalStrength=" + signalStrength + ", batteryVoltage=" + batteryVoltage
			+ ", additionalProperties=" + additionalProperties + "]";
}

}