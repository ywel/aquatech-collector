package io.aquatech.billing;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"notifyType",
"wsp",
"zone",
"objectcount",
"services"
})
public class SulisReading {

@JsonProperty("notifyType")
private String notifyType;
@JsonProperty("wsp")
private String wsp;
@JsonProperty("zone")
private String zone;
@JsonProperty("objectcount")
private String objectcount;
@JsonProperty("services")
private Services services;


@JsonProperty("notifyType")
public String getNotifyType() {
return notifyType;
}

@JsonProperty("notifyType")
public void setNotifyType(String notifyType) {
this.notifyType = notifyType;
}

@JsonProperty("wsp")
public String getWsp() {
return wsp;
}

@JsonProperty("wsp")
public void setWsp(String wsp) {
this.wsp = wsp;
}

@JsonProperty("zone")
public String getZone() {
return zone;
}

@JsonProperty("zone")
public void setZone(String zone) {
this.zone = zone;
}

@JsonProperty("objectcount")
public String getObjectcount() {
return objectcount;
}

@JsonProperty("objectcount")
public void setObjectcount(String objectcount) {
this.objectcount = objectcount;
}

@JsonProperty("services")
public Services getServices() {
return services;
}

@JsonProperty("services")
public void setServices(Services services) {
this.services = services;
}


}