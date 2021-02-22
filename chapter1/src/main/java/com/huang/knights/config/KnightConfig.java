package com.huang.knights.config;

import com.huang.knights.BraveKnight;
import com.huang.knights.Knight;
import com.huang.quest.Quest;
import com.huang.quest.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//DI将quest注入到knight中
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }
    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

}
