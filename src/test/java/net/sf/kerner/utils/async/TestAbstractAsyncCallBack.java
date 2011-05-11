/**
 * 
 */
package net.sf.kerner.utils.async;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

import net.sf.kerner.utils.async.AbstractAsyncCallBack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 *
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2010-11-21
 *
 */
public class TestAbstractAsyncCallBack {
	
	private AbstractAsyncCallBack<String, String> call;
	
//	private volatile boolean success;
	
	private volatile String res;
	
	private volatile Exception failure;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
//		success = false;
		failure = null;
		res = null;
		call = new AbstractAsyncCallBack<String, String>() {
			
			public String run(String value) throws Exception {
				return "gut"+value;
			}
			
			public void doOnSucess(String result) {
				res = result;
			}
			
			public void doOnFailure(Exception t) {
				failure = t;
			}
		};
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.async.AbstractAsyncCallBack#AbstractAsyncCallBack()}.
	 */
	@Test
	public final void testAbstractAsyncCallBack() {
		new AbstractAsyncCallBack<String, String>() {

			public String run(String value) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}

			public void doOnSucess(String result) {
				// TODO Auto-generated method stub
				
			}

			public void doOnFailure(Exception t) {
				// TODO Auto-generated method stub
				
			}
		};
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.async.AbstractAsyncCallBack#AbstractAsyncCallBack(java.util.concurrent.ExecutorService)}.
	 */
	@Test
	public final void testAbstractAsyncCallBackExecutorService() {
		new AbstractAsyncCallBack<String, String>() {

			public String run(String value) throws Exception {
				// TODO Auto-generated method stub
				return null;
			}

			public void doOnSucess(String result) {
				// TODO Auto-generated method stub
				
			}

			public void doOnFailure(Exception t) {
				// TODO Auto-generated method stub
				
			}
		};
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.async.AbstractAsyncCallBack#execute(java.lang.Object)}.
	 * @throws InterruptedException 
	 */
	@Test
	public final void testExecute01() throws InterruptedException {
		call = new AbstractAsyncCallBack<String, String>() {

			public String run(String value) throws Exception {
				throw new IllegalAccessException();
			}

			public void doOnSucess(String result) {
				// TODO Auto-generated method stub
			}

			public void doOnFailure(Exception t) {
				failure = t;
			}
		};
		call.execute("hallo");
		assertEquals(IllegalAccessException.class, failure.getClass());
	}
}
