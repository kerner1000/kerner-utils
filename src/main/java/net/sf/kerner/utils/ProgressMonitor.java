package net.sf.kerner.utils;

public interface ProgressMonitor {

    void finished();

    boolean isCancelled();

    void setCancelled(boolean cancelled);

    void started(int totalWorkload);

    void worked(int i);

}
