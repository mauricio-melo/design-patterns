package com.mmelo.designpatterns.structural.adapter.adapter;

import com.mmelo.designpatterns.structural.adapter.advanced.MediaPackage;
import com.mmelo.designpatterns.structural.adapter.player.MediaPlayer;

public class FormatAdapter implements MediaPlayer {
    private final MediaPackage media;

    public FormatAdapter(final MediaPackage media) {
        this.media = media;
    }

    @Override
    public String play(final String filename) {
        System.out.print("Using Adapter --> ");
        return media.playFile(filename);
    }
}
