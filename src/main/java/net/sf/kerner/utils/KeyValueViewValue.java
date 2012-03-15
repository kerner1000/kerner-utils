package net.sf.kerner.utils;

import net.sf.kerner.utils.transformer.Transformer;

public class KeyValueViewValue<V> implements Transformer<KeyValue<?, V>, V> {

	public V transform(KeyValue<?, V> element) {
		return element.getValue();
	}

}
