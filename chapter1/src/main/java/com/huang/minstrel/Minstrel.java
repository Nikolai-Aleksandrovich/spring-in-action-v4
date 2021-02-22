package com.huang.minstrel;

import java.io.PrintStream;

public class Minstrel {
    private PrintStream printStream;

    public Minstrel(PrintStream printStream){
        this.printStream=printStream;
    }
    public void singBeforeQuest(){
        printStream.println("lalala,this is knight slay the dragon");
    }
    public void singAfterQuest(){
        printStream.println("fofoof,this is knight already slay the dragon");
    }
}
