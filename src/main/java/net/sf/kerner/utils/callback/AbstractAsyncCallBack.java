package net.sf.kerner.utils.callback;

public abstract class AbstractAsyncCallBack<R, V> implements AsyncCallBack<R, V> {

	/**
	 * 
	 * 
	 * Execute this {@code AbstractAsyncCallBack}.
	 * 
	 * @param value
	 *            parameter for this {@code AbstractAsyncCallBack}
	 * 
	 */
	public void execute(final V value) {

		try {
			doOnSucess(run(value));
		} catch (final Exception e) {
			doOnFailure(e);
		}
	}
}
