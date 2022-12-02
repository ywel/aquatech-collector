
package  io.aquatech.dto;
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
    "snr",
    "version",
    "multiReportingCount",
    "sendPower",
    "coverageGrade",
    "pci",
    "bootToNetWork",
    "bootToBaseStationConnectedSuccessfully",
    "bootToCoreNetworkAttachedSuccessfully",
    "bootToIoTPlatformSuccessfullyRegistered",
    "currentTimeOrFailedTime",
    "reportStateAndReason",
    "errCode",
    "nmStatus"
})
public class RawDataNode {

    @JsonProperty("snr")
    private Integer snr;
    @JsonProperty("version")
    private String version;
    @JsonProperty("multiReportingCount")
    private Integer multiReportingCount;
    @JsonProperty("sendPower")
    private Integer sendPower;
    @JsonProperty("coverageGrade")
    private Integer coverageGrade;
    @JsonProperty("pci")
    private Integer pci;
    @JsonProperty("bootToNetWork")
    private Integer bootToNetWork;
    @JsonProperty("bootToBaseStationConnectedSuccessfully")
    private Integer bootToBaseStationConnectedSuccessfully;
    @JsonProperty("bootToCoreNetworkAttachedSuccessfully")
    private Integer bootToCoreNetworkAttachedSuccessfully;
    @JsonProperty("bootToIoTPlatformSuccessfullyRegistered")
    private Integer bootToIoTPlatformSuccessfullyRegistered;
    @JsonProperty("currentTimeOrFailedTime")
    private Integer currentTimeOrFailedTime;
    @JsonProperty("reportStateAndReason")
    private String reportStateAndReason;
    @JsonProperty("errCode")
    private String errCode;
    @JsonProperty("nmStatus")
    private Object nmStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("snr")
    public Integer getSnr() {
        return snr;
    }

    @JsonProperty("snr")
    public void setSnr(Integer snr) {
        this.snr = snr;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("multiReportingCount")
    public Integer getMultiReportingCount() {
        return multiReportingCount;
    }

    @JsonProperty("multiReportingCount")
    public void setMultiReportingCount(Integer multiReportingCount) {
        this.multiReportingCount = multiReportingCount;
    }

    @JsonProperty("sendPower")
    public Integer getSendPower() {
        return sendPower;
    }

    @JsonProperty("sendPower")
    public void setSendPower(Integer sendPower) {
        this.sendPower = sendPower;
    }

    @JsonProperty("coverageGrade")
    public Integer getCoverageGrade() {
        return coverageGrade;
    }

    @JsonProperty("coverageGrade")
    public void setCoverageGrade(Integer coverageGrade) {
        this.coverageGrade = coverageGrade;
    }

    @JsonProperty("pci")
    public Integer getPci() {
        return pci;
    }

    @JsonProperty("pci")
    public void setPci(Integer pci) {
        this.pci = pci;
    }

    @JsonProperty("bootToNetWork")
    public Integer getBootToNetWork() {
        return bootToNetWork;
    }

    @JsonProperty("bootToNetWork")
    public void setBootToNetWork(Integer bootToNetWork) {
        this.bootToNetWork = bootToNetWork;
    }

    @JsonProperty("bootToBaseStationConnectedSuccessfully")
    public Integer getBootToBaseStationConnectedSuccessfully() {
        return bootToBaseStationConnectedSuccessfully;
    }

    @JsonProperty("bootToBaseStationConnectedSuccessfully")
    public void setBootToBaseStationConnectedSuccessfully(Integer bootToBaseStationConnectedSuccessfully) {
        this.bootToBaseStationConnectedSuccessfully = bootToBaseStationConnectedSuccessfully;
    }

    @JsonProperty("bootToCoreNetworkAttachedSuccessfully")
    public Integer getBootToCoreNetworkAttachedSuccessfully() {
        return bootToCoreNetworkAttachedSuccessfully;
    }

    @JsonProperty("bootToCoreNetworkAttachedSuccessfully")
    public void setBootToCoreNetworkAttachedSuccessfully(Integer bootToCoreNetworkAttachedSuccessfully) {
        this.bootToCoreNetworkAttachedSuccessfully = bootToCoreNetworkAttachedSuccessfully;
    }

    @JsonProperty("bootToIoTPlatformSuccessfullyRegistered")
    public Integer getBootToIoTPlatformSuccessfullyRegistered() {
        return bootToIoTPlatformSuccessfullyRegistered;
    }

    @JsonProperty("bootToIoTPlatformSuccessfullyRegistered")
    public void setBootToIoTPlatformSuccessfullyRegistered(Integer bootToIoTPlatformSuccessfullyRegistered) {
        this.bootToIoTPlatformSuccessfullyRegistered = bootToIoTPlatformSuccessfullyRegistered;
    }

    @JsonProperty("currentTimeOrFailedTime")
    public Integer getCurrentTimeOrFailedTime() {
        return currentTimeOrFailedTime;
    }

    @JsonProperty("currentTimeOrFailedTime")
    public void setCurrentTimeOrFailedTime(Integer currentTimeOrFailedTime) {
        this.currentTimeOrFailedTime = currentTimeOrFailedTime;
    }

    @JsonProperty("reportStateAndReason")
    public String getReportStateAndReason() {
        return reportStateAndReason;
    }

    @JsonProperty("reportStateAndReason")
    public void setReportStateAndReason(String reportStateAndReason) {
        this.reportStateAndReason = reportStateAndReason;
    }

    @JsonProperty("errCode")
    public String getErrCode() {
        return errCode;
    }

    @JsonProperty("errCode")
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    @JsonProperty("nmStatus")
    public Object getNmStatus() {
        return nmStatus;
    }

    @JsonProperty("nmStatus")
    public void setNmStatus(Object nmStatus) {
        this.nmStatus = nmStatus;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
