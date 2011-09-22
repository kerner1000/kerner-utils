package net.sf.kerner.utils.math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestDoubleUnitNano {

	private DoubleUnit u;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		u = DoubleUnit.NANO;
	}

	@After
	public void tearDown() throws Exception {
		u = null;
	}

	@Test
	public final void testToPicos01() {
		assertEquals(1.0E+3,u.toPicos(1),0);
	}
	

	@Test
	public final void testToNanos01() {
		assertEquals(1,u.toNanos(1),0);
	}

	@Test
	public final void testToMicros01() {
		assertEquals(1.0E-3,u.toMicros(1),0);
	}

	@Test
	public final void testToMillis01() {
		assertEquals(1.0E-6,u.toMillis(1),0);
	}

	@Test
	public final void testToUnits01() {
		assertEquals(1.0E-9,u.toUnits(1),0);
	}

	@Test
	public final void testToKilos01() {
		assertEquals(1.0E-12,u.toKilos(1),0);
	}

	@Test
	public final void testToMegas01() {
		assertEquals(1.0E-15,u.toMegas(1),0);
	}

	@Test
	public final void testToGigas() {
		assertEquals(1.0E-18,u.toGigas(1),0);
	}

	@Test
	public final void testToTeras() {
		assertEquals(1.0E-21,u.toTeras(1),0);
	}

	@Ignore("delegate method")
	@Test
	public final void testConvert() {
		fail("Not yet implemented"); // TODO
	}

}