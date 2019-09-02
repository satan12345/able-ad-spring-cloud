package com.able.ad.exception;

public class AdException extends Exception{
    public AdException() {
        super();
    }

    public AdException(String message) {
        super(message);
    }

    public AdException(String message, Throwable cause) {
        super(message, cause);
    }
}
