package com.betasquirrel.model;

/**
 * Created by Anshad Vattapoyil on 14/06/17 2:02 AM.
 */
public class ObjectResponse {
    private int statusCode;
    private Object data;
    private String message;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
