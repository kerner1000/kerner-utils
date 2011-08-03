package net.sf.kerner.utils.math;

import java.util.ArrayList;
import java.util.List;

import net.sf.kerner.utils.Point;
import net.sf.kerner.utils.Utils;
import net.sf.kerner.utils.counter.Counter;

public class MathUtils {

	private MathUtils() {
	}

	/**
	 * Round a floating point number ({@code double}) with an accuracy up to
	 * given decimal place.
	 * 
	 * @param number
	 *            {@code double} that is rounded to given decimal place
	 * @param decimalPlace
	 *            decimal place to which given {@code double} is rounded
	 * @return rounded {@code double}
	 */
	public static double round(double number, int decimalPlace) {
		int n = decimalPlace;
		Counter c = new Counter();
		while(n > 10){
			n = n / 10;
			c.count();
		}
		
		decimalPlace = decimalPlace + c.getCount();
//		System.out.println("number: " + number + ", digits: " + decimalPlace);
		final double factor = Math.pow(10, decimalPlace);
		final double result = Math.round(number * factor) / factor;
//		System.out.println("result: " + result);
		return result;
	}
	
	public static List<Integer> getPositionsOfExtremSlopes(List<? extends Point> points, double maxSlope, boolean absolute){
		Utils.checkForNull(points);
		if(maxSlope < 0)
			throw new IllegalArgumentException("maxSlope must be >= 0");
		
//		System.out.println("input: " + points + ", maxSlope: " + maxSlope);
		
		final List<Integer> result = new ArrayList<Integer>();
		
		if(points.size() < 1)
			return result;
		
		Point last = points.iterator().next();
		
		for(int i = 1; i < points.size(); i++){
			final Point p = points.get(i);
			double slope = last.getSlope(p);
			if(absolute)
				slope = Math.abs(slope);
//			System.out.println(last + " against " + p + ": slope is " + slope);
			if(slope > maxSlope){
				result.add(Integer.valueOf(i - 1));
			}
			last = p;
		}
		
//		System.out.println("returning " + result);
		
		return result;
	}
	
	public static List<Integer> getPositionsOfExtremSlopes(List<? extends Point> points, double maxShift){
		return getPositionsOfExtremSlopes(points, maxShift, true);
	}

}
