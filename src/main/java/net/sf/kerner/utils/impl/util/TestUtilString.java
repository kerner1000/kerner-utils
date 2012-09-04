package net.sf.kerner.utils.impl.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestUtilString {

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

    @Ignore
    @Test
    public final void testEmptyString() {
        fail("Not yet implemented");
    }

    @Ignore
    @Test
    public final void testReplaceAllNewLine() {
        fail("Not yet implemented");
    }

    @Test
    public final void testTrimmMultiWhiteSpaceToOne01() {
        final String input = "  x  ";
        assertEquals("x", UtilString.trimAndReduceWhiteSpace(input));
    }

    @Test
    public final void testTrimmMultiWhiteSpaceToOne02() {
        final String input = "  x\t\t";
        assertEquals("x", UtilString.trimAndReduceWhiteSpace(input));
    }

    @Test
    public final void testTrimmMultiWhiteSpaceToOne03() {
        final String input = "  x\t";
        assertEquals("x", UtilString.trimAndReduceWhiteSpace(input));
    }

    @Test
    public final void testTrimmMultiWhiteSpaceToOne04() {
        final String input = "  1   2   3  ";
        assertEquals("1 2 3", UtilString.trimAndReduceWhiteSpace(input));
    }

    @Test
    public final void testTrimmMultiWhiteSpaceToOne05() {
        final String input = "  1\t2\t3  ";
        assertEquals("1 2 3", UtilString.trimAndReduceWhiteSpace(input));
    }

    @Test
    public final void testTrimmMultiWhiteSpaceToOne06() {
        final String input = "  1\t\t2\t\t3  ";
        assertEquals("1 2 3", UtilString.trimAndReduceWhiteSpace(input));
    }

}
