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

package net.sf.kerner.utils;

/**
 *  Utility class for array stuff.
 *
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2011-10-24
 *
 */
public class ArrayUtils {
	
	private ArrayUtils(){
		
	}
	
	/**
	 * 
	 * Trim an array to given size. All elements with {@code index > size} will be discarded.
	 *
	 * @param array array that is trimmed
	 * @param size the new length of the array
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
	 * Trim an array to given size. All elements with {@code index > size} will be discarded.
	 *
	 * @param array array that is trimmed
	 * @param size the new length of the array
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
	 * Trim an array to given size. All elements with {@code index > size} will be discarded.
	 *
	 * @param array array that is trimmed
	 * @param size the new length of the array
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
	 * @param arr array to check
	 * @return true, if {@code arr} is {@code null} or contains no elements
	 */
	public static boolean emptyArray(Object[] arr){
		if(arr == null)
			return true;
		if(arr.length < 1)
			return true;
		return false;
	}
	
	public static double[] toPrimitive(Double[] arr){
		final double[] result = new double[arr.length];
		for(int i = 0; i < arr.length; i++)
			result[i] = arr[i];
		return result;
	}
	
	public static int[] toPrimitive(Integer[] arr){
		final int[] result = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
			result[i] = arr[i];
		return result;
	}

}
