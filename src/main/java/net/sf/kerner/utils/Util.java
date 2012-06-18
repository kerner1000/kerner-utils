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

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

/**
 * General utility class.
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2012-04-25
 */
public class Util {

    /**
     * {@link Locale} of current user, e.g. "de", "en" or "fr".
     */
    public static final Locale USER_LOCALE = new Locale(System.getProperty("user.language"));

    /**
     * The working directory is the location in the file system from where the java command was invoked.
     */
    public static final File WORKING_DIR = new File(System.getProperty("user.dir"));

    /**
     * Number of CPUs that are available to this JVM.
     */
    public static final int NUM_CPUS = Runtime.getRuntime().availableProcessors();

    private Util() {

    }

    /**
     * Simple helper method, that checks whether any of given objects is {@code null}.
     * 
     * @param objects
     *            array of {@code Object Objects} that are checked
     * @throws NullPointerException
     *             if any of given objects is {@code null}
     */
    public static void checkForNull(final Object... objects) throws NullPointerException {
        checkForNull(null, objects);
    }

    /**
     * Simple helper method, that checks whether any of given objects is {@code null}.
     * 
     * @param objects
     *            array of {@code Object Objects} that are checked
     * @param Exception
     *            detail message
     * @throws NullPointerException
     *             if any of given objects is {@code null}
     */
    public static void checkForNull(final String message, final Object... objects) throws NullPointerException {
        for (final Object o : objects) {
            if (o == null) {
                if (message != null) {
                    throw new NullPointerException(message);
                } else {
                    throw new NullPointerException();
                }
            }

        }
    }

    /**
     * Calculates {@link Object#hashCode()} of all elements in given collection recursively, calling on every object
     * {@link Object#hashCode()} and add this to result.
     * 
     * @param objects
     *            Objects from which {@link Object#hashCode()} is calculated
     * @return deep hashCode for given {@link Collection} of objects
     */
    public static int deepHashCode(final Collection<?> objects) {
        int result = 0;
        for (final Object o : objects) {
            if (o instanceof Collection) {
                result += deepHashCode((Collection<?>) o);
            } else if (ArrayUtil.isArray(o)) {
                result += deepHashCode(Arrays.asList((Object[]) o));
            } else {
                result += o.hashCode();
            }
        }
        return result;
    }

    /**
     * Check, weather one Object equals another by delegating to {@link Object#hashCode()}. If one of both Objects is
     * {@code null}, {@code false} is returned. If both Objects are {@code null}, {@code true} is returned.
     * 
     * @param o1
     *            first Object
     * @param o2
     *            second Object
     * @return {@code true}, if both objects have same hashCode; {@code false} otherwise
     */
    public static boolean equalsOnHashCode(final Object o1, final Object o2) {
        if (o1 == null && o2 == null) {
            return true;
        }
        if (o2 == null || o1 == null) {
            return false;
        }
        return o1.hashCode() == o2.hashCode();
    }
}
