/**
 * 
 */
package net.sf.kerner.utils.math;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import net.sf.kerner.utils.Point;

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
	
	@Test
	public final void testGetPositionsOfExtremSlopes01(){
		final List<Point> points = Arrays.asList();
		final List<Integer> out = MathUtils.getPositionsOfExtremSlopes(points, 1, true);
		assertNotNull(out);
	}
	
	@Test
	public final void testGetPositionsOfExtremSlopes02(){
		final List<Point> points = Arrays.asList();
		final List<Integer> out = MathUtils.getPositionsOfExtremSlopes(points, 1, true);
		assertTrue(out.isEmpty());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public final void testGetPositionsOfExtremSlopes03(){
		final List<Point> points = Arrays.asList();
		MathUtils.getPositionsOfExtremSlopes(points, -1);
	}
	
	@Test
	public final void testGetPositionsOfExtremSlopes04(){
		final List<Point> points = Arrays.asList(new Point(0,0), new Point(1,1));
		final List<Integer> out = MathUtils.getPositionsOfExtremSlopes(points, 0, true);
		assertArrayEquals(new Integer[]{0}, out.toArray());
	}
	
	@Test
	public final void testGetPositionsOfExtremSlopes05(){
		final List<Point> points = Arrays.asList(new Point(0,0), new Point(1,1), new Point(0,-1));
		final List<Integer> out = MathUtils.getPositionsOfExtremSlopes(points, 1, true);
		assertArrayEquals(new Integer[]{1}, out.toArray());
	}
	
	@Test
	public final void testGetPositionsOfExtremSlopes06(){
		final List<Point> points = Arrays.asList(new Point(0,0), new Point(1,1), new Point(0,2.5));
		final List<Integer> out = MathUtils.getPositionsOfExtremSlopes(points, 1, true);
		assertArrayEquals(new Integer[]{1}, out.toArray());
	}
	
	@Test
	public final void testGetAverageSlope01(){
		final List<Point> points = Arrays.asList(new Point(0,0), new Point(1,1), new Point(2,2));
		assertEquals(1, MathUtils.getAverageSlope(points, false), 0);
	}
	
	@Test
	public final void testGetAverageSlope02(){
		final List<Point> points = Arrays.asList(new Point(0,0), new Point(1,1), new Point(2,2), new Point(2,2));
		assertEquals(0.666, MathUtils.getAverageSlope(points, false), 0.001);
	}
}
