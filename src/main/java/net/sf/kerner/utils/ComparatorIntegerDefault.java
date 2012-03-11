package net.sf.kerner.utils;

import java.util.Comparator;

public class ComparatorIntegerDefault implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

}
