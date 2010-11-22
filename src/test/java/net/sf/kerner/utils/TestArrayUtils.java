/**
 * 
 */
package net.sf.kerner.utils;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2010-11-21
 *
 */
public class TestArrayUtils {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.ArrayUtils#trim(char[], int)}.
	 */
	@Test
	public final void testArrayTrimCharArrayInt() {
		char[] arr = new char[4];
		assertArrayEquals(new char[]{'\0','\0','\0'}, ArrayUtils.trim(arr, 3));
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.ArrayUtils#trim(byte[], int)}.
	 */
	@Test
	public final void testArrayTrimByteArrayInt() {
		byte[] arr = new byte[]{1,2,3,4};
		assertArrayEquals(new byte[]{1,2,3}, ArrayUtils.trim(arr, 3));
		
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.ArrayUtils#trim(byte[], int)}.
	 */
	@Test
	public final void testArrayTrimByteArrayInt01() {
		byte[] arr = new byte[4];
		assertArrayEquals(new byte[]{0,0,0}, ArrayUtils.trim(arr, 3));
		
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.ArrayUtils#trim(int[], int)}.
	 */
	@Test
	public final void testArrayTrimIntArrayInt() {
		int[] arr = new int[4];
		assertArrayEquals(new int[]{0,0,0}, ArrayUtils.trim(arr, 3));
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.ArrayUtils#trim(int[], int)}.
	 */
	@Test
	public final void testArrayTrimIntArrayInt01() {
		int[] arr = new int[4];
		assertArrayEquals(new int[]{}, ArrayUtils.trim(arr, 0));
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.ArrayUtils#trim(int[], int)}.
	 */
	@Test
	public final void testArrayTrimIntArrayInt02() {
		int[] arr = new int[4];
		assertArrayEquals(arr, ArrayUtils.trim(arr, 9));
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.ArrayUtils#trim(int[], int)}.
	 */
	@Test
	public final void testArrayTrimIntArrayInt03() {
		int[] arr = new int[4];
		assertArrayEquals(new int[]{}, ArrayUtils.trim(arr, -1));
	}

}
