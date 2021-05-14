package com.mmelo.designpatterns;

import com.mmelo.designpatterns.structural.bridge.device.Tv;
import com.mmelo.designpatterns.structural.bridge.remote.BasicRemote;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BridgeTests {

	@Test
	void bridge() {
		final Tv tv = new Tv();
		BasicRemote basicRemote = new BasicRemote(tv);
		basicRemote.power();
		basicRemote.channelUp();
		basicRemote.volumeUp();
		tv.printStatus();
	}
}
