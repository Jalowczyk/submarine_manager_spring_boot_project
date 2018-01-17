package com.codecool.submarinemanager.response;

public class ErrorResponse {

        String code;
        String message;

        public ErrorResponse(String error, String message) {
            this.code = error;
            this.message = message;
        }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
