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

package net.sf.kerner.utils;

import java.util.Collection;

/**
 * Utility class for array stuff.
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2012-03-06
 * 
 */
public class ArrayUtils {

	private ArrayUtils() {

	}

	/**
	 * 
	 * Trim an array to given size. All elements with {@code index > size} will
	 * be discarded.
	 * 
	 * @param array
	 *            array that is trimmed
	 * @param size
	 *            the new length of the array
	 * @return the trimmed array
	 */
	public static char[] trim(char[] array, int size) {
		if (size < 0) {
			return new char[0];
		}
		if (array.length <= size)
			return array;
		final char[] result = new char[size];
		System.arraycopy(array, 0, result, 0, size);
		return result;
	}

	/**
	 * 
	 * Trim an array to given size. All elements with {@code index > size} will
	 * be discarded.
	 * 
	 * @param array
	 *            array that is trimmed
	 * @param size
	 *            the new length of the array
	 * @return the trimmed array
	 */
	public static byte[] trim(byte[] array, int size) {
		if (size < 0) {
			return new byte[0];
		}
		if (array.length <= size)
			return array;
		final byte[] result = new byte[size];
		System.arraycopy(array, 0, result, 0, size);
		return result;
	}

	/**
	 * 
	 * Trim an array to given size. All elements with {@code index > size} will
	 * be discarded.
	 * 
	 * @param array
	 *            array that is trimmed
	 * @param size
	 *            the new length of the array
	 * @return the trimmed array
	 */
	public static int[] trim(int[] array, int size) {
		if (size < 0) {
			return new int[0];
		}
		if (array.length <= size)
			return array;
		final int[] result = new int[size];
		System.arraycopy(array, 0, result, 0, size);
		return result;
	}

	/**
	 * 
	 * Check weather an array is {@code null} or contains no elements.
	 * 
	 * @param arr
	 *            array to check
	 * @return true, if {@code arr} is {@code null} or contains no elements
	 */
	public static boolean emptyArray(Object[] arr) {
		if (arr == null)
			return true;
		if (arr.length < 1)
			return true;
		return false;
	}

	/**
	 * 
	 * Check if an array
	 * <ul>
	 * <li>
	 * is {@code null}</li>
	 * <li>
	 * is empty or</li>
	 * <li>
	 * contains only {@code null} elements.</li>
	 * </ul>
	 * 
	 * @param arr
	 *            array to check
	 * @return true, if {@code arr} is {@code null}, empty or if it contains
	 *         only {@code null} elements; {@code false} otherwise
	 */
	public static boolean nullArray(Object[] arr) {
		if (emptyArray(arr))
			return true;
		for (Object o : arr) {
			if (o != null) {
				if (isArray(o))
					return nullArray((Object[]) o);
				else
					return false;
			}
		}
		return true;
	}

	/**
	 * 
	 * Determines if this Class object represents an array class.
	 * 
	 * @param o
	 *            Object to ckeck
	 * @return {@code true}, if this object represents an array; {@code false}
	 *         otherwise
	 */
	public static boolean isArray(Object o) {
		return o.getClass().isArray();
	}

	/**
	 * 
	 * TODO description
	 * 
	 * @param arr
	 * @return
	 * 
	 * @throws NullPointerException
	 *             if any of objects in array is {@code null}
	 */
	public static double[] toPrimitive(Double[] arr) {
		final double[] result = new double[arr.length];
		for (int i = 0; i < arr.length; i++)
			result[i] = arr[i];
		return result;
	}
	
	public static double[] toPrimitive(Number[] arr) {
		final double[] result = new double[arr.length];
		for (int i = 0; i < arr.length; i++)
			result[i] = arr[i].doubleValue();
		return result;
	}

	public static int[] toPrimitive(Integer[] arr) {
		final int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			result[i] = arr[i];
		return result;
	}

	public static Double toObject(double d) {
		return Double.valueOf(d);
	}

	public static Double[] toObject(double[] arr) {
		final Double[] result = new Double[arr.length];
		for (int i = 0; i < arr.length; i++)
			result[i] = arr[i];
		return result;
	}

	public static Byte toObject(byte i) {
		return Byte.valueOf(i);
	}

	public static Byte[] toObject(byte[] arr) {
		final Byte[] result = new Byte[arr.length];
		for (int i = 0; i < arr.length; i++)
			result[i] = arr[i];
		return result;
	}

	public static Integer toObject(int i) {
		return Integer.valueOf(i);
	}

	public static Integer[] toObject(int[] arr) {
		final Integer[] result = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++)
			result[i] = arr[i];
		return result;
	}

	public static Double[] toDouble(Collection<? extends Number> numbers) {
		return toDouble(numbers.toArray(new Number[numbers.size()]));
	}

	public static Double[] toDouble(Number... numbers) {
		final Double[] result = new Double[numbers.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = new Double(numbers[i].doubleValue());
		}
		return result;
	}

	public static Object[] copy(Object[] array) {
		Object[] result = new Object[array.length];
		System.arraycopy(array, 0, result, 0, array.length);
		return result;
	}

	public static double[] copy(double[] array) {
		double[] result = new double[array.length];
		System.arraycopy(array, 0, result, 0, array.length);
		return result;
	}

	public static int[] copy(int[] array) {
		int[] result = new int[array.length];
		System.arraycopy(array, 0, result, 0, array.length);
		return result;
	}

	public static byte[] copy(byte[] array) {
		byte[] result = new byte[array.length];
		System.arraycopy(array, 0, result, 0, array.length);
		return result;
	}

}
