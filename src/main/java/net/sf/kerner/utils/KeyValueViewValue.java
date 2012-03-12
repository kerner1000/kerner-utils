package net.sf.kerner.utils;

import net.sf.kerner.utils.transformer.Transformer;

public class KeyValueViewValue<K, V> implements Transformer<KeyValue<K, V>, V> {

	public V transform(KeyValue<K, V> element) {
		return element.getValue();
	}

}
