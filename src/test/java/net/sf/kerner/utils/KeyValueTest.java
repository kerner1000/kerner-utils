/**
 * 
 */
package net.sf.kerner.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2011-01-13
 *
 */
public class KeyValueTest {
	
	private String key1;
	
	private String key2;
	
	private KeyValue<String, String> k1;
	
	private KeyValue<String, String> k2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		key1 = "key1";
		key2 = "key2";
		k1 = new KeyValue<String, String>(key1);
		k2 = new KeyValue<String, String>(key2);
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#hashCode()}.
	 */
	@Test
	public final void testHashCode() {
		assertNotSame(key1.hashCode(), key2.hashCode());
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#hashCode()}.
	 */
	@Test
	public final void testHashCode01() {
		k2 = new KeyValue<String, String>(key1);
		assertEquals(k1.hashCode(), k2.hashCode());
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#KeyValue(java.lang.Object, java.lang.Object)}.
	 */
	@Test
	public final void testKeyValueKV() {
		k1 = new KeyValue<String, String>("key1", "value1");
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#KeyValue(java.lang.Object, java.lang.Object)}.
	 */
	@Test
	public final void testKeyValueKV01() {
		k1 = new KeyValue<String, String>("key1", "value1");
		assertEquals("key1", k1.getKey());
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#KeyValue(java.lang.Object, java.lang.Object)}.
	 */
	@Test
	public final void testKeyValueKV02() {
		k1 = new KeyValue<String, String>("key1", "value");
		assertEquals("value", k1.getValue());
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#KeyValue(java.lang.Object, java.lang.Object)}.
	 */
	@Test(expected=NullPointerException.class)
	public final void testKeyValueKV03() {
		k1 = new KeyValue<String, String>(null, null);
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#KeyValue(java.lang.Object)}.
	 */
	@Test(expected=NullPointerException.class)
	public final void testKeyValueK() {
		k1 = new KeyValue<String, String>((KeyValue<String, String>)null);
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#KeyValue(net.sf.kerner.utils.KeyValue)}.
	 */
	@Test
	public final void testKeyValueKeyValueOfKV() {
		k1 = new KeyValue<String, String>(k2);
		assertEquals(k2.getKey(), k1.getKey());
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#KeyValue(net.sf.kerner.utils.KeyValue)}.
	 */
	@Test
	public final void testKeyValueKeyValueOfKV01() {
		k1 = new KeyValue<String, String>(k2);
		assertEquals(k2.getValue(), k1.getValue());
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject() {
		k1 = new KeyValue<String, String>(k2);
		assertEquals(k1, k2);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject01() {
		assertEquals(k1, k1);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject02() {
		k2 = new KeyValue<String, String>("key1", null);
		assertEquals(k1, k2);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject03() {
		k1 = new KeyValue<String, String>("key1", "value");
		k2 = new KeyValue<String, String>("key1", "value");
		assertEquals(k1, k2);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#equals(java.lang.Object)}.
	 */
	@Test
	public final void testEqualsObject04() {
		assertNotSame(k1, k2);
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#getKey()}.
	 */
	@Test
	@Ignore
	public final void testGetKey() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#getValue()}.
	 */
	@Test
	@Ignore
	public final void testGetValue() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.KeyValue#setValue(java.lang.Object)}.
	 */
	@Test
	public final void testSetValue() {
		k2.setValue("hans");
		assertEquals("hans", k2.getValue());
	}

}
