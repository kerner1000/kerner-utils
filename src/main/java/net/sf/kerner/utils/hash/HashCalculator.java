package net.sf.kerner.utils.hash;

import net.sf.kerner.utils.transformer.Transformer;

public interface HashCalculator<T> extends Transformer<T, Integer> {

    int calculateHash(final T element);

}
