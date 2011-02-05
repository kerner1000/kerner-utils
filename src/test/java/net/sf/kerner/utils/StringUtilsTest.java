/**
 * 
 */
package net.sf.kerner.utils;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2011-01-13
 *
 */
public class StringUtilsTest {

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
	 * Test method for {@link net.sf.kerner.utils.StringUtils#emptyString(java.lang.String)}.
	 */
	@Test
	public final void testEmptyString() {
		assertTrue(StringUtils.emptyString(null));
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.StringUtils#emptyString(java.lang.String)}.
	 */
	@Test
	public final void testEmptyString01() {
		assertTrue(StringUtils.emptyString(""));
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.StringUtils#emptyString(java.lang.String)}.
	 */
	@Test
	public final void testEmptyString02() {
		assertTrue(StringUtils.emptyString(" "));
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.StringUtils#emptyString(java.lang.String)}.
	 */
	@Test
	public final void testEmptyString03() {
		assertFalse(StringUtils.emptyString(" a "));
	}

}
