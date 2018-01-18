package com.codecool.submarinemanager.response;

import org.springframework.http.HttpStatus;

public class SuccessResponse {

    private String message;
    private HttpStatus status;

    public SuccessResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
