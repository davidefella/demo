package com.infobasic.restapitemplate.controller.rest.util;

import com.google.gson.JsonElement;

public class StandardResponse {
    private String statusresponse;
    private JsonElement data;

    public StandardResponse(String statusresponse, JsonElement data) {
        this.statusresponse = statusresponse;
        this.data = data;
    }

    public String getStatusResponse() {
        return statusresponse;
    }

    public void setStatusResponse(String statusresponse) {
        this.statusresponse = statusresponse;
    }

    public JsonElement getData() {
        return data;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }

}
