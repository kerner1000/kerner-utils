/**********************************************************************
Copyright (c) 2009-2010 Alexander Kerner. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 ***********************************************************************/

package net.sf.kerner.utils.counter;

/**
 * <p>
 * An {@code Counter} can be used to monitor program behavior or to keep track
 * of some progress, e.g. how many loop cycles have already been performed.
 * </p>
 * <p>
 * This class is fully threadsave.
 * </p>
 * 
 * <p>
 * Example:
 * 
 * <pre>
 * TODO example
 * </pre>
 * 
 * </p>
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2010-10-06
 * 
 * 
 */
public class Counter {

	// Field //

	private volatile int interval = 0;
	private volatile int intervalHelper = 0;
	private volatile int cnt = 0;
	private final int initCnt;
	private final Runnable runner;

	// Constructor //

	/**
	 * Create a new {@code Counter} that has initially performed zero counts and
	 * will do nothing on call of {@link Counter#perform()}.
	 */
	public Counter() {
		// all zero
		initCnt = 0;
		runner = new Runnable() {
			public void run() {
				// do nothing
			}
		};
	}

	/**
	 * Create a new {@code Counter} that has initially performed zero counts and
	 * will execute [@code runner} on call of {@link Counter#perform()}.
	 */
	public Counter(Runnable runner) {
		// all zero
		initCnt = 0;
		this.runner = runner;
	}

	/**
	 * <p>
	 * Construct a new {@code Counter} with has initially performed
	 * {@code count} counts and will do nothing on call of
	 * {@link Counter#perform()}. {@link Counter#getCount()} will return
	 * {@code count}.
	 * </p>
	 * 
	 * @param count
	 *            Initial counting for this {@code Counter}.
	 */
	public Counter(int count) {
		synchronized (Counter.class) {
			this.cnt = count;
			this.intervalHelper = count;
			this.initCnt = count;
			runner = new Runnable() {
				public void run() {
					// do nothing
				}
			};
		}
	}

	/**
	 * <p>
	 * Construct a new {@code Counter} with has initially performed
	 * {@code count} counts and will execute [@code runner} on call of
	 * {@link Counter#perform()}. {@link Counter#getCount()} will return
	 * {@code count}.
	 * </p>
	 * 
	 * @param count
	 *            Initial counting for this {@code Counter}.
	 */
	public Counter(int count, Runnable runner) {
		synchronized (Counter.class) {
			this.cnt = count;
			this.intervalHelper = count;
			this.initCnt = count;
			this.runner = runner;
		}
	}

	// Private //

	private void checkPerform() {
		if (intervalHelper >= interval) {
			perform();
			intervalHelper = 0;
		}
	}

	// Protected //
	
	// Default //

	// Public //

	/**
	 * <p>
	 * Increase counter by 1.
	 * </p>
	 */
	public synchronized void count() {
		cnt++;
		intervalHelper++;
		checkPerform();
	}

	/**
	 * <p>
	 * Resets this {@code Counter} and calls
	 * {@link Counter#perform()} if there has been any counts after last
	 * call of {@link Counter#perform()}.
	 * </p>
	 */
	public synchronized void finish() {
		if (interval != 0)
			perform();
		intervalHelper = initCnt;
		cnt = initCnt;
		interval = 0;
	}

	/**
	 * <p>
	 * Sets {@code interval} for this {@code Counter}.
	 * </p>
	 * 
	 * @param interval
	 *            number of counts {@link Counter#count()} has to be
	 *            called before {@linkCounter#perform()} is called.
	 * @throws NumberFormatException
	 *             if {@code interval} < 1
	 */
	public synchronized void setInterval(int interval) {
		if (interval < 0)
			throw new NumberFormatException("interval must be >= 0");
		this.interval = interval;
	}

	/**
	 * @return current interval for this {@code Counter}.
	 */
	public int getInterval() {
		return interval;
	}

	/**
	 * <p>
	 * Returns the number of {@link Counter#count()} has been called.
	 * </p>
	 * 
	 * @return current counts
	 */
	public int getCount() {
		return cnt;
	}

	/**
	 * <p>
	 * Returns the init value of {@link Counter#cnt}.
	 * </p>
	 * 
	 * @return init count
	 */
	public int getInitCount() {
		return initCnt;
	}

	/**
	 * 
	 * <p>
	 * Set {@code count}.
	 * </p>
	 * 
	 * 
	 * @param count
	 *            {@code count} to set
	 */
	public synchronized void setCount(int count) {
		this.cnt = count;
		this.intervalHelper = count;
	}

	// Override //

	@Override
	public String toString() {
		return Integer.toString(getCount());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cnt;
		result = prime * result + interval;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Counter))
			return false;
		Counter other = (Counter) obj;
		if (cnt != other.cnt)
			return false;
		if (interval != other.interval)
			return false;
		return true;
	}

	/**
	 * <p>
	 * Performs action.
	 * </p>
	 */
	public void perform(){
		runner.run();
	}

}
