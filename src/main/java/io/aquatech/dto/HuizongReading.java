package io.aquatech.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "identifier",
    "msgType",
    "hasMore",
    "data"
})
public class HuizongReading {

    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("msgType")
    private String msgType;
    @JsonProperty("hasMore")
    private Integer hasMore;
    @JsonProperty("data")
    private List<Datum> data = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("msgType")
    public String getMsgType() {
        return msgType;
    }

    @JsonProperty("msgType")
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    @JsonProperty("hasMore")
    public Integer getHasMore() {
        return hasMore;
    }

    @JsonProperty("hasMore")
    public void setHasMore(Integer hasMore) {
        this.hasMore = hasMore;
    }

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
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
