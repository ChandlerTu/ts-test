package nbpt.ts.protocol;

public class ProtocolProcessing {

	public String process(String protocol) {

		if (protocol.equals("10000")) {
			ProtocolProcessing10000 protocolProcessing10000 = new ProtocolProcessing10000();
			protocolProcessing10000.process(protocol);
		}
		updateChannel(1);

		return protocol;
	}

	public void updateChannel(int id) {
		if (!"tsid,channelid".isEmpty()) {
			// getChannel();
			// setChannel();
			// saveChannel();
		}

	}

}
