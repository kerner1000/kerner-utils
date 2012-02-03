package net.sf.kerner.utils.counter;

import org.slf4j.Logger;

public class PercentDoneCounter extends Counter {
	
	public PercentDoneCounter(final Logger log, final int totalElements) {
		addRunnable(new Runnable() {
			public void run() {
				double percent = (double) getCount() / (double) totalElements * 100;
				log.info(String.format("%5.2f", percent) + "% done");
			}
		});
	}
}
