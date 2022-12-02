
package io.aquatech.dto;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//test
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timeOfReading",
    "signalStrength",
    "dailyActivityTime",
    "swVersion",
    "batteryVoltage",
    "imsi",
    "meterType",
    "originalData",
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
    "rawDataNode",
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
    "longTimeFlowAlarm",
    "pressureMutationAlarm",
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
    "valveActionAlarm",
    "reserveAlarm32",
    "innerTempratureSensorFault",
    "alarmName",
    "timestamp",
    "status",
    "imei",
    "cryptographicData",
    "alarmDetail",
    "alarmDetailNode"
})
public class ServiceData {

    @JsonProperty("timeOfReading")
    private String timeOfReading;
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
    private String  dailyReverseUseWaterTime;
    @JsonProperty("rawData")
    private String rawData;
    @JsonProperty("rawDataNode")
    private RawDataNode rawDataNode;
    @JsonProperty("intervalFlow")
    private List<Double> intervalFlow = new ArrayList<Double>();
    @JsonProperty("flowIntervral")
    private Integer flowIntervral;
    @JsonProperty("reverseIntervalFlow")
    private List<Double> reverseIntervalFlow = null;
    @JsonProperty("reverseFlowIntervral")
    private List<Double> reverseFlowIntervral =new ArrayList<Double>();
    @JsonProperty("temperature")
    private List<Float> temperature = new ArrayList<Float>();
    @JsonProperty("temperatureInterval")
    private Integer temperatureInterval;
    @JsonProperty("pressure")
    private List<Double> pressure = new ArrayList<Double>();
    @JsonProperty("pressInteveral")
    private List<Double> pressInteveral= new ArrayList<Double>();
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
    @JsonProperty("longTimeFlowAlarm")
    private Integer longTimeFlowAlarm;
    @JsonProperty("pressureMutationAlarm")
    private Integer pressureMutationAlarm;
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
    @JsonProperty("valveActionAlarm")
    private Integer valveActionAlarm;
    @JsonProperty("reserveAlarm32")
    private Integer reserveAlarm32;
    @JsonProperty("innerTempratureSensorFault")
    private Integer innerTempratureSensorFault;
    @JsonProperty("alarmName")
    private String alarmName;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("imei")
    private String imei;
    @JsonProperty("cryptographicData")
    private String cryptographicData;
    @JsonProperty("alarmDetail")
    private String alarmDetail;
    @JsonProperty("alarmDetailNode")
    private String alarmDetailNode;
	public String getTimeOfReading() {
		return timeOfReading;
	}
	public void setTimeOfReading(String timeOfReading) {
		this.timeOfReading = timeOfReading;
	}
	public Integer getSignalStrength() {
		return signalStrength;
	}
	public void setSignalStrength(Integer signalStrength) {
		this.signalStrength = signalStrength;
	}
	public Integer getDailyActivityTime() {
		return dailyActivityTime;
	}
	public void setDailyActivityTime(Integer dailyActivityTime) {
		this.dailyActivityTime = dailyActivityTime;
	}
	public String getSwVersion() {
		return swVersion;
	}
	public void setSwVersion(String swVersion) {
		this.swVersion = swVersion;
	}
	public Integer getBatteryVoltage() {
		return batteryVoltage;
	}
	public void setBatteryVoltage(Integer batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public Integer getMeterType() {
		return meterType;
	}
	public void setMeterType(Integer meterType) {
		this.meterType = meterType;
	}
	public String getOriginalData() {
		return originalData;
	}
	public void setOriginalData(String originalData) {
		this.originalData = originalData;
	}
	public Integer getInternalTemperature() {
		return internalTemperature;
	}
	public void setInternalTemperature(Integer internalTemperature) {
		this.internalTemperature = internalTemperature;
	}
	public Integer getDailyUseWaterTime() {
		return dailyUseWaterTime;
	}
	public void setDailyUseWaterTime(Integer dailyUseWaterTime) {
		this.dailyUseWaterTime = dailyUseWaterTime;
	}
	public Integer getDailyReverseFlow() {
		return dailyReverseFlow;
	}
	public void setDailyReverseFlow(Integer dailyReverseFlow) {
		this.dailyReverseFlow = dailyReverseFlow;
	}
	public Integer getCumulativeFlow() {
		return cumulativeFlow;
	}
	public void setCumulativeFlow(Integer cumulativeFlow) {
		this.cumulativeFlow = cumulativeFlow;
	}
	public Integer getPositiveCumulativeFlow() {
		return positiveCumulativeFlow;
	}
	public void setPositiveCumulativeFlow(Integer positiveCumulativeFlow) {
		this.positiveCumulativeFlow = positiveCumulativeFlow;
	}
	public Integer getNegativeCumulativeFlow() {
		return negativeCumulativeFlow;
	}
	public void setNegativeCumulativeFlow(Integer negativeCumulativeFlow) {
		this.negativeCumulativeFlow = negativeCumulativeFlow;
	}
	public Integer getCumulativeWorkTime() {
		return cumulativeWorkTime;
	}
	public void setCumulativeWorkTime(Integer cumulativeWorkTime) {
		this.cumulativeWorkTime = cumulativeWorkTime;
	}
	
	public Double getDailyFlow() {
		return dailyFlow;
	}
	public void setDailyFlow(Double dailyFlow) {
		this.dailyFlow = dailyFlow;
	}
	public Float getPeakFlowRate() {
		return peakFlowRate;
	}
	public void setPeakFlowRate(Float peakFlowRate) {
		this.peakFlowRate = peakFlowRate;
	}

	public Float getLowestFlowRate() {
		return lowestFlowRate;
	}
	public void setLowestFlowRate(Float lowestFlowRate) {
		this.lowestFlowRate = lowestFlowRate;
	}
	
	public Float getLowestReverseFlowRate() {
		return lowestReverseFlowRate;
	}
	
	public String getReverseCumulativeWorkTime() {
		return reverseCumulativeWorkTime;
	}
	
	public String getRawData() {
		return rawData;
	}
	public void setRawData(String rawData) {
		this.rawData = rawData;
	}
	public RawDataNode getRawDataNode() {
		return rawDataNode;
	}
	public void setRawDataNode(RawDataNode rawDataNode) {
		this.rawDataNode = rawDataNode;
	}
	public List<Double> getIntervalFlow() {
		return intervalFlow;
	}
	public void setIntervalFlow(List<Double> intervalFlow) {
		this.intervalFlow = intervalFlow;
	}
	public Integer getFlowIntervral() {
		return flowIntervral;
	}
	public void setFlowIntervral(Integer flowIntervral) {
		this.flowIntervral = flowIntervral;
	}
	public List<Double> getReverseIntervalFlow() {
		return reverseIntervalFlow;
	}
	public void setReverseIntervalFlow(List<Double> reverseIntervalFlow) {
		this.reverseIntervalFlow = reverseIntervalFlow;
	}
	public List<Double> getReverseFlowIntervral() {
		return reverseFlowIntervral;
	}
	public void setReverseFlowIntervral(List<Double> reverseFlowIntervral) {
		this.reverseFlowIntervral = reverseFlowIntervral;
	}
	public List<Float> getTemperature() {
		return temperature;
	}
	public void setTemperature(List<Float> temperature) {
		this.temperature = temperature;
	}
	public Integer getTemperatureInterval() {
		return temperatureInterval;
	}
	public void setTemperatureInterval(Integer temperatureInterval) {
		this.temperatureInterval = temperatureInterval;
	}
	public List<Double> getPressure() {
		return pressure;
	}
	public void setPressure(List<Double> pressure) {
		this.pressure = pressure;
	}
	public List<Double> getPressInteveral() {
		return pressInteveral;
	}
	public void setPressInteveral(List<Double> pressInteveral) {
		this.pressInteveral = pressInteveral;
	}
	public Integer getLowFlowAlarm() {
		return lowFlowAlarm;
	}
	public void setLowFlowAlarm(Integer lowFlowAlarm) {
		this.lowFlowAlarm = lowFlowAlarm;
	}
	public Integer getHighFlowAlarm() {
		return highFlowAlarm;
	}
	public void setHighFlowAlarm(Integer highFlowAlarm) {
		this.highFlowAlarm = highFlowAlarm;
	}
	public Integer getTamperAlarm() {
		return tamperAlarm;
	}
	public void setTamperAlarm(Integer tamperAlarm) {
		this.tamperAlarm = tamperAlarm;
	}
	public Integer getLowBatteryAlarm() {
		return lowBatteryAlarm;
	}
	public void setLowBatteryAlarm(Integer lowBatteryAlarm) {
		this.lowBatteryAlarm = lowBatteryAlarm;
	}
	public Integer getBatteryRunOutAlarm() {
		return batteryRunOutAlarm;
	}
	public void setBatteryRunOutAlarm(Integer batteryRunOutAlarm) {
		this.batteryRunOutAlarm = batteryRunOutAlarm;
	}
	public Integer getHighInternalTemperature() {
		return highInternalTemperature;
	}
	public void setHighInternalTemperature(Integer highInternalTemperature) {
		this.highInternalTemperature = highInternalTemperature;
	}
	public Integer getReverseFlowAlarm() {
		return reverseFlowAlarm;
	}
	public void setReverseFlowAlarm(Integer reverseFlowAlarm) {
		this.reverseFlowAlarm = reverseFlowAlarm;
	}
	public Integer getHighPressureAlarm() {
		return highPressureAlarm;
	}
	public void setHighPressureAlarm(Integer highPressureAlarm) {
		this.highPressureAlarm = highPressureAlarm;
	}
	public Integer getLowPressureAlarm() {
		return lowPressureAlarm;
	}
	public void setLowPressureAlarm(Integer lowPressureAlarm) {
		this.lowPressureAlarm = lowPressureAlarm;
	}
	public Integer getHighTemperatureAlarm() {
		return highTemperatureAlarm;
	}
	public void setHighTemperatureAlarm(Integer highTemperatureAlarm) {
		this.highTemperatureAlarm = highTemperatureAlarm;
	}
	public Integer getLowTemperatureAlarm() {
		return lowTemperatureAlarm;
	}
	public void setLowTemperatureAlarm(Integer lowTemperatureAlarm) {
		this.lowTemperatureAlarm = lowTemperatureAlarm;
	}
	public Integer getInnerErrorAlarm() {
		return innerErrorAlarm;
	}
	public void setInnerErrorAlarm(Integer innerErrorAlarm) {
		this.innerErrorAlarm = innerErrorAlarm;
	}
	public Integer getStorageFault() {
		return storageFault;
	}
	public void setStorageFault(Integer storageFault) {
		this.storageFault = storageFault;
	}
	public Integer getWaterTempratureSensorFault() {
		return waterTempratureSensorFault;
	}
	public void setWaterTempratureSensorFault(Integer waterTempratureSensorFault) {
		this.waterTempratureSensorFault = waterTempratureSensorFault;
	}
	public Integer getPressureSensorFault() {
		return pressureSensorFault;
	}
	public void setPressureSensorFault(Integer pressureSensorFault) {
		this.pressureSensorFault = pressureSensorFault;
	}
	public Integer getLongTimeFlowAlarm() {
		return longTimeFlowAlarm;
	}
	public void setLongTimeFlowAlarm(Integer longTimeFlowAlarm) {
		this.longTimeFlowAlarm = longTimeFlowAlarm;
	}
	public Integer getPressureMutationAlarm() {
		return pressureMutationAlarm;
	}
	public void setPressureMutationAlarm(Integer pressureMutationAlarm) {
		this.pressureMutationAlarm = pressureMutationAlarm;
	}
	public Integer getReserveAlarm19() {
		return reserveAlarm19;
	}
	public void setReserveAlarm19(Integer reserveAlarm19) {
		this.reserveAlarm19 = reserveAlarm19;
	}
	public Integer getReserveAlarm20() {
		return reserveAlarm20;
	}
	public void setReserveAlarm20(Integer reserveAlarm20) {
		this.reserveAlarm20 = reserveAlarm20;
	}
	public Integer getReserveAlarm21() {
		return reserveAlarm21;
	}
	public void setReserveAlarm21(Integer reserveAlarm21) {
		this.reserveAlarm21 = reserveAlarm21;
	}
	public Integer getReserveAlarm22() {
		return reserveAlarm22;
	}
	public void setReserveAlarm22(Integer reserveAlarm22) {
		this.reserveAlarm22 = reserveAlarm22;
	}
	public Integer getReserveAlarm23() {
		return reserveAlarm23;
	}
	public void setReserveAlarm23(Integer reserveAlarm23) {
		this.reserveAlarm23 = reserveAlarm23;
	}
	public Integer getReserveAlarm24() {
		return reserveAlarm24;
	}
	public void setReserveAlarm24(Integer reserveAlarm24) {
		this.reserveAlarm24 = reserveAlarm24;
	}
	public Integer getReserveAlarm25() {
		return reserveAlarm25;
	}
	public void setReserveAlarm25(Integer reserveAlarm25) {
		this.reserveAlarm25 = reserveAlarm25;
	}
	public Integer getReserveAlarm26() {
		return reserveAlarm26;
	}
	public void setReserveAlarm26(Integer reserveAlarm26) {
		this.reserveAlarm26 = reserveAlarm26;
	}
	public Integer getLowReverseFlowAlarm() {
		return lowReverseFlowAlarm;
	}
	public void setLowReverseFlowAlarm(Integer lowReverseFlowAlarm) {
		this.lowReverseFlowAlarm = lowReverseFlowAlarm;
	}
	public Integer getHighReverseFlowAlarm() {
		return highReverseFlowAlarm;
	}
	public void setHighReverseFlowAlarm(Integer highReverseFlowAlarm) {
		this.highReverseFlowAlarm = highReverseFlowAlarm;
	}
	public Integer getCommunicationAlarm() {
		return communicationAlarm;
	}
	public void setCommunicationAlarm(Integer communicationAlarm) {
		this.communicationAlarm = communicationAlarm;
	}
	public Integer getPsmAlarm() {
		return psmAlarm;
	}
	public void setPsmAlarm(Integer psmAlarm) {
		this.psmAlarm = psmAlarm;
	}
	public Integer getValveActionAlarm() {
		return valveActionAlarm;
	}
	public void setValveActionAlarm(Integer valveActionAlarm) {
		this.valveActionAlarm = valveActionAlarm;
	}
	public Integer getReserveAlarm32() {
		return reserveAlarm32;
	}
	public void setReserveAlarm32(Integer reserveAlarm32) {
		this.reserveAlarm32 = reserveAlarm32;
	}
	public Integer getInnerTempratureSensorFault() {
		return innerTempratureSensorFault;
	}
	public void setInnerTempratureSensorFault(Integer innerTempratureSensorFault) {
		this.innerTempratureSensorFault = innerTempratureSensorFault;
	}
	public String getAlarmName() {
		return alarmName;
	}
	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getCryptographicData() {
		return cryptographicData;
	}
	public void setCryptographicData(String cryptographicData) {
		this.cryptographicData = cryptographicData;
	}
	public String getAlarmDetail() {
		return alarmDetail;
	}
	public void setAlarmDetail(String alarmDetail) {
		this.alarmDetail = alarmDetail;
	}
	public String getAlarmDetailNode() {
		return alarmDetailNode;
	}
	public void setAlarmDetailNode(String alarmDetailNode) {
		this.alarmDetailNode = alarmDetailNode;
	}
	public String getPeakFlowRateTime() {
		return peakFlowRateTime;
	}
	public void setPeakFlowRateTime(String peakFlowRateTime) {
		this.peakFlowRateTime = peakFlowRateTime;
	}
	public String getLowestFlowRateTime() {
		return lowestFlowRateTime;
	}
	public void setLowestFlowRateTime(String lowestFlowRateTime) {
		this.lowestFlowRateTime = lowestFlowRateTime;
	}
	public Float getPeakReverseFlowRate() {
		return peakReverseFlowRate;
	}
	public void setPeakReverseFlowRate(Float peakReverseFlowRate) {
		this.peakReverseFlowRate = peakReverseFlowRate;
	}
	public String getPeakReverseFlowRateTime() {
		return peakReverseFlowRateTime;
	}
	public void setPeakReverseFlowRateTime(String peakReverseFlowRateTime) {
		this.peakReverseFlowRateTime = peakReverseFlowRateTime;
	}
	public String getLowestReverseFlowRateTime() {
		return lowestReverseFlowRateTime;
	}
	public void setLowestReverseFlowRateTime(String lowestReverseFlowRateTime) {
		this.lowestReverseFlowRateTime = lowestReverseFlowRateTime;
	}
	public String getDailyReverseUseWaterTime() {
		return dailyReverseUseWaterTime;
	}
	public void setDailyReverseUseWaterTime(String dailyReverseUseWaterTime) {
		this.dailyReverseUseWaterTime = dailyReverseUseWaterTime;
	}
	public void setLowestReverseFlowRate(Float lowestReverseFlowRate) {
		this.lowestReverseFlowRate = lowestReverseFlowRate;
	}
	public void setReverseCumulativeWorkTime(String reverseCumulativeWorkTime) {
		this.reverseCumulativeWorkTime = reverseCumulativeWorkTime;
	}
	@Override
	public String toString() {
		return "ServiceData [timeOfReading=" + timeOfReading + ", signalStrength=" + signalStrength
				+ ", dailyActivityTime=" + dailyActivityTime + ", swVersion=" + swVersion + ", batteryVoltage="
				+ batteryVoltage + ", imsi=" + imsi + ", meterType=" + meterType + ", originalData=" + originalData
				+ ", internalTemperature=" + internalTemperature + ", dailyUseWaterTime=" + dailyUseWaterTime
				+ ", dailyReverseFlow=" + dailyReverseFlow + ", cumulativeFlow=" + cumulativeFlow
				+ ", positiveCumulativeFlow=" + positiveCumulativeFlow + ", negativeCumulativeFlow="
				+ negativeCumulativeFlow + ", cumulativeWorkTime=" + cumulativeWorkTime + ", dailyFlow=" + dailyFlow
				+ ", peakFlowRate=" + peakFlowRate + ", peakFlowRateTime=" + peakFlowRateTime + ", lowestFlowRate="
				+ lowestFlowRate + ", lowestFlowRateTime=" + lowestFlowRateTime + ", peakReverseFlowRate="
				+ peakReverseFlowRate + ", peakReverseFlowRateTime=" + peakReverseFlowRateTime
				+ ", lowestReverseFlowRate=" + lowestReverseFlowRate + ", lowestReverseFlowRateTime="
				+ lowestReverseFlowRateTime + ", reverseCumulativeWorkTime=" + reverseCumulativeWorkTime
				+ ", dailyReverseUseWaterTime=" + dailyReverseUseWaterTime + ", rawData=" + rawData + ", rawDataNode="
				+ rawDataNode + ", intervalFlow=" + intervalFlow + ", flowIntervral=" + flowIntervral
				+ ", reverseIntervalFlow=" + reverseIntervalFlow + ", reverseFlowIntervral=" + reverseFlowIntervral
				+ ", temperature=" + temperature + ", temperatureInterval=" + temperatureInterval + ", pressure="
				+ pressure + ", pressInteveral=" + pressInteveral + ", lowFlowAlarm=" + lowFlowAlarm
				+ ", highFlowAlarm=" + highFlowAlarm + ", tamperAlarm=" + tamperAlarm + ", lowBatteryAlarm="
				+ lowBatteryAlarm + ", batteryRunOutAlarm=" + batteryRunOutAlarm + ", highInternalTemperature="
				+ highInternalTemperature + ", reverseFlowAlarm=" + reverseFlowAlarm + ", highPressureAlarm="
				+ highPressureAlarm + ", lowPressureAlarm=" + lowPressureAlarm + ", highTemperatureAlarm="
				+ highTemperatureAlarm + ", lowTemperatureAlarm=" + lowTemperatureAlarm + ", innerErrorAlarm="
				+ innerErrorAlarm + ", storageFault=" + storageFault + ", waterTempratureSensorFault="
				+ waterTempratureSensorFault + ", pressureSensorFault=" + pressureSensorFault + ", longTimeFlowAlarm="
				+ longTimeFlowAlarm + ", pressureMutationAlarm=" + pressureMutationAlarm + ", reserveAlarm19="
				+ reserveAlarm19 + ", reserveAlarm20=" + reserveAlarm20 + ", reserveAlarm21=" + reserveAlarm21
				+ ", reserveAlarm22=" + reserveAlarm22 + ", reserveAlarm23=" + reserveAlarm23 + ", reserveAlarm24="
				+ reserveAlarm24 + ", reserveAlarm25=" + reserveAlarm25 + ", reserveAlarm26=" + reserveAlarm26
				+ ", lowReverseFlowAlarm=" + lowReverseFlowAlarm + ", highReverseFlowAlarm=" + highReverseFlowAlarm
				+ ", communicationAlarm=" + communicationAlarm + ", psmAlarm=" + psmAlarm + ", valveActionAlarm="
				+ valveActionAlarm + ", reserveAlarm32=" + reserveAlarm32 + ", innerTempratureSensorFault="
				+ innerTempratureSensorFault + ", alarmName=" + alarmName + ", timestamp=" + timestamp + ", status="
				+ status + ", imei=" + imei + ", cryptographicData=" + cryptographicData + ", alarmDetail="
				+ alarmDetail + ", alarmDetailNode=" + alarmDetailNode + "]";
	}
	
	
    
    

}