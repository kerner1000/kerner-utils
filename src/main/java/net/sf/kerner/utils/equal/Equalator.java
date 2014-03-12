package net.sf.kerner.utils.equal;

import net.sf.kerner.utils.pair.ObjectPair;
import net.sf.kerner.utils.transformer.Transformer;

public interface Equalator<T> extends Transformer<ObjectPair<T, Object>, Boolean> {

    boolean areEqual(final T element, Object obj);

}
