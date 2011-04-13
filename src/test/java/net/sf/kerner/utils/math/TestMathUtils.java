/**
 * 
 */
package net.sf.kerner.utils.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2011-04-13
 *
 */
public class TestMathUtils {

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
	 * Test method for {@link net.sf.kerner.utils.math.MathUtils#round(double, int)}.
	 */
	@Test
	public final void testRound() {
		assertEquals(1.0, MathUtils.round(1.0123, 1), 0);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.math.MathUtils#round(double, int)}.
	 */
	@Test
	public final void testRound01() {
		assertEquals(1.00, MathUtils.round(1.00123, 2), 0);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.math.MathUtils#round(double, int)}.
	 */
	@Test
	public final void testRound02() {
		assertEquals(1.000, MathUtils.round(1.000123, 3), 0);
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.math.MathUtils#round(double, int)}.
	 */
	@Test
	public final void testRound03() {
		assertEquals(1.0000, MathUtils.round(1.0000123, 4), 0);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.math.MathUtils#round(double, int)}.
	 */
	@Test
	public final void testRound04() {
		assertEquals(10.0000, MathUtils.round(10.0000123, 4), 0);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.math.MathUtils#round(double, int)}.
	 */
	@Test
	public final void testRound05() {
		assertEquals(1000000.0000, MathUtils.round(1000000.0000123, 4), 0);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.math.MathUtils#round(double, int)}.
	 */
	@Test
	public final void testRound06() {
		assertEquals(10000000.0000, MathUtils.round(10000000.0000123, 4), 0);
	}
}
