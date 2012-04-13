package net.sf.kerner.utils;

public class ViewKeyValueKey<K> implements View<KeyValue<K, ?>, K> {

	public K transform(KeyValue<K, ?> element) {
		return element.getKey();
	}

}
