package me.study.oop.dip.practice.abstrac;

abstract public class 종업원 extends 홀직원 {
    public void 서빙하기() {
        System.out.println("음식을 서빙합니다.");
    }

    public void 주문하기() {
        System.out.println("주무을 받습니다.");
    }
}
