package me.study.oop.dip.practice.abstrac;

import me.study.oop.dip.practice.interfac.CanAble;

abstract public class 홀직원 implements CanAble {
    protected abstract void 청소();

    @Override
    public void talk() {
        System.out.println("손님과 대화하기");
    }
}
