package io.aquatech.test;

import java.util.ArrayList;

public class MeterReading{
    public String tableTime;
    public String meterNumber;
    public String settlementDaycummulativeFlowCode;
    public Double batteryVoltage;
    public String sof;
    public String reverseFlowCode;
    public Double  settlementDaycummulativeFlow;
    public String lastFrozenPointInTime;
    public String instantenousFlowCode;
    public String meterType;
    public Double reverseFlow;
    public Double instantenousFlow;
    public Double temperature;
    public String cummulativeFlowUnit;
    public Double cummulativeFlow;
    
    public ArrayList<HourlyReading> hourlyReadings;
    
	public String getTableTime() {
		return tableTime;
	}
	public void setTableTime(String tableTime) {
		this.tableTime = tableTime;
	}
	public String getMeterNumber() {
		return meterNumber;
	}
	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}
	public String getSettlementDaycummulativeFlowCode() {
		return settlementDaycummulativeFlowCode;
	}
	public void setSettlementDaycummulativeFlowCode(String settlementDaycummulativeFlowCode) {
		this.settlementDaycummulativeFlowCode = settlementDaycummulativeFlowCode;
	}
	public Double getBatteryVoltage() {
		return batteryVoltage;
	}
	public void setBatteryVoltage(Double batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}
	public String getSof() {
		return sof;
	}
	public void setSof(String sof) {
		this.sof = sof;
	}
	public String getReverseFlowCode() {
		return reverseFlowCode;
	}
	public void setReverseFlowCode(String reverseFlowCode) {
		this.reverseFlowCode = reverseFlowCode;
	}
	public Double getSettlementDaycummulativeFlow() {
		return settlementDaycummulativeFlow;
	}
	public void setSettlementDaycummulativeFlow(Double settlementDaycummulativeFlow) {
		this.settlementDaycummulativeFlow = settlementDaycummulativeFlow;
	}
	public String getLastFrozenPointInTime() {
		return lastFrozenPointInTime;
	}
	public void setLastFrozenPointInTime(String lastFrozenPointInTime) {
		this.lastFrozenPointInTime = lastFrozenPointInTime;
	}
	public String getInstantenousFlowCode() {
		return instantenousFlowCode;
	}
	public void setInstantenousFlowCode(String instantenousFlowCode) {
		this.instantenousFlowCode = instantenousFlowCode;
	}
	public String getMeterType() {
		return meterType;
	}
	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}
	public Double getReverseFlow() {
		return reverseFlow;
	}
	public void setReverseFlow(Double reverseFlow) {
		this.reverseFlow = reverseFlow;
	}
	public Double getInstantenousFlow() {
		return instantenousFlow;
	}
	public void setInstantenousFlow(Double instantenousFlow) {
		this.instantenousFlow = instantenousFlow;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	public String getCummulativeFlowUnit() {
		return cummulativeFlowUnit;
	}
	public void setCummulativeFlowUnit(String cummulativeFlowUnit) {
		this.cummulativeFlowUnit = cummulativeFlowUnit;
	}
	public Double getCummulativeFlow() {
		return cummulativeFlow;
	}
	public void setCummulativeFlow(Double cummulativeFlow) {
		this.cummulativeFlow = cummulativeFlow;
	}
	public ArrayList<HourlyReading> getHourlyReadings() {
		return hourlyReadings;
	}
	public void setHourlyReadings(ArrayList<HourlyReading> hourlyReadings) {
		this.hourlyReadings = hourlyReadings;
	}
    
    
}