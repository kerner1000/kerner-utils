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
package net.sf.kerner.utils.callback;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Prototype implementation for {@link AsyncCallBack}.
 * <p>
 * This class is fully threadsave.
 * </p>
 * 
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2010-10-01
 * 
 * @param <R>
 *            type of result
 * @param <V>
 *            type of value
 */
public abstract class AbstractAsyncCallBack<R, V> implements AsyncCallBack<R, V> {

	// Field //

	/**
	 * 
	 */
	private final ExecutorService exe;

	// Constructor //

	/**
	 * 
	 * 
	 * Create a new {@code AbstractAsyncCallBack}.
	 * 
	 */
	public AbstractAsyncCallBack() {
		synchronized (AbstractAsyncCallBack.class) {
		exe = Executors.newCachedThreadPool();
		}
	}

	/**
	 * 
	 * 
	 * Create a new {@code AbstractAsyncCallBack} that uses given
	 * {@link java.util.concurrent.ExecutorService ExecutorService} for
	 * asynchronous execution of task.
	 * 
	 * @param exe
	 *            {@link java.util.concurrent.ExecutorService ExecutorService}
	 *            that is used for execution
	 */
	public AbstractAsyncCallBack(ExecutorService exe) {
		synchronized (AbstractAsyncCallBack.class) {
		this.exe = exe;
		}
	}

	// Private //

	// Protected //

	// Public //

	/**
	 * 
	 * 
	 * Execute this {@code AbstractAsyncCallBack}.
	 * 
	 * @param value
	 *            parameter for this {@code AbstractAsyncCallBack}
	 * 
	 */
	public synchronized void execute(final V value) {
		exe.execute(new Runnable() {
			public void run() {
				try {
					doOnSucess(AbstractAsyncCallBack.this.run(value));
				} catch (final Throwable t) {
					doOnFailure(t);
				}
			}
		});
	}
	
	public synchronized void shutdown(){
		exe.shutdown();
	}
	
	public synchronized void shutdownAndWait(long timeout, TimeUnit unit) throws InterruptedException{
		exe.shutdown();
		exe.awaitTermination(timeout, unit);
	}
	
	public synchronized void shutdownNow(){
		exe.shutdownNow();
	}
}
