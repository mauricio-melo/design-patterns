package com.mmelo.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.mmelo.designpatterns.behavioral.strategy.service.StrategyService;
import com.mmelo.designpatterns.structural.adapter.adapter.FormatAdapter;
import com.mmelo.designpatterns.structural.adapter.constants.Players;
import com.mmelo.designpatterns.structural.adapter.advanced.MP4;
import com.mmelo.designpatterns.structural.adapter.advanced.VLC;
import com.mmelo.designpatterns.structural.adapter.player.MP3;
import com.mmelo.designpatterns.structural.adapter.player.MediaPlayer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdapterTests {
	
	@Test
	void mp3() {
		final String file = "file.mp3";
		final MediaPlayer player = new MP3();
		final String result = player.play(file);
		assertEquals(Players.MP3 + file, result);
	}

	@Test
	void mp4() {
		final String file = "file.mp4";
		final MediaPlayer player = new FormatAdapter(new MP4());
		final String result = player.play(file);
		assertEquals(Players.MP4 + file, result);
	}

	@Test
	void vlc() {
		final String file = "file.vlc";
		final MediaPlayer player = new FormatAdapter(new VLC());
		final String result = player.play(file);
		assertEquals(Players.VLC + file, result);
	}
}
