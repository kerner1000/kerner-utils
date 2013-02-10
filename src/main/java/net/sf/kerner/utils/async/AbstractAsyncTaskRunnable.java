package net.sf.kerner.utils.async;


public abstract class AbstractAsyncTaskRunnable<R, V> extends
		AbstractAsyncTask<R, V> implements Runnable {

	protected V value;

	public synchronized V getValue() {
		return value;
	}

	public void run() {
		execute(getValue());
	}

	public synchronized void setValue(final V value) {
		this.value = value;
	}
}
