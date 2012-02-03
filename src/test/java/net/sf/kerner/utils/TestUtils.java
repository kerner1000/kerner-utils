/**
 * 
 */
package net.sf.kerner.utils;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2010-11-21
 *
 */
public class TestUtils {

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
	 * Test method for {@link net.sf.kerner.utils.Utils#checkForNull(java.lang.Object[])}.
	 */
	@Test
	public final void testCheckForNull() {
		Utils.checkForNull(new Object());
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.Utils#checkForNull(java.lang.Object[])}.
	 */
	@Test
	public final void testCheckForNull01() {
		Utils.checkForNull(new Object(),new Object());
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.Utils#checkForNull(java.lang.Object[])}.
	 */
	@Test
	public final void testCheckForNull02() {
		Utils.checkForNull(new Object(),1);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.Utils#checkForNull(java.lang.Object[])}.
	 */
	@Test
	public final void testCheckForNull03() {
		Utils.checkForNull(0);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.Utils#checkForNull(java.lang.Object[])}.
	 */
	@Test(expected=NullPointerException.class)
	public final void testCheckForNull04() {
		Utils.checkForNull((Object[])null);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.Utils#checkForNull(java.lang.Object[])}.
	 */
	@Test(expected=NullPointerException.class)
	public final void testCheckForNull05() {
		Utils.checkForNull(null,null);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.Utils#checkForNull(java.lang.Object[])}.
	 */
	@Test(expected=NullPointerException.class)
	public final void testCheckForNull06() {
		Utils.checkForNull(null,1);
	}
	
	@Test
	public final void testGetHashCodeCollectionOfObject01(){
		assertEquals(6, Utils.getHashCode(Arrays.asList(1, 2, 3)));
	}
	
	@Test
	public final void testGetHashCodeCollectionOfObject02(){
		assertEquals(7, Utils.getHashCode(Arrays.asList(1, 2, 3, new Integer[]{1})));
	}
	
	@Test
	public final void testGetHashCodeCollectionOfObject03(){
		assertEquals(9, Utils.getHashCode(Arrays.asList(1, 2, 3, new Integer[]{1}, new HashSet<Integer>(Arrays.asList(2)))));
	}

}
