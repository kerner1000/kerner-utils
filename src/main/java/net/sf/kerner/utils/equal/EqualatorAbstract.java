package net.sf.kerner.utils.equal;

import net.sf.kerner.utils.pair.ObjectPair;

public abstract class EqualatorAbstract<T> implements Equalator<T> {

    public Boolean transform(final ObjectPair<T, Object> element) {
        return Boolean.valueOf(areEqual(element.getFirst(), element.getSecond()));
    }

}
