package net.sf.kerner.utils.exception;

import java.util.Properties;

public class ExceptionReadOnly extends ExceptionRuntimeProperty {

    private static final long serialVersionUID = 5406448987859843382L;

    public ExceptionReadOnly() {
        super();

    }

    public ExceptionReadOnly(final Properties pro) {
        super(pro);

    }

    public ExceptionReadOnly(final String arg0) {
        super(arg0);

    }

    public ExceptionReadOnly(final String arg0, final Properties pro) {
        super(arg0, pro);

    }

    public ExceptionReadOnly(final String arg0, final Throwable arg1) {
        super(arg0, arg1);

    }

    public ExceptionReadOnly(final String arg0, final Throwable arg1, final Properties pro) {
        super(arg0, arg1, pro);

    }

    public ExceptionReadOnly(final Throwable arg0) {
        super(arg0);

    }

    public ExceptionReadOnly(final Throwable arg0, final Properties pro) {
        super(arg0, pro);

    }

}
