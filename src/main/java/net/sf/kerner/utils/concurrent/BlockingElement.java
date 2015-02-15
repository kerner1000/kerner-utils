package net.sf.kerner.utils.concurrent;

public class BlockingElement<T> {

    private final Object lock;

    private T t = null;

    private boolean released = false;

    public BlockingElement() {
        this(new Object());
    }

    public BlockingElement(final Object lock) {
        this.lock = lock;
    }

    /**
     * Blocks until {@code t} becomes available.
     *
     * @return {@code t} or {@code null} if lock was released
     * @see #releaseLock()
     * @throws InterruptedException
     */
    public T get() throws InterruptedException {
        synchronized (lock) {
            while (t == null && !released) {
                lock.wait();
            }
            return t;
        }
    }

    /**
     * Does not block.
     * 
     * @return {@code true} if {@code t} is not {@code null} or if block was
     *         released; {@code false} otherwise
     * @see #releaseLock()
     */
    public boolean isAvailable() {
        // Must not block
        synchronized (lock) {
            return t != null || released;
        }
    }

    public void releaseLock() {
        synchronized (lock) {
            this.released = true;
            lock.notifyAll();
        }
    }

    /**
     * Does not block.
     */
    public void set(final T t) {
        if (t == null)
            throw new IllegalArgumentException();
        // Must not block
        synchronized (lock) {
            this.released = false;
            this.t = t;
            lock.notifyAll();
        }
    }
}
