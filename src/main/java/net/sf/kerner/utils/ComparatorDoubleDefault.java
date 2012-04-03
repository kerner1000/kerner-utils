package net.sf.kerner.utils;

import java.util.Comparator;

public class ComparatorDoubleDefault implements Comparator<Double> {

	public int compare(Double o1, Double o2) {
		return o1.compareTo(o2);
	}

}
