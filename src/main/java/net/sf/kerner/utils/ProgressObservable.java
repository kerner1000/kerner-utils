package net.sf.kerner.utils;

public interface ProgressObservable {

    ProgressMonitor getProgressMonitor();

    void setProgressMonitor(ProgressMonitor monitor);

}
