package net.sf.kerner.utils;

public interface ProgressMonitor {

    public final static int UNKNOWN_WORKLOAD = -1;

    void finished();

    boolean isCancelled();

    void setCancelled(boolean cancelled);

    void started(int totalWorkload);

    void worked(int i);

}
