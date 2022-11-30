package com.infobasic.restapitemplate.controller.rest.util;

import com.google.gson.JsonElement;

public class StandardResponse {
    private String StatusResponse;
    private JsonElement data;

    public StandardResponse(String statusResponse, JsonElement data) {
        StatusResponse = statusResponse;
        this.data = data;
    }

    public String getStatusResponse() {
        return StatusResponse;
    }

    public void setStatusResponse(String statusResponse) {
        StatusResponse = statusResponse;
    }

    public JsonElement getData() {
        return data;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }

}
