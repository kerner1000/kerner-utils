package net.sf.kerner.utils.progress;

public interface ProgressMonitor {

    public final static int UNKNOWN_WORKLOAD = -1;

    void finished();

    boolean isCancelled();

    void notifySubtask(String name);

    void setCancelled(boolean cancelled);

    void started(int totalWorkload);

    /**
     * Same as {@link #worked(1)}.
     */
    void worked();

    void worked(int i);

}
