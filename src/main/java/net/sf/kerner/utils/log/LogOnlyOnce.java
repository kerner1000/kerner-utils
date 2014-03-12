package net.sf.kerner.utils.log;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;

public class LogOnlyOnce {

    private final Set<String> logged = new HashSet<String>();

    private final Logger log;

    public LogOnlyOnce(final Logger log) {
        this.log = log;
    }

    public synchronized void debug(final String msg) {
        if (logged.contains(msg)) {
            return;
        }
        log.debug(msg);
        logged.add(msg);
    }

    public synchronized void debug(final String msg, final Exception exception) {
        if (logged.contains(msg)) {
            return;
        }
        log.debug(msg, exception);
        logged.add(msg);

    }

    public synchronized void info(final String msg) {
        if (logged.contains(msg)) {
            return;
        }
        log.info(msg);
        logged.add(msg);
    }

    public synchronized void reset() {
        logged.clear();
    }

    public synchronized void warn(final String msg) {
        if (logged.contains(msg)) {
            return;
        }
        log.warn(msg);
        logged.add(msg);
    }

}
