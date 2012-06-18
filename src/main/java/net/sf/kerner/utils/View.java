/**********************************************************************
Copyright (c) 2012 Alexander Kerner. All rights reserved.
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
 * A {@code View} is a custom representation of another object. It is a {@link Transformer}, that will transform any
 * object of type {@code T} into a view to this object of type {code V}.
 * <p>
 * <b>Example:</b><br>
 * </p>
 * <p>
 * 
 * <pre>
 * TODO example
 * </pre>
 * 
 * </p>
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version Apr 13, 2012
 * @param <T>
 *            type of object from which a view is created
 * @param <V>
 *            type of view object
 * @deprecated use {@link Transformer} instead
 */
@Deprecated
public interface View<T, V> extends Transformer<T, V> {

}
