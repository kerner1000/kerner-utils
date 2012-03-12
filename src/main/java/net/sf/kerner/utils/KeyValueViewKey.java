package net.sf.kerner.utils;

import net.sf.kerner.utils.transformer.Transformer;

public class KeyValueViewKey<K, V> implements Transformer<KeyValue<K, V>, K> {

	public K transform(KeyValue<K, V> element) {
		return element.getKey();
	}

}
