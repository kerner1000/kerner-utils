package net.sf.kerner.utils;


public class KeyValueViewKey<K> implements View<KeyValue<K, ?>, K> {

	public K transform(KeyValue<K, ?> element) {
		return element.getKey();
	}

}
