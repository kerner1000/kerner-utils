package net.sf.kerner.utils;

public class Coordinate extends KeyValue<Double, Double> {

	public Coordinate(double x, double y) {
		super(x, y);
	}

	public Coordinate(KeyValue<Double, Double> template) {
		super(template);
	}
	
	public static double getSlope(Coordinate x, Coordinate y){
		final double b = y.getKey() - x.getKey();
		if(b == 0)
			return 0;
		return (y.getValue() - x.getValue()) / (b);
	}

}
