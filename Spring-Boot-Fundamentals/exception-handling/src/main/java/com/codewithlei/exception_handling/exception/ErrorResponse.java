package com.codewithlei.exception_handling.exception;

import java.time.LocalDateTime;

public class ErrorResponse {
    private final int status;
    private final String message;
    private final LocalDateTime dateTime;

    public ErrorResponse(LocalDateTime dateTime, int status, String message) {
        this.dateTime = dateTime;
        this.status = status;
        this.message = message;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }
}
