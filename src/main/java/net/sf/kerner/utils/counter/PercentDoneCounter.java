package net.sf.kerner.utils.counter;

import java.util.ArrayList;
import java.util.List;

public class PercentDoneCounter extends Counter {

    public static interface Listener {
        void update(double percentDone);
    }

    private final List<Listener> listeners = new ArrayList<Listener>();

    public PercentDoneCounter(final int totalElements) {
        addRunnable(new Runnable() {
            public void run() {
                final double percent = (double) getCount() / (double) totalElements * 100;
                for (final Listener l : listeners) {
                    l.update(percent);
                }
            }
        });
    }

    public void addListener(final Listener listener) {
        listeners.add(listener);
    }

    public void clearListners() {
        listeners.clear();
    }
}
