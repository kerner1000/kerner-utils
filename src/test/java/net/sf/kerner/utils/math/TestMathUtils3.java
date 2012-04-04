package net.sf.kerner.utils.math;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMathUtils3 {

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

	@Test
	public final void testGetClosest01() {
		double c = MathUtils.getClosest(2.1, 3, 2, 1);
		assertEquals(2, c, 0);
	}

	@Test
	public final void testGetClosest02() {
		double c = MathUtils.getClosest(0.9, 3, 2, 1);
		assertEquals(1, c, 0);
	}

	@Test
	public final void testGetClosest03() {
		double c = MathUtils.getClosest(0.9, 3, 1, 2, 1);
		assertEquals(1, c, 0);
	}

	@Test
	public final void testGetClosest04() {
		double c = MathUtils.getClosest(0.9, 3, 3, 1, 2, 1);
		assertEquals(1, c, 0);
	}

	@Test
	public final void testGetClosest05() {
		double c = MathUtils.getClosest(1.9, 0, 1, 2, 3);
		assertEquals(2, c, 0);
	}
}
