package net.sf.kerner.utils;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestArrayUtils2 {

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
	public final void testEmptyArray01() {
		assertTrue(ArrayUtils.emptyArray(new Object[]{}));
	}
	
	@Test
	public final void testEmptyArray02() {
		assertTrue(ArrayUtils.emptyArray(null));
	}
	
	@Test
	public final void testEmptyArray03() {
		assertFalse(ArrayUtils.emptyArray(new Object[]{new Object()}));
	}
	
	@Test
	public final void testEmptyArray04() {
		assertFalse(ArrayUtils.emptyArray(new Object[]{new Object[]{new Integer(1)}}));
	}

	@Test
	public final void testNullArray01() {
		assertTrue(ArrayUtils.nullArray(null));
	}
	
	@Test
	public final void testNullArray02() {
		assertTrue(ArrayUtils.nullArray(new Object[]{}));
	}
	
	@Test
	public final void testNullArray03() {
		assertTrue(ArrayUtils.nullArray(new Object[]{null}));
	}
	
	@Test
	public final void testNullArray04() {
		assertTrue(ArrayUtils.nullArray(null));
	}
	
	@Test
	public final void testNullArray05() {
		assertTrue(ArrayUtils.nullArray(new Object[]{new Object[]{null}}));
	}
	
	@Test
	public final void testNullArray06() {
		assertFalse(ArrayUtils.nullArray(new Object[]{new Object[]{new Integer(1)}}));
	}
	
	@Test
	public final void testNullArray07() {
		assertFalse(ArrayUtils.nullArray(new Object[]{new Integer(1)}));
	}

	@Ignore
	@Test
	public final void testIsArray() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testToPrimitiveDoubleArray() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testToPrimitiveIntegerArray() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testToObjectDouble() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testToObjectDoubleArray() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testToObjectByte() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testToObjectByteArray() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testToObjectInt() {
		fail("Not yet implemented"); // TODO
	}

	@Ignore
	@Test
	public final void testToObjectIntArray() {
		fail("Not yet implemented"); // TODO
	}

}
