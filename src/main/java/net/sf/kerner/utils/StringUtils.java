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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 * Utility class for {@link String} related stuff.
 * 
 * <p>
 * <b>Example:</b><br>
 * 
 * </p>
 * <p>
 * 
 * <pre>
 * TODO example
 * </pre>
 * 
 * </p>
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version Apr 13, 2012
 * 
 */
public class StringUtils {

	private StringUtils() {
	}

	/**
	 * System dependent new line string.
	 */
	public final static String NEW_LINE_STRING = System.getProperty("line.separator");

	/**
	 * 
	 * 
	 * 
	 * @return a random {@code String}
	 */
	public static String getRandomString() {
		final String result = Long.toHexString(Double.doubleToLongBits(Math.random()));
		return result;
	}

	/**
	 * 
	 * Check if a string is {@code null}, empty or contains only whitespaces.
	 * 
	 * @param string
	 *            {@code String} to check
	 * @return true, if this {@code String} is {@code null}, empty or contains
	 *         only whitespaces; false otherwise
	 */
	public static boolean emptyString(String string) {
		if (string == null)
			return true;
		if (string.length() < 1)
			return true;
		if (string.matches("\\s"))
			return true;
		return false;
	}
}
