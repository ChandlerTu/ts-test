package nbpt.ts.channel;

import java.util.Date;

public class Channel2 {

	private ChannelStatus status = ChannelStatus.offline;

	private Date lastTime;

	private int timeoutMinutes;

	public void received() {
		lastTime = new Date();
	}

	public boolean isTimeout() {
		return isTimeout(new Date());
	}

	public boolean isTimeout(Date now) {
		boolean isTimeout = true;

		if (lastTime != null) {
			int minutes = getDuration(now);
			if (minutes < timeoutMinutes) {
				isTimeout = false;
			}
		}

		if (isTimeout) {
			status = ChannelStatus.offline;
		}

		return isTimeout;
	}

	public void test() {
		status = ChannelStatus.testing;
	}

	public void finish() {
		status = ChannelStatus.online;
	}

	public int getDuration(Date now) {
		long milliseconds = now.getTime() - lastTime.getTime();
		long minutes = milliseconds / 1000 / 60;
		return (int) minutes;
	}

}
