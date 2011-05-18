package net.sf.kerner.utils.async;

public interface BatchListener<I> {
	void allDone(boolean error);
	void errorOccured(I identifier, Exception error);
}
