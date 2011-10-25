/**********************************************************************
Copyright (c) 2009-2011 Alexander Kerner. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 ***********************************************************************/

package net.sf.kerner.utils.math;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Provides static helper methods. 
 * 
 *
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2011-10-25
 *
 */
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
		int c = 0;
		while (n > 10) {
			n = n / 10;
			c ++;
		}
		decimalPlace = decimalPlace + c;
		final double factor = Math.pow(10, decimalPlace);
		final double result = Math.round(number * factor) / factor;
		return result;
	}

	public static int max(int... values) {
		int result = Integer.MIN_VALUE;
		for (int i : values) {
			if (i > result)
				result = i;
		}
		return result;
	}

	public static int min(int... values) {
		int result = Integer.MAX_VALUE;
		for (int i : values) {
			if (i < result)
				result = i;
		}
		return result;
	}
	
	public static double mean(double... values) {
		if(values.length < 1)
			throw new IllegalArgumentException();
		return sum(values) / values.length;
	}
	
	public static double sum(double... values) {
		double result = 0;
		for (double d : values) {
			result += d;
		}
		return result;
	}
	
	public static double stdDev(double... values){
		double sumOfSquares = 0;
		final double mean = mean(values);
		for(double d : values)
			sumOfSquares += (d - mean) * (d - mean);
		return Math.sqrt(sumOfSquares /( values.length - 1));
	}
	
	static <V> List<V> trimm(List<V> list){
		final List<V> result = new ArrayList<V>();
		for(V o : list){
			if(o != null)
				result.add(o);
		}
		return result;
	}
	
	public static Integer increment(Integer integer){
		return Integer.valueOf(integer.intValue() + 1);
	}
	
	public static Integer add(Integer integer1, Integer integer2){
		return Integer.valueOf(integer1.intValue() + integer2.intValue());
	}
}
