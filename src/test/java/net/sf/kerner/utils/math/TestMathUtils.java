/**
 * 
 */
package net.sf.kerner.utils.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2011-08-23
 *
 */
public class TestMathUtils {

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
