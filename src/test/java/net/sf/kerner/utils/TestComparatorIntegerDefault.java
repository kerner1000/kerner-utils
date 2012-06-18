package net.sf.kerner.utils;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestComparatorIntegerDefault {

    private ComparatorIntegerDefault c;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        c = new ComparatorIntegerDefault();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public final void testCompare01() {
        assertTrue(0 > c.compare(Integer.valueOf(1), Integer.valueOf(2)));
    }

    @Test
    public final void testCompare02() {
        assertTrue(0 < c.compare(Integer.valueOf(3), Integer.valueOf(0)));
    }

    @Test
    public final void testCompare03() {
        assertTrue(0 == c.compare(Integer.valueOf(3), Integer.valueOf(3)));
    }

}
