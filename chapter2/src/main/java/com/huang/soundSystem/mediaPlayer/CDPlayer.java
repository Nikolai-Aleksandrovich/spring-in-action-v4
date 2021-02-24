package com.huang.soundSystem.mediaPlayer;

import com.huang.soundSystem.disc.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer{
    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc= compactDisc;
    }
    @Override
    public void play() {
        compactDisc.play();
    }
}
