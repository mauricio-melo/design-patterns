package com.mmelo.designpatterns.structural.adapter.advanced;

import com.mmelo.designpatterns.structural.adapter.constants.Players;

public class MP4 implements MediaPackage {
    @Override
    public String playFile(final String filename) {
        return Players.MP4 + filename;
    }
}