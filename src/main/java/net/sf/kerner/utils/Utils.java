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
}
