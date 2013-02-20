package net.sf.kerner.utils.async;

import java.util.concurrent.Callable;

public abstract class AbstractAsyncTaskCallable<R, V> extends AbstractAsyncTask<R, V> implements Callable<Void> {

    protected V value;

    /**
     * Don't override. Override {@link #run(Object)}
     */
    public Void call() throws Exception {
        execute(getValue());
        return null;
    }

    public synchronized V getValue() {
        return value;
    }

    public synchronized void setValue(final V value) {
        this.value = value;
    }

}
