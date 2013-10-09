package net.sf.kerner.utils.impl;

public class ExceptionNotImplemented extends RuntimeException {

    private static final long serialVersionUID = 2576513716754824976L;

    public ExceptionNotImplemented() {

    }

    public ExceptionNotImplemented(final String message) {
        super(message);

    }

    public ExceptionNotImplemented(final String message, final Throwable cause) {
        super(message, cause);

    }

    public ExceptionNotImplemented(final String message, final Throwable cause, final boolean enableSuppression,
            final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);

    }

    public ExceptionNotImplemented(final Throwable cause) {
        super(cause);

    }

}
