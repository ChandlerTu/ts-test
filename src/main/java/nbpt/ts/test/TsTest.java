package nbpt.ts.test;

public class TsTest {

	private TestStatus status = TestStatus.waiting;

	public void run() {
		status = TestStatus.running;
	}

	public void finish() {
		status = TestStatus.finished;
	}

	public void terminate() {
		status = TestStatus.terminated;
	}

	public TestStatus getStatus() {
		return status;
	}

	public void setStatus(TestStatus status) {
		this.status = status;
	}

}
