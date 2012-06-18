package net.sf.kerner.utils;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestViewKeyValueValue {

    private KeyValue<String, String> k;

    private ViewKeyValueValue<String> v;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        v = new ViewKeyValueValue<String>();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public final void testTransform01() {
        k = new KeyValue<String, String>("key", "value");
        assertEquals("value", v.transform(k));
    }

}
