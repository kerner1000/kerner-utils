package net.sf.kerner.utils.hash;

public abstract class HashCalculatorAbstract<T> implements HashCalculator<T> {

    public Integer transform(final T element) {
        return Integer.valueOf(calculateHash(element));
    }

}
