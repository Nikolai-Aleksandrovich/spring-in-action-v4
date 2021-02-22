package com.huang.knights;

import com.huang.quest.Quest;
import com.huang.quest.SlayDragonQuest;

public class BraveKnight implements Knight{
    private Quest quest;
    //这里quest注入进来
    public BraveKnight(Quest quest){
        this.quest=quest;
    }
    public void embarkQuest(){
        quest.embark();
    }
}
