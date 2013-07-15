package net.sf.kerner.utils;

import java.util.Collection;
import java.util.LinkedHashSet;

public class ModelNotifyingProto {

    public interface Listener {

        void notifyError(Throwable t);

        void notifyMessage(String msg);

        void notifyObject(Object o);
    }

    private final Collection<Listener> listeners = new LinkedHashSet<Listener>();

    public synchronized void addListener(final Listener listener) {
        listeners.add(listener);
    }

    protected void notifyError(final Throwable t) {
        for (final Listener l : listeners) {
            l.notifyError(t);
        }
    }

    protected void notifyMessage(final String msg) {
        for (final Listener l : listeners) {
            l.notifyMessage(msg);
        }
    }

    protected void notifyObject(final Object o) {
        for (final Listener l : listeners) {
            l.notifyObject(o);
        }
    }

    public synchronized void removeListener(final Listener listener) {
        listeners.remove(listener);
    }

}
