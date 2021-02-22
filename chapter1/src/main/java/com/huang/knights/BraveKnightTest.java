package com.huang.knights;

import com.huang.quest.Quest;
import com.huang.quest.SlayDragonQuest;
import org.junit.Test;
import static org.mockito.Mockito.*;
//使用mock框架，创建一个Quest接口得mock实现
public class BraveKnightTest {


    @Test
    public void knightShouldEmbarkQuest(){
        SlayDragonQuest slayDragonQuest = null;
        BraveKnight knight = new BraveKnight(slayDragonQuest);
        knight.embarkQuest();
        verify(slayDragonQuest,times(1)).embark();
    }
}
