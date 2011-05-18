package net.sf.kerner.utils.async;


public abstract class AbstractAsyncTaskDelayed<O, I, K> extends AbstractAsyncTask<O, I> implements BatchListener<K>{

	private volatile O result;
	
	public void execute(final I value) {

		try {
			result = run(value);
		} catch (final Exception e) {
			doOnFailure(e);
		}
	}
	
	public void allDone(boolean error) {
		doOnSucess(result);		
	}
	
	public void errorOccured(K identifier, Exception error) {
		doOnFailure(error);
	};
}
