package net.sf.kerner.utils;

public class ArrayUtils {
	
	private ArrayUtils(){
		
	}
	
	public static char[] arrayTrim(char[] array, int size) {
		if (size < 0) {
			return new char[0];
		}
		if (array.length <= size)
			return array;
		final char[] result = new char[size];
		System.arraycopy(array, 0, result, 0, size);
		return result;
	}

}
