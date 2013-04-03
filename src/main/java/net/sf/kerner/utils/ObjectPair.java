/**********************************************************************
Copyright (c) 2013 Alexander Kerner. All rights reserved.
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

package net.sf.kerner.utils;

/**
 * 
 * A Pair of Objects.
 * 
 * <p>
 * <b>Example:</b><br>
 * 
 * </p>
 * <p>
 * 
 * <pre>
 * TODO example
 * </pre>
 * 
 * </p>
 * <p>
 * last reviewed: 2013-04-03
 * </p>
 * 
 * @author <a href="mailto:alexanderkerner24@gmail.com">Alexander Kerner</a>
 * @version 2013-04-03
 * 
 * @param <F>
 *            type of first Object
 * @param <S>
 *            type of second Object
 */
public interface ObjectPair<F, S> {

    /**
     * clones this {@code ObjectPair}.
     * 
     * @return a new instance of {@code ObjectPair}, holding same {@code first}
     *         and {@code second} as this {@code ObjectPair}
     */
    ObjectPair<F, S> clone();

    F getFirst();

    S getSecond();

    /**
     * inverts this {@code ObjectPair}, returning a new {@code ObjectPair} where
     * {@code first} and {@code second} are switched.
     * 
     * @return an inverted {@code ObjectPair}
     */
    ObjectPair<S, F> invert();

}
