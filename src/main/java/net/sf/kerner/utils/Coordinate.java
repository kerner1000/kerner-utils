package net.sf.kerner.utils;

public class Coordinate {
	
	private final double x;
	
	private final double y;

	public Coordinate(double x, double y) {
		this.y = y;
		this.x = x;
	}

	public Coordinate(Coordinate template) {
		this(template.x, template.y);
	}
	
	final public static double getSlope(Coordinate one, Coordinate tow){
		final double b = getDeltaX(one, tow);
		if(b == 0)
			return 0;
		return getDeltaY(one,tow) / (b);
	}
	
	final static double getDeltaY(Coordinate one, Coordinate two){
		return two.y - one.y;
	}
	
	final static double getDeltaX(Coordinate one, Coordinate two){
		return two.x - one.x;
	}
	
	final public double getDistance(Coordinate two){
		return Math.sqrt(Math.pow(Coordinate.getDeltaX(this, two), 2) + Math.pow(Coordinate.getDeltaY(this, two),2));
	}
	
	final public double getSlope(Coordinate two){
		return Coordinate.getSlope(this, two);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

}
