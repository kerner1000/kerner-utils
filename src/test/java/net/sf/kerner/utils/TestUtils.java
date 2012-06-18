/**
 * 
 */
package net.sf.kerner.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2012-04-13
 */
public class TestUtils {

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
    public final void testCheckForNull01() {
        Utils.checkForNull(new Object());
    }

    @Test
    public final void testCheckForNull02() {
        Utils.checkForNull(new Object(), new Object());
    }

    @Test
    public final void testCheckForNull03() {
        Utils.checkForNull(new Object(), 1);
    }

    @Test
    public final void testCheckForNull04() {
        Utils.checkForNull(0);
    }

    @Test(expected = NullPointerException.class)
    public final void testCheckForNull05() {
        Utils.checkForNull((Object[]) null);
    }

    @Test(expected = NullPointerException.class)
    public final void testCheckForNull06() {
        Utils.checkForNull(null, null);
    }

    @Test(expected = NullPointerException.class)
    public final void testCheckForNull07() {
        Utils.checkForNull(null, 1);
    }

    @Test
    public final void testDeepHashCode01() {
        assertEquals(6, Utils.deepHashCode(Arrays.asList(1, 2, 3)));
    }

    @Test
    public final void testDeepHashCode02() {
        assertEquals(7, Utils.deepHashCode(Arrays.asList(1, 2, 3, new Integer[] { 1 })));
    }

    @Test
    public final void testDeepHashCode03() {
        assertEquals(9,
                Utils.deepHashCode(Arrays.asList(1, 2, 3, new Integer[] { 1 }, new HashSet<Integer>(Arrays.asList(2)))));
    }

    @Test
    public final void testEqualsOnHashCode01() {
        assertFalse(Utils.equalsOnHashCode(new Object(), null));
    }

    @Test
    public final void testEqualsOnHashCode02() {
        assertFalse(Utils.equalsOnHashCode(null, new Object()));
    }

    @Test
    public final void testEqualsOnHashCode03() {
        assertTrue(Utils.equalsOnHashCode(null, null));
    }

    @Test
    public final void testEqualsOnHashCode04() {
        assertTrue(Utils.equalsOnHashCode(1, 1));
    }

    @Test
    public final void testEqualsOnHashCode05() {
        assertFalse(Utils.equalsOnHashCode(1, 2));
    }

}
