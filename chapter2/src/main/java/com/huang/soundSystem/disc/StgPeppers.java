package com.huang.soundSystem.disc;

import org.springframework.stereotype.Component;

@Component("first bean")//命名bean的名字
//@Named("first Bean")
public class StgPeppers implements CompactDisc{
    private String title="Sgt.Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("playing "+ title+"by"+artist);
    }
}
