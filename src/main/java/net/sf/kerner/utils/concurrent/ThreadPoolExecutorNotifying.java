package net.sf.kerner.utils.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorNotifying extends ThreadPoolExecutor {

    public static ThreadPoolExecutorNotifying build(final int numCPUs) {
        return new ThreadPoolExecutorNotifying(numCPUs, numCPUs, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }

    private String identifier;

    private final List<FutureTaskNotifying.ListenerDone> listeners = new ArrayList<FutureTaskNotifying.ListenerDone>();

    public ThreadPoolExecutorNotifying(final int corePoolSize, final int maximumPoolSize, final long keepAliveTime,
            final TimeUnit unit, final BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    public ThreadPoolExecutorNotifying(final int corePoolSize, final int maximumPoolSize, final long keepAliveTime,
            final TimeUnit unit, final BlockingQueue<Runnable> workQueue, final RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
    }

    public ThreadPoolExecutorNotifying(final int corePoolSize, final int maximumPoolSize, final long keepAliveTime,
            final TimeUnit unit, final BlockingQueue<Runnable> workQueue, final ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
    }

    public ThreadPoolExecutorNotifying(final int corePoolSize, final int maximumPoolSize, final long keepAliveTime,
            final TimeUnit unit, final BlockingQueue<Runnable> workQueue, final ThreadFactory threadFactory,
            final RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }

    public synchronized <T> void addListenerDone(final FutureTaskNotifying.ListenerDone listener) {
        listeners.add(listener);
    }

    public synchronized String getIdentifier() {
        return identifier;
    }

    @Override
    protected synchronized <T> RunnableFuture<T> newTaskFor(final Callable<T> callable) {
        final FutureTaskNotifying<T> hannes = new FutureTaskNotifying<T>(callable, identifier);
        identifier = null;
        hannes.addAllListener(listeners);
        return hannes;
    }

    @Override
    protected synchronized <T> RunnableFuture<T> newTaskFor(final Runnable runnable, final T value) {
        if (identifier == null) {
            identifier = "n/a";
        }
        final FutureTaskNotifying<T> hannes = new FutureTaskNotifying<T>(runnable, value, new String(identifier));
        identifier = null;
        hannes.addAllListener(listeners);
        return hannes;
    }

    public synchronized void setIdentifier(final String identifier) {
        this.identifier = identifier;
    }

}
