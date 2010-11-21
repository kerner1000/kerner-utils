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
		int[] arr = new int[]{1,2,3,4};
		assertArrayEquals(new int[]{1,2,3}, ArrayUtils.trim(arr, 3));
		
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.ArrayUtils#trim(byte[], int)}.
	 */
	@Test
	public final void testArrayTrimByteArrayInt01() {
		int[] arr = new int[4];
		assertArrayEquals(new int[]{0,0,0}, ArrayUtils.trim(arr, 3));
		
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.ArrayUtils#trim(int[], int)}.
	 */
	@Test
	@Ignore("Identical to int[]")
	public final void testArrayTrimIntArrayInt() {
		fail("Not yet implemented"); // TODO
	}

}
