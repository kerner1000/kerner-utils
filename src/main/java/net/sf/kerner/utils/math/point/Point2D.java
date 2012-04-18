package net.sf.kerner.utils.math.point;

public class Point2D {

	protected final double x;

	protected final double y;

	public Point2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point2D(Point2D template) {
		this(template.getX(), template.getY());
	}

	/**
	 * 
	 * Calculate the slope from one {@code Point2D} to another.
	 * 
	 * @param one
	 *            first {@code Point}
	 * @param tow
	 *            second {@code Point}
	 * @return the slope
	 */
	final public static double getSlope(Point2D one, Point2D tow) {
		final double b = getDeltaX(one, tow);
		if (b == 0)
			return 0;
		return getDeltaY(one, tow) / (b);
	}

	final public static double getDeltaY(Point2D one, Point2D two) {
		return two.y - one.y;
	}

	final public static double getDeltaX(Point2D one, Point2D two) {
		return two.x - one.x;
	}

	final public double getDistance(Point2D two) {
		return Math.sqrt(Math.pow(getDeltaX(this, two), 2) + Math.pow(getDeltaY(this, two), 2));
	}

	final public double getSlope(Point2D two) {
		return getSlope(this, two);
	}

	// Override //

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Point2D)) {
			return false;
		}
		Point2D other = (Point2D) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x)) {
			return false;
		}
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "x=" + getX() + ",y=" + getY();
	}

	// Getter / Setter //

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}
