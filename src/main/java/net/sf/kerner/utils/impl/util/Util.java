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

package net.sf.kerner.utils.impl.util;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * General utility class.
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2012-09-17
 */
public class Util {

    private final static Logger logger = LoggerFactory.getLogger(Util.class);

    /**
     * Number of CPUs that are available to this JVM.
     */
    public static final int NUM_CPUS = Runtime.getRuntime().availableProcessors();

    /**
     * {@link Locale} of current user, e.g. "de", "en" or "fr".
     */
    public static final Locale USER_LOCALE = new Locale(System.getProperty("user.language"));

    /**
     * The working directory is the location in the file system from where the java command was invoked.
     */
    public static final File WORKING_DIR = new File(System.getProperty("user.dir"));

    public static void checkForNull(final Object... objects) throws NullPointerException {
        for (final Object o : objects) {
            if (o == null) {
                throw new NullPointerException();
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
            } else if (UtilArray.isArray(o)) {
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
     * @param obj
     *            second Object
     * @return {@code true}, if both objects have same hashCode; {@code false} otherwise
     */
    public static boolean equalsOnHashCode(final Object o1, final Object obj) {
        if (o1 == null && obj == null) {
            return true;
        }
        if (obj == null || o1 == null) {
            return false;
        }
        return o1.hashCode() == obj.hashCode();
    }

    /**
     * Load a property file as a resource stream and return the {@code version} property.
     * 
     * @param clazz
     * @param propertiesFile
     * @return version string or {@code n/a} if property could not be read
     */
    public static String readVersionFromProperties(final Class<?> clazz, final String propertiesFile) {
        String result = "n/a";
        try {
            final Properties props = new Properties();
            props.load(clazz.getResourceAsStream(propertiesFile));
            result = props.getProperty("version");
        } catch (final Exception e) {
            if (logger.isErrorEnabled()) {
                logger.error(e.getLocalizedMessage(), e);
            }
        }
        return result;
    }

    private Util() {

    }
}
