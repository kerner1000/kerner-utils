package net.sf.kerner.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringUtils {
	
	private StringUtils(){}
	
	/**
	 * 
	 * Check if a string is null, empty or contains only whitespaces.
	 *
	 * @param string String to check
	 * @return true, if this string is null, empty or contains only whitespaces; false otherwise
	 */
	public static boolean emptyString(String string){
		if(string == null)
			return true;
		if(string.length() < 1)
			return true;
		if(string.matches("\\s"))
			return true;
		return false;
	}
	
	public static List<String> getStringList(Collection<?> list){
		final List<String> result = new ArrayList<String>();
		for(Object o : list){
			result.add(o.toString());
		}
		return result;
	}

}
