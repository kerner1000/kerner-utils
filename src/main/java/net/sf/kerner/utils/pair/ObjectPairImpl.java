package net.sf.kerner.utils.pair;

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
 * <b>Threading:</b><br>
 * 
 * </p>
 * <p>
 * 
 * <pre>
 * Not thread save.
 * </pre>
 * 
 * </p>
 * <p>
 * last reviewed: 2013-12-09
 * </p>
 * 
 * @author <a href="mailto:alexanderkerner24@gmail.com">Alexander Kerner</a>
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

    public ObjectPairImpl(final ObjectPair<? extends F, ? extends S> template) {
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

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof ObjectPair))
            return false;
        @SuppressWarnings("rawtypes")
        final ObjectPairImpl other = (ObjectPairImpl) obj;
        if (first == null) {
            if (other.first != null)
                return false;
        } else if (!first.equals(other.first) && !first.equals(other.second))
            return false;
        if (second == null) {
            if (other.second != null)
                return false;
        } else if (!second.equals(other.second) && !second.equals(other.first))
            return false;
        return true;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime + result + ((first == null) ? 0 : first.hashCode());
        result = prime + result + ((second == null) ? 0 : second.hashCode());
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
