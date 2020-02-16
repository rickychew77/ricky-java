package com.ricky.mission2;

import net.bytebuddy.implementation.bytecode.Throw;

public class CarsNotFoundException extends RuntimeException {

    public CarsNotFoundException() {
        super();
    }

    public CarsNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public CarsNotFoundException(final String message) {
        super(message);
    }

    public CarsNotFoundException(final Throwable cause) {
        super(cause);
    }
}

