package net.sf.kerner.utils.exception;

import java.io.IOException;

public class ExceptionFileFormat extends IOException {

    private static final long serialVersionUID = 4379612301932722343L;

    public ExceptionFileFormat() {
        super();

    }

    public ExceptionFileFormat(final String message) {
        super(message);

    }

    public ExceptionFileFormat(final String message, final Throwable cause) {
        super(message, cause);

    }

    public ExceptionFileFormat(final Throwable cause) {
        super(cause);

    }

}
