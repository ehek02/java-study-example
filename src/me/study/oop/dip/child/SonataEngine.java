package me.study.oop.dip.child;

import me.study.oop.dip.Engine;

public class SonataEngine extends Engine {
    int power = 2000;

    @Override
    public int getPower() {
        return power;
    }
}
