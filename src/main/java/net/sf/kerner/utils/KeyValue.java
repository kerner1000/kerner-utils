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

import java.util.Map.Entry;

/**
 * Simple Key-Value mapping.
 * <p>
 * {@code key} may not be {@code null}; {@code value} may be {@code null}.
 * </p>
 * 
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2011-01-13
 * 
 * @param <K>
 *            type of {@code key}
 * @param <V>
 *            type of {@code value}
 */
public class KeyValue<K, V> implements Entry<K, V> {

	// Fields //

	/**
	 * 
	 */
	private final K key;

	/**
	 * 
	 */
	private volatile V value;

	// Constructor //

	/**
	 * 
	 * 
	 * Create a new {@code KeyValue} object, using given key and value.
	 * 
	 * @param key
	 *            key for this key-value-mapping
	 * @param value
	 *            value for this key-value-mapping
	 * @throws NullPointerException
	 *             if given {@code key} is {@code null}
	 */
	public KeyValue(K key, V value) {
		if (key == null)
			throw new NullPointerException("key must not be null");
		this.key = key;
		this.value = value;
	}

	/**
	 * 
	 * 
	 * Create a new {@code KeyValue} object, using given key.
	 * 
	 * @param key
	 *            key for this key-value-mapping
	 * @throws NullPointerException
	 *             if given {@code key} is {@code null}
	 */
	public KeyValue(K key) {
		if (key == null)
			throw new NullPointerException("key must not be null");
		this.key = key;
		this.value = null;
	}

	/**
	 * 
	 * 
	 * Create a new {@code KeyValue} object, using given {@code KeyValue} as a
	 * template.
	 * 
	 * @param template
	 *            {@code KeyValue} template
	 */
	public KeyValue(KeyValue<K, V> template) {
		this.key = template.getKey();
		this.value = template.getValue();
	}

	@Override
	public String toString() {
		return key + "=" + value;
	}

	// Override //

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KeyValue<?, ?> other = (KeyValue<?, ?>) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	// Implement //

	/**
	 * Return the key for this key-value-mapping
	 */
	public K getKey() {
		return key;
	}

	/**
	 * Return the value for this key-value-mapping
	 */
	public V getValue() {
		return value;
	}

	/**
	 * Set the value for this key-value-mapping, return the previous value
	 * mapped by this key-value-mapping
	 */
	public V setValue(V value) {
		final V result = this.value;
		this.value = value;
		return result;
	}

}
