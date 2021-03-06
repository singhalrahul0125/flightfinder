package com.flightfinder.client.model.browsedates;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "CarrierId",
        "Name"
})
public class Carrier {

    @JsonProperty("CarrierId")
    private Long carrierId;
    @JsonProperty("Name")
    private String name;

    @JsonProperty("CarrierId")
    public Long getCarrierId() {
        return carrierId;
    }

    @JsonProperty("CarrierId")
    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

}
