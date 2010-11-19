/**********************************************************************
Copyright (c) 2009-2010 Alexander Kerner. All rights reserved.
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

package net.sf.kerner.utils;

import java.math.BigInteger;
import java.util.Locale;

/**
 * 
 * 
 * General utility class.
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2010-11-19
 * 
 */
public class Utils {

	private static final BigInteger bigMaxInt = BigInteger
			.valueOf(Integer.MAX_VALUE);
	private static final BigInteger bigMinInt = BigInteger
			.valueOf(Integer.MIN_VALUE);

	private static final BigInteger bigMaxLong = BigInteger
			.valueOf(Long.MAX_VALUE);
	private static final BigInteger bigMinLong = BigInteger
			.valueOf(Long.MIN_VALUE);

	/**
	 * Locale of current user, e.g. "de", "en" or "fr".
	 * 
	 * @see Locale
	 */
	public static final Locale USER_LOCALE = new Locale(
			System.getProperty("user.language"));

	/**
	 * Number of CPUs that are currently available to this JVM.
	 */
	public static final int NUM_CPUS = Runtime.getRuntime()
			.availableProcessors();

	private Utils() {
		
	}

	/**
	 * 
	 * 
	 * Simple helper method, that checks whether any of given objects is null.
	 * 
	 * @param objects
	 *            array of {@code Object}s that are checked
	 * @throws NullPointerException
	 *             if any of given objects is null
	 */
	public static void checkForNull(Object... objects) {
		for (Object o : objects) {
			if (o == null)
				throw new NullPointerException();
		}
	}

	/**
	 * 
	 * 
	 * Check if {@link Integer#MIN_VALUE <= {@code b} <=
	 * {@link Integer#MAX_VALUE}.
	 * 
	 * @param b
	 *            {@code BigInteger} to check if in range
	 * @see BigInteger
	 */
	public static void rangeCheckSimpleInt(BigInteger b) {
		if (b.compareTo(bigMaxInt) == 1 || b.compareTo(bigMinInt) == -1)
			throw new ArithmeticException("Integer overflow");
	}

	/**
	 * 
	 * 
	 * Check if {@link Long#MIN_VALUE <= {@code b} <= {@link Long#MAX_VALUE}.
	 * 
	 * @param b
	 *            {@code BigInteger} to check if in range
	 * @see BigInteger
	 */
	public static void rangeCheckSimpleLong(BigInteger b) {
		if (b.compareTo(bigMaxLong) == 1 || b.compareTo(bigMinLong) == -1)
			throw new ArithmeticException("Long overflow");
	}

	/**
	 * 
	 * Perform addition of two {@code int} values with arithmetic safety. if
	 * resulting {@code int} would over- or underflow an exception will be
	 * thrown.
	 * 
	 * @param a first value
	 * @param b second value
	 * @return {@code a + b}
	 */
	public static int rangeCheckAdd(int a, int b) {
		final BigInteger bb = BigInteger.valueOf(a).add(BigInteger.valueOf(b));
		rangeCheckSimpleInt(bb);
		return bb.intValue();
	}

	/**
	 * 
	 * Perform multiplication of two {@code int} values with arithmetic safety. if
	 * resulting {@code int} would over- or underflow an exception will be
	 * thrown.
	 * 
	 * @param a first value
	 * @param b second value
	 * @return {@code a * b}
	 */
	public static int rangeCheckMultiply(int a, int b) {
		final BigInteger bb = BigInteger.valueOf(a).multiply(
				BigInteger.valueOf(b));
		rangeCheckSimpleInt(bb);
		return bb.intValue();
	}

	/**
	 * 
	 * Perform addition of two {@code long} values with arithmetic safety. if
	 * resulting {@code long} would over- or underflow an exception will be
	 * thrown.
	 * 
	 * @param a first value
	 * @param b second value
	 * @return {@code a + b}
	 */
	public static long rangeCheckAdd(long a, long b) {
		final BigInteger bb = BigInteger.valueOf(a).add(BigInteger.valueOf(b));
		rangeCheckSimpleLong(bb);
		return bb.longValue();
	}

	/**
	 * 
	 * Perform multiplication of two {@code long} values with arithmetic safety. if
	 * resulting {@code long} would over- or underflow an exception will be
	 * thrown.
	 * 
	 * @param a first value
	 * @param b second value
	 * @return {@code a * b}
	 */
	public static long rangeCheckMultiply(long a, long b) {
		final BigInteger bb = BigInteger.valueOf(a).multiply(
				BigInteger.valueOf(b));
		rangeCheckSimpleLong(bb);
		return bb.longValue();
	}
	
	public static Integer increment(Integer integer){
		return Integer.valueOf(integer.intValue() + 1);
	}
	
	public static Integer add(Integer integer1, Integer integer2){
		return Integer.valueOf(integer1.intValue() + integer2.intValue());
	}

}
