package net.sf.kerner.utils.progress;

public interface ProgressObservable {

    ProgressMonitor getProgressMonitor();

    void setProgressMonitor(ProgressMonitor monitor);

}
