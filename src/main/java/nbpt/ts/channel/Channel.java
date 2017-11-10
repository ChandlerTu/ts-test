package nbpt.ts.channel;

import java.util.Date;

public class Channel {

	private ChannelStatus status = ChannelStatus.offline;

	private Date lastTime;

	public void receive() {
		lastTime = new Date();
	}

	public void test() {
		status = ChannelStatus.testing;
	}

	public void finish() {
		status = ChannelStatus.online;
	}

}
