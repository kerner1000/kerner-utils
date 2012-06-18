package net.sf.kerner.utils.counter;

import java.util.concurrent.TimeUnit;

import net.sf.kerner.utils.time.StopWatch;

import org.slf4j.Logger;

public class PercentDoneCounterWatch extends PercentDoneCounter {

    public PercentDoneCounterWatch(final Logger log, final int totalElements, final TimeUnit unit) {
        super(log, totalElements);
        final StopWatch w = new StopWatch();
        w.start();
        addRunnable(new Runnable() {
            public void run() {
                log.info("took: " + String.format("%3d", w.stop().getDuration(unit)) + " " + unit);
                w.start();
            }
        });
    }
}
