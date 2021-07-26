package com.company;

public class Skeleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }
    public String printInfo(){
        super.printInfo();
        return String.valueOf(getArrows());
    }
}
