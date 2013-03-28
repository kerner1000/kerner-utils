package net.sf.kerner.utils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 
 @deprecated use {@link net.sf.kerner.uitls.ObjectPairSame} instead
 */
@Deprecated
public class ObjectPairSame<T> extends ObjectPair<T, T> implements Iterable<T> {

    public ObjectPairSame() {
        super();
    }

    public ObjectPairSame(final T first, final T second) {
        super(first, second);

    }

    @SuppressWarnings("unchecked")
    public List<T> asList() {
        return Arrays.asList(getFirst(), getSecond());
    }

    public ObjectPairSame<T> invert() {
        return new ObjectPairSame<T>(getSecond(), getFirst());
    }

    public Iterator<T> iterator() {
        return asList().iterator();
    }

}
