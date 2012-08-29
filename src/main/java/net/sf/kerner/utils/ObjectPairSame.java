package net.sf.kerner.utils;

import java.util.Arrays;
import java.util.Iterator;

public class ObjectPairSame<T> extends ObjectPair<T, T> implements Iterable<T> {

    public ObjectPairSame() {
        super();
    }

    public ObjectPairSame(final T first, final T second) {
        super(first, second);

    }

    public ObjectPairSame<T> invert() {
        return new ObjectPairSame<T>(getSecond(), getFirst());
    }

    @SuppressWarnings("unchecked")
    public Iterator<T> iterator() {
        return Arrays.asList(getFirst(), getSecond()).iterator();
    }

}
