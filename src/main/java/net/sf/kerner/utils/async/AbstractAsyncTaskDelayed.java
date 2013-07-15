package net.sf.kerner.utils.async;

public abstract class AbstractAsyncTaskDelayed<O, I, K> extends AbstractAsyncTask<O, I> implements BatchListener<K> {

    private volatile O result;

    public void allDone(final boolean error) {
        doOnSucess(result);
    }

    public void errorOccured(final K identifier, final Exception error) {
        doOnFailure(error);
    }

    /**
     * Execute this {@code AbstractAsyncCallBack}. <br>
     * Don't override. Override {@link #run(Object)}
     * 
     * 
     * @param value
     *            parameter for this {@code AbstractAsyncCallBack}
     */
    @Override
    public final void execute(final I value) {

        try {
            result = run(value);
        } catch (final Exception e) {
            doOnFailure(e);
        }
    };
}
