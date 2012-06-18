package net.sf.kerner.utils.async;

public abstract class AbstractAsyncTask<R, V> implements AsyncTask<R, V> {

    /**
     * Execute this {@code AbstractAsyncCallBack}.
     * 
     * @param value
     *            parameter for this {@code AbstractAsyncCallBack}
     */
    public void execute(final V value) {

        try {
            doOnSucess(run(value));
        } catch (final Exception e) {
            doOnFailure(e);
        }
    }
}
