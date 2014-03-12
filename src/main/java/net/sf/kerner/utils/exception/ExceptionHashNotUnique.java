package net.sf.kerner.utils.exception;

public class ExceptionHashNotUnique extends RuntimeException {

    private static final long serialVersionUID = -1464166116319622626L;

    public ExceptionHashNotUnique() {

    }

    public ExceptionHashNotUnique(final String message) {
        super(message);

    }

    public ExceptionHashNotUnique(final String message, final Throwable cause) {
        super(message, cause);

    }

    public ExceptionHashNotUnique(final Throwable cause) {
        super(cause);

    }

}
