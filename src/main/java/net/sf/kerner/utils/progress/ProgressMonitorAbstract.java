package net.sf.kerner.utils.progress;


public abstract class ProgressMonitorAbstract implements ProgressMonitor {

    private boolean cancelled;

    public ProgressMonitorAbstract() {

    }

    public synchronized boolean isCancelled() {
        return cancelled;
    }

    public synchronized void setCancelled(final boolean cancelled) {
        this.cancelled = cancelled;
    }

}
