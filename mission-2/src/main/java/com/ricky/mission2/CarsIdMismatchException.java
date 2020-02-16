package com.ricky.mission2;

public class CarsIdMismatchException extends RuntimeException {

    public CarsIdMismatchException() {
        super();
    }

    public CarsIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public  CarsIdMismatchException(final String message){
        super(message);
    }

    public CarsIdMismatchException(final Throwable cause) {
        super(cause);
    }
}
