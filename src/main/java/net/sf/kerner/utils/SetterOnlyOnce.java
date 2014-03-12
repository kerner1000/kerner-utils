package net.sf.kerner.utils;


public class SetterOnlyOnce<T> implements View<T> {

    private final boolean strict;

    private T t = null;

    public SetterOnlyOnce() {
        this(false);
    }

    public SetterOnlyOnce(final boolean strict) {
        this.strict = strict;
    }

    public T getOriginal() {
        return t;
    }

    public void set(final T t) {
        if (this.t == null || (!strict && this.t.equals(t))) {
            this.t = t;
        } else {
            throw new RuntimeException("refuse to override " + this.t + " with " + t);
        }
    }

}
