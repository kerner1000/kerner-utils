/**
 * 
 */
package net.sf.kerner.utils.callback;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

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
	
	private volatile Throwable failure;

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
			
			public String run(String value) throws Throwable {
				return "gut"+value;
			}
			
			public void doOnSucess(String result) {
				res = result;
			}
			
			public void doOnFailure(Throwable t) {
				failure = t;
			}
		};
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.callback.AbstractAsyncCallBack#AbstractAsyncCallBack()}.
	 */
	@Test
	public final void testAbstractAsyncCallBack() {
		new AbstractAsyncCallBack<String, String>() {

			public String run(String value) throws Throwable {
				// TODO Auto-generated method stub
				return null;
			}

			public void doOnSucess(String result) {
				// TODO Auto-generated method stub
				
			}

			public void doOnFailure(Throwable t) {
				// TODO Auto-generated method stub
				
			}
		};
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.callback.AbstractAsyncCallBack#AbstractAsyncCallBack(java.util.concurrent.ExecutorService)}.
	 */
	@Test
	public final void testAbstractAsyncCallBackExecutorService() {
		new AbstractAsyncCallBack<String, String>(Executors.newCachedThreadPool()) {

			public String run(String value) throws Throwable {
				// TODO Auto-generated method stub
				return null;
			}

			public void doOnSucess(String result) {
				// TODO Auto-generated method stub
				
			}

			public void doOnFailure(Throwable t) {
				// TODO Auto-generated method stub
				
			}
		};
	}

	/**
	 * Test method for {@link net.sf.kerner.utils.callback.AbstractAsyncCallBack#execute(java.lang.Object)}.
	 * @throws InterruptedException 
	 */
	@Test
	public final void testExecute() throws InterruptedException {
		call.execute("hallo");
		call.shutdownAndWait(2000, TimeUnit.SECONDS);
		assertEquals("gut"+"hallo", res);
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.callback.AbstractAsyncCallBack#execute(java.lang.Object)}.
	 * @throws InterruptedException 
	 */
	@Test
	public final void testExecute01() throws InterruptedException {
		call = new AbstractAsyncCallBack<String, String>(Executors.newCachedThreadPool()) {

			public String run(String value) throws Throwable {
				throw new IllegalAccessException();
			}

			public void doOnSucess(String result) {
				// TODO Auto-generated method stub
			}

			public void doOnFailure(Throwable t) {
				failure = t;
			}
		};
		call.execute("hallo");
		call.shutdownAndWait(2000, TimeUnit.SECONDS);
		assertEquals(IllegalAccessException.class, failure.getClass());
	}
	
	/**
	 * Test method for {@link net.sf.kerner.utils.callback.AbstractAsyncCallBack#execute(java.lang.Object)}.
	 * @throws InterruptedException 
	 */
	@Test(expected=RejectedExecutionException.class)
	public final void testExecute02() throws InterruptedException {
		call.shutdown();
		call.execute("hallo");
	}

}
