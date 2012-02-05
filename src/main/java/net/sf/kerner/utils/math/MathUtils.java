/**********************************************************************
Copyright (c) 2009-2012 Alexander Kerner. All rights reserved.
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

import net.sf.kerner.utils.ArrayUtils;

/**
 * 
 * Provides static helper methods.
 * 
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2012-01-13
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
			c++;
		}
		decimalPlace = decimalPlace + c;
		final double factor = Math.pow(10, decimalPlace);
		final double result = Math.round(number * factor) / factor;
		return result;
	}

	/**
	 * 
	 * Get maximum of given values.
	 * 
	 * @param values
	 *            values to get maximum from
	 * @return maximum value
	 * @throws IllegalArgumentException
	 *             if {@code values.length < 1} or {@code values == null}
	 */
	public static double max(double... values) {
		if (values == null || values.length < 1)
			throw new IllegalArgumentException();
		double result = 0;
		for (double i : values) {
			if (i > result)
				result = i;
		}
		return result;
	}
	
	/**
	 * 
	 * Get maximum of given values.
	 * 
	 * @param values
	 *            values to get maximum from
	 * @return maximum value
	 * @throws IllegalArgumentException
	 *             if {@code values.length < 1} or {@code values == null}
	 */
	public static Number max(Number... values) {
		return max(ArrayUtils.toPrimitive(ArrayUtils.toDouble(values)));
	}
	
	/**
	 * 
	 * Get minimum of given values.
	 * 
	 * @param values
	 *            values to get minimum from
	 * @return minimum value
	 * @throws IllegalArgumentException
	 *             if {@code values.length < 1} or {@code values == null}
	 */
	public static double min(double... values) {
		if (values == null || values.length < 1)
			throw new IllegalArgumentException();
		double result = 0;
		for (double i : values) {
			if (i < result)
				result = i;
		}
		return result;
	}
	
	/**
	 * 
	 * Get minimum of given values.
	 * 
	 * @param values
	 *            values to get minimum from
	 * @return minimum value
	 * @throws IllegalArgumentException
	 *             if {@code values.length < 1} or {@code values == null}
	 */
	public static Number min(Number... values) {
		return min(ArrayUtils.toPrimitive(ArrayUtils.toDouble(values)));
	}

	/**
	 * 
	 * Calculate the {@code mean} of given values.
	 * 
	 * @param values
	 *            values to calculate the mean
	 * @return mean of values
	 * @throws IllegalArgumentException
	 *             if {@code values.length < 1} or {@code values == null}
	 */
	public static double mean(double... values) {
		if (values == null || values.length < 1)
			throw new IllegalArgumentException();
		return sum(values) / values.length;
	}
	
	/**
	 * 
	 * Calculate the {@code mean} of given values.
	 * 
	 * @param values
	 *            values to calculate the mean
	 * @return mean of values
	 * @throws IllegalArgumentException
	 *             if {@code values.length < 1} or {@code values == null}
	 */
	public static Number mean(Number... values) {
		return mean(ArrayUtils.toPrimitive(ArrayUtils.toDouble(values)));
	}

	/**
	 * 
	 * Calculate the {@code sum} of given values.
	 * 
	 * @param values
	 *            values to calculate the sum
	 * @return sum of values * @throws IllegalArgumentException if
	 *         {@code values.length < 1} or {@code values == null}
	 */
	public static double sum(double... values) {
		if (values == null || values.length < 1)
			throw new IllegalArgumentException();
		double result = 0;
		for (double d : values) {
			result += d;
		}
		return result;
	}
	
	/**
	 * 
	 * Calculate the {@code sum} of given values.
	 * 
	 * @param values
	 *            values to calculate the sum
	 * @return sum of values * @throws IllegalArgumentException if
	 *         {@code values.length < 1} or {@code values == null}
	 */
	public static Number sum(Number... values) {
		return sum(ArrayUtils.toPrimitive(ArrayUtils.toDouble(values)));
	}

	/**
	 * 
	 * Calculate the {@code standard deviation} of given values.
	 * 
	 * @param values
	 *            values to calculate the standard deviation
	 * @return sum of values
	 * @throws IllegalArgumentException
	 *             if {@code values.length < 1} or {@code values == null}
	 */
	public static double stdDev(double... values) {
		if (values == null || values.length < 1)
			throw new IllegalArgumentException();
		double sumOfSquares = 0;
		final double mean = mean(values);
		for (double d : values) {
			final double dd = d - mean;
			sumOfSquares += (dd) * (dd);
		}
		return Math.sqrt(sumOfSquares / (values.length - 1));
	}
	
	/**
	 * 
	 * Calculate the {@code standard deviation} of given values.
	 * 
	 * @param values
	 *            values to calculate the standard deviation
	 * @return sum of values
	 * @throws IllegalArgumentException
	 *             if {@code values.length < 1} or {@code values == null}
	 */
	public static Number stdDev(Number... values) {
		return stdDev(ArrayUtils.toPrimitive(ArrayUtils.toDouble(values)));
	}

	/**
	 * 
	 * Increment given {@link Integer} by {@code 1}.
	 * 
	 * @param integer
	 *            {@link Integer} to increment
	 * @return incremented {@link Integer}
	 */
	public static Integer increment(Integer integer) {
		return increment(integer, 1);
	}

	/**
	 * 
	 * Increment given {@link Integer} by {i}.
	 * 
	 * @param integer
	 *            {@link Integer} to increment
	 * @return incremented {@link Integer}
	 */
	public static Integer increment(Integer integer, int i) {
		return Integer.valueOf(integer.intValue() + i);
	}

	/**
	 * 
	 * Add one {@link Integer} to another.
	 * 
	 * @param integer1
	 *            first {@link Integer}
	 * @param integer2
	 *            second {@link Integer}
	 * @return sum of {@code integer1} and {@integer2}
	 */
	public static Integer add(Integer integer1, Integer integer2) {
		return Integer.valueOf(integer1.intValue() + integer2.intValue());
	}
}
