package io.aquatech.billing;

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
"metercode",
"reading"
})
public class Datum {

@JsonProperty("metercode")
private String metercode;
@JsonProperty("reading")
private String reading;
@JsonIgnore

@JsonProperty("metercode")
public String getMetercode() {
return metercode;
}

@JsonProperty("metercode")
public void setMetercode(String metercode) {
this.metercode = metercode;
}

@JsonProperty("reading")
public String getReading() {
return reading;
}

@JsonProperty("reading")
public void setReading(String reading) {
this.reading = reading;
}


}