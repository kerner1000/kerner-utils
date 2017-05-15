/*******************************************************************************
 * Copyright (c) 2017 Alexander Kerner. All rights reserved.
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

package net.sf.kerner.utils.objects;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Objects {

    /**
     * Transforms given byte array into an object.
     *
     * @param bytes
     *            byte array to transform
     * @return object representation of given byte array
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Object fromBytes(final byte[] bytes) throws IOException, ClassNotFoundException {
	final ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
	ObjectInput in = null;
	try {
	    in = new ObjectInputStream(bis);
	    final Object o = in.readObject();
	    return o;
	} finally {
	    try {
		if (in != null) {
		    in.close();
		}
	    } catch (final IOException ex) {
		// ignore close exception
	    }
	}
    }

    /**
     * Transforms given object into a byte array.
     *
     * @param o
     *            {@code Object} to transform
     * @return byte array representation of given object
     * @throws IOException
     */
    public static byte[] toBytes(final Object o) throws IOException {
	final ByteArrayOutputStream bos = new ByteArrayOutputStream();
	ObjectOutput out = null;
	try {
	    out = new ObjectOutputStream(bos);
	    out.writeObject(o);
	    out.flush();
	    final byte[] result = bos.toByteArray();
	    return result;
	} finally {
	    try {
		bos.close();
	    } catch (final IOException ex) {
		// ignore close exception
	    }
	}
    }
}
