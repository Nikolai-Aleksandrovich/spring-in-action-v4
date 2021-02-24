package com.huang.soundSystem;

import com.huang.soundSystem.disc.CompactDisc;
import com.huang.soundSystem.disc.StgPeppers;
import com.huang.soundSystem.mediaPlayer.CDPlayer;
import com.huang.soundSystem.mediaPlayer.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
    //声明简单的bean
    @Bean(name="Lonely heart disc")
    public CompactDisc sgtPeppers(){
        return new StgPeppers();
    }
    //实现注入
    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
    //或者
    @Bean
    public CDPlayer cdPlayer2(CompactDisc compactDisc){
        return new CDPlayer(compactDisc.)
    }

}
