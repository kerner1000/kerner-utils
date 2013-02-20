package net.sf.kerner.utils.async;

public abstract class AbstractAsyncTask<R, V> implements AsyncTask<R, V> {

    /**
     * Execute this {@code AbstractAsyncCallBack}. <br>
     * Don't override. Override {@link #run(Object)}
     * 
     * 
     * @param value
     *            parameter for this {@code AbstractAsyncCallBack}
     */
    public void execute(final V value) {
        doBefore();
        try {
            doOnSucess(run(value));
        } catch (final Exception e) {
            doOnFailure(e);
        }
    }
}
