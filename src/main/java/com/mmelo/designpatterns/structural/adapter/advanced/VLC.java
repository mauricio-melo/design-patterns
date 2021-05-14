package com.mmelo.designpatterns.structural.adapter.advanced;

import com.mmelo.designpatterns.structural.adapter.constants.Players;

public class VLC implements MediaPackage {
    @Override
    public String playFile(String filename) {
        return Players.VLC + filename;
    }
}