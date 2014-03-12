/**********************************************************************
Copyright (c) 2013 Alexander Kerner. All rights reserved.
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

package net.sf.kerner.utils.hash;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import net.sf.kerner.utils.UtilArray;

public class UtilHash {

    public static final int SEED = 23;

    private static final int ODD_PRIME_NUMBER = 37;

    /**
     * Calculates {@link Object#hashCode()} of all elements in given collection
     * recursively, calling on every object {@link Object#hashCode()} and add
     * this to result.
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

    private static int firstTerm(final int aSeed) {
        return ODD_PRIME_NUMBER * aSeed;
    }

    public static int hash(final int aSeed, final boolean aBoolean) {
        return firstTerm(aSeed) + (aBoolean ? 1 : 0);
    }

    public static int hash(final int aSeed, final char aChar) {
        return firstTerm(aSeed) + aChar;
    }

    public static int hash(final int aSeed, final double aDouble) {
        return hash(aSeed, Double.doubleToLongBits(aDouble));
    }

    public static int hash(final int aSeed, final float aFloat) {
        return hash(aSeed, Float.floatToIntBits(aFloat));
    }

    public static int hash(final int aSeed, final int aInt) {
        return firstTerm(aSeed) + aInt;
    }

    public static int hash(final int aSeed, final long aLong) {
        return firstTerm(aSeed) + (int) (aLong ^ (aLong >>> 32));
    }

    public static int hash(final int aSeed, final Object aObject) {
        int result = aSeed;
        if (aObject == null) {
            result = hash(result, 0);
        } else if (!UtilArray.isArray(aObject)) {
            result = hash(result, aObject.hashCode());
        } else {
            final int length = Array.getLength(aObject);
            for (int idx = 0; idx < length; ++idx) {
                final Object item = Array.get(aObject, idx);
                // if an item in the array references the array itself, prevent
                // infinite looping
                if (!(item == aObject))
                    // recursive call!
                    result = hash(result, item);
            }
        }
        return result;
    }

    public static int hash(final Object... objects) {
        int result = SEED;
        for (final Object o : objects) {
            result = ODD_PRIME_NUMBER * result + ((o == null) ? 0 : o.hashCode());
        }
        return result;
    }

    private UtilHash() {

    }

}
