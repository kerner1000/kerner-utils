package net.sf.kerner.utils;

public class PropertyNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4880504253227652735L;

	public PropertyNotFoundException() {

	}

	public PropertyNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);

	}

	public PropertyNotFoundException(String arg0) {
		super(arg0);

	}

	public PropertyNotFoundException(Throwable arg0) {
		super(arg0);

	}

}
