package nbpt.ts.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TsTestTest {

	TsTest test;

	@Before
	public void before() {
		test = new TsTest();
	}

	@Test
	public void testInit() {
		Assert.assertEquals(TestStatus.waiting, test.getStatus());
	}

	@Test
	public void testRun() {
		test.run();
		Assert.assertEquals(TestStatus.running, test.getStatus());
	}

	@Test
	public void testFinish() {
		test.finish();
		Assert.assertEquals(TestStatus.finished, test.getStatus());
	}

	@Test
	public void testTerminate() {
		test.terminate();
		Assert.assertEquals(TestStatus.terminated, test.getStatus());
	}

}
