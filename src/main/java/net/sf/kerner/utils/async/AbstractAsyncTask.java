package net.sf.kerner.utils.async;

public abstract class AbstractAsyncTask<R, V> implements AsyncTask<R, V> {

    public void execute(final V value) {
        doBefore();
        try {
            doOnSucess(run(value));
        } catch (final Exception e) {
            doOnFailure(e);
        }
    }
}
