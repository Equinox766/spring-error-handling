package org.equinox.errorhandling.models;

import java.util.Date;

public class Error {
    private String message;
    private String error;
    private int errorCode;
    private Date date;

    public Error() {
    }

    public Error(String message, String error, int errorCode, Date date) {
        this.message = message;
        this.error = error;
        this.errorCode = errorCode;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
