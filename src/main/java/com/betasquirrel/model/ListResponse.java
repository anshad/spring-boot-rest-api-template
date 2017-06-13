package com.betasquirrel.model;

import java.util.List;

/**
 * Created by Anshad Vattapoyil on 14/06/17 1:46 AM.
 */
public class ListResponse {

    private int statusCode;
    private List data;
    private String message;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
