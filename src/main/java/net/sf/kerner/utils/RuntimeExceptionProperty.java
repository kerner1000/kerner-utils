package net.sf.kerner.utils;

import java.util.Properties;

public class RuntimeExceptionProperty extends RuntimeException {

	private static final long serialVersionUID = 71806291218857338L;

	private final Properties pro;

	public RuntimeExceptionProperty() {
		this.pro = new Properties();
	}

	public RuntimeExceptionProperty(String arg0) {
		this(arg0, new Properties());

	}

	public RuntimeExceptionProperty(Properties pro) {
		super();
		this.pro = pro;
	}

	public RuntimeExceptionProperty(String arg0, Properties pro) {
		super(arg0);
		this.pro = pro;
	}

	public RuntimeExceptionProperty(Throwable arg0) {
		this(arg0, new Properties());
	}

	public RuntimeExceptionProperty(Throwable arg0, Properties pro) {
		super(arg0);
		this.pro = pro;
	}

	public RuntimeExceptionProperty(String arg0, Throwable arg1) {
		this(arg0, arg1, new Properties());
	}

	public RuntimeExceptionProperty(String arg0, Throwable arg1, Properties pro) {
		super(arg0, arg1);
		this.pro = pro;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(pro.toString());
		sb.append(StringUtils.NEW_LINE_STRING);
		sb.append(super.toString());
		return sb.toString();
	}

	public Properties getPro() {
		return pro;
	}

}
