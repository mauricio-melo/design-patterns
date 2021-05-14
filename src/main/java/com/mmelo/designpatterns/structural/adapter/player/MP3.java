package com.mmelo.designpatterns.structural.adapter.player;

import com.mmelo.designpatterns.structural.adapter.constants.Players;

public class MP3 implements MediaPlayer {
    @Override
    public String play(String filename) {
        return Players.MP3 + filename;
    }
}