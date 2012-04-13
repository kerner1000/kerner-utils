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
 * 
 * A {@link RuntimeException} to indicate a missing property.
 * 
 * <p>
 * <b>Example:</b><br>
 *
 * </p>
 * <p>
 * <pre>
 * TODO example
 * </pre>
 * </p>
 *
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version Apr 13, 2012
 *
 */
public class PropertyNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4880504253227652735L;

	public PropertyNotFoundException() {

	}

	public PropertyNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);

	}

	public PropertyNotFoundException(String arg0) {
		super(arg0);

	}

	public PropertyNotFoundException(Throwable arg0) {
		super(arg0);

	}

}
