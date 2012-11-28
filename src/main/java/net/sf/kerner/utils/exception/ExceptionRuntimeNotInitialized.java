package net.sf.kerner.utils.exception;

public class ExceptionRuntimeNotInitialized extends RuntimeException {

    private static final long serialVersionUID = 5014934956292054682L;

    public ExceptionRuntimeNotInitialized() {

    }

    public ExceptionRuntimeNotInitialized(final String message) {
        super(message);

    }

    public ExceptionRuntimeNotInitialized(final String message, final Throwable cause) {
        super(message, cause);

    }

    public ExceptionRuntimeNotInitialized(final Throwable cause) {
        super(cause);

    }

}
