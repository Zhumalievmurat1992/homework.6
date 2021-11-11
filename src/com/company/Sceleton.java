package com.company;

public class Sceleton extends Boss {
    private int strely;

    public int getStrely() {
        return strely;
    }

    public void setStrely(int strely) {
        this.strely = strely;
    }

    @Override
    public String printinfo() {
        return super.printinfo()+" количество стрел. "+getStrely();
    }
}
