package net.sf.kerner.utils;

public class StringUtils {
	
	private StringUtils(){}
	
	/**
	 * 
	 * Check if a string is null, empty or contains only whitespaces.
	 *
	 * @param string String to check
	 * @return true, if this string is null, empty or contains only whitespaces; false otherwise
	 */
	public static boolean emptyString(String s){
		if(s == null)
			return true;
		if(s.length() < 1)
			return true;
		if(s.matches("\\s"))
			return true;
		return false;
	}

}
