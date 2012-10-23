package net.sf.kerner.utils.exception;

import java.io.Serializable;

public class ExceptionUnknownType extends RuntimeException {

    private static final long serialVersionUID = -1661770337806543702L;

    private final Serializable unknownType;

    public ExceptionUnknownType(final Serializable unknownType) {
        super();
        this.unknownType = unknownType;
    }

    public ExceptionUnknownType(final Serializable unknownType, final String message, final Throwable cause,
            final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.unknownType = unknownType;
    }

    public ExceptionUnknownType(final Serializable unknownType, final String message, final Throwable cause) {
        super(message, cause);
        this.unknownType = unknownType;
    }

    public ExceptionUnknownType(final Serializable unknownType, final String message) {
        super(message);
        this.unknownType = unknownType;
    }

    public ExceptionUnknownType(final Serializable unknownType, final Throwable cause) {
        super(cause);
        this.unknownType = unknownType;
    }

    @Override
    public String toString() {
        return "unknown type: " + unknownType + ", " + super.toString();
    }

}
