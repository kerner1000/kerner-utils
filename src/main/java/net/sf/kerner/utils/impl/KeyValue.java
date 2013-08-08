/**********************************************************************
Copyright (c) 2009-2013 Alexander Kerner. All rights reserved.
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

package net.sf.kerner.utils.impl;

import java.util.Map.Entry;

import net.sf.kerner.utils.ObjectPair;
import net.sf.kerner.utils.impl.util.Util;

/**
 * Simple key-value mapping.
 * <p>
 * {@code key} may not be {@code null}; {@code value} may be {@code null}.
 * </p>
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
 * <p>
 * last reviewed: 2013-05-31
 * </p>
 * 
 * @author <a href="mailto:alexanderkerner24@gmail.com">Alexander Kerner</a>
 * @version 2013-08-01
 * @param <K>
 *            type of {@code key}
 * @param <V>
 *            type of {@code value}
 */
public class KeyValue<K, V> implements Entry<K, V>, ObjectPair<K, V> {

    /**
	 * 
	 */
    private final K key;

    /**
	 * 
	 */
    private volatile V value;

    /**
	 * 
	 */
    private volatile int hashCache;

    /**
     * Create a new {@code KeyValue} object, using given key.
     * 
     * @param key
     *            key for this key-value-mapping
     * @throws NullPointerException
     *             if given {@code key} is {@code null}
     */
    public KeyValue(final K key) {
        if (key == null)
            throw new NullPointerException("key must not be null");
        this.key = key;
        this.value = null;
    }

    /**
     * Create a new {@code KeyValue} object, using given key and value.
     * 
     * @param key
     *            key for this key-value-mapping
     * @param value
     *            value for this key-value-mapping
     * @throws NullPointerException
     *             if given {@code key} is {@code null}
     */
    public KeyValue(final K key, final V value) {
        if (key == null)
            throw new NullPointerException("key must not be null");
        this.key = key;
        this.value = value;
    }

    /**
     * Create a new {@code KeyValue} object, using given {@code KeyValue} as a
     * template.
     * 
     * @param template
     *            {@code KeyValue} template
     */
    public KeyValue(final KeyValue<K, V> template) {
        this(template.getKey(), template.getValue());
    }

    @Override
    public KeyValue<K, V> clone() {
        return new KeyValue<K, V>(getKey(), getValue());
    }

    @Override
    public boolean equals(final Object obj) {
        return Util.equalsOnHashCode(this, obj);
    }

    public K getFirst() {
        return getKey();
    }

    /**
     * Return the key for this key-value-mapping
     */
    public K getKey() {
        return key;
    }

    public V getSecond() {
        return getValue();
    }

    /**
     * Return the value for this key-value-mapping
     */
    public V getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        int result = hashCache;
        if (result == 0) {
            result = 17;
            final int prime = 31;
            result = prime * result + ((key == null) ? 0 : key.hashCode());
            result = prime * result + ((value == null) ? 0 : value.hashCode());
            hashCache = result;
        }
        return result;
    }

    public KeyValue<V, K> invert() {
        return new KeyValue<V, K>(getValue(), getKey());
    }

    /**
     * Set the value for this key-value-mapping, return the previous value
     * mapped by this key-value-mapping
     */
    public synchronized V setValue(final V value) {
        final V result = this.value;
        this.value = value;
        return result;
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }

}
