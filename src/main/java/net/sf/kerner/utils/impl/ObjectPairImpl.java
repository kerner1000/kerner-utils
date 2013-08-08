package net.sf.kerner.utils.impl;

import net.sf.kerner.utils.ObjectPair;
import net.sf.kerner.utils.impl.util.Util;

/**
 * 
 * Default implementation for {@link ObjectPair}.
 * 
 * <p>
 * <b>Example:</b><br>
 * 
 * </p>
 * <p>
 * 
 * <pre>
 * TODO example
 * </pre>
 * 
 * </p>
 * <p>
 * last reviewed: 2013-05-31
 * </p>
 * 
 * @author <a href="mailto:alexanderkerner24@gmail.com">Alexander Kerner</a>
 * @version 2013-08-01
 * 
 * @param <F>
 *            type of first object
 * @param <S>
 *            type of second object
 */
public class ObjectPairImpl<F, S> implements ObjectPair<F, S> {

    private F first;

    private S second;

    public ObjectPairImpl() {
    }

    public ObjectPairImpl(final F first) {
        this.first = first;

    }

    public ObjectPairImpl(final F first, final S second) {
        this.first = first;
        this.second = second;
    }

    public ObjectPairImpl(final ObjectPair<F, S> template) {
        this(template.getFirst(), template.getSecond());
    }

    /**
     * <b>Note:</b> A new {@code ObjectPairImpl} object is created, but
     * {@code first} and {@code second} objects are not cloned here. If this is
     * desired, use {@link ObjectPairImpl#ObjectPairImpl(Object, Object)}
     * constructor to create a new instance and clone {@code first} and
     * {@code second} here also.
     */
    @Override
    public ObjectPairImpl<F, S> clone() {
        return new ObjectPairImpl<F, S>(getFirst(), getSecond());
    }

    /**
     * Delegates to {@link #hashCode()}.
     */
    @Override
    public boolean equals(final Object obj) {
        return Util.equalsOnHashCode(this, obj);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        final int prime = 97;
        int result = 1;
        result = prime * result + ((first == null) ? 0 : first.hashCode());
        result = prime * result + ((second == null) ? 0 : second.hashCode());
        return result;
    }

    public ObjectPairImpl<S, F> invert() {
        return new ObjectPairImpl<S, F>(getSecond(), getFirst());
    }

    public void setFirst(final F first) {
        this.first = first;
    }

    public void setSecond(final S second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return getFirst() + "," + getSecond();
    }
}
