package net.sf.kerner.utils.impl;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestObjectPairImpl {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    private ObjectPairImpl<Integer, Integer> ob1, ob2;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public final void testHashCode01() {
        ob1 = new ObjectPairImpl<Integer, Integer>(1, 2);
        ob2 = new ObjectPairImpl<Integer, Integer>(2, 1);
        assertFalse(ob1.hashCode() == ob2.hashCode());
    }

}
