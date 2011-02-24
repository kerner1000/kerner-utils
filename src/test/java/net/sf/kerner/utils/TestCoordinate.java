/**
 * 
 */
package net.sf.kerner.utils;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version Feb 24, 2011
 *
 */
@RunWith(Parameterized.class)
public class TestCoordinate {
	
	private Coordinate x;
	
	private Coordinate y;
	
	private double result;

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
	
	@Parameters
	public static Collection<Object[]> getParams() {
		return Arrays.asList(new Object[][] {
				
				// x, y
				
				{new Coordinate(1,1), new Coordinate(2,2), 1},
				{new Coordinate(1,1), new Coordinate(2,3), 2},
				{new Coordinate(1,1), new Coordinate(1,1), 0},
				{new Coordinate(1,1), new Coordinate(3,2), 0.5},
		});
	}
	
	public TestCoordinate(Coordinate x, Coordinate y, double result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.Coordinate#getSlope(net.sf.kerner.utils.Coordinate, net.sf.kerner.utils.Coordinate)}.
	 */
	@Test
	public final void testGetSlope() {
		assertEquals(result, Coordinate.getSlope(x, y),0 );
	}

}
