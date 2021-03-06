/*******************************************************************************
 * Copyright (c) 2010-2014 Alexander Kerner. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package net.sf.kerner.utils.async;

public abstract class AbstractAsyncTaskRunnable<R, V> extends AbstractAsyncTask<R, V> implements
        Runnable {

    protected V value;

    public synchronized V getValue() {
        return value;
    }

    /**
     * Don't override. Override {@link #run(Object)}
     */
    public void run() {
        execute(getValue());
    }

    public synchronized void setValue(final V value) {
        this.value = value;
    }
}
