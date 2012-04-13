package net.sf.kerner.utils;

public class ViewKeyValueValue<V> implements View<KeyValue<?, V>, V> {

	public V transform(KeyValue<?, V> element) {
		return element.getValue();
	}

}
