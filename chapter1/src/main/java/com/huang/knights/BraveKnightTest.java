package com.huang.knights;

import com.huang.quest.Quest;
import com.huang.quest.SlayDragonQuest;
import org.junit.Test;
import static org.mockito.Mockito.*;
//使用mock框架，创建一个Quest接口得mock实现
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight((SlayDragonQuest) mockQuest);
        knight.embarkQuest();
        verify(mockQuest,times(1)).embark();
    }
}
