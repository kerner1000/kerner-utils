package net.sf.kerner.utils;

import net.sf.kerner.utils.transformer.Transformer;

public class KeyValueViewKey<K> implements Transformer<KeyValue<K, ?>, K> {

	public K transform(KeyValue<K, ?> element) {
		return element.getKey();
	}

}
