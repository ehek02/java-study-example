package me.study.oop.dip.practice.people.chef;

import me.study.oop.dip.practice.abstrac.요리사;

public class 이순신 extends 요리사 {
    @Override
    protected void 요리() {
        System.out.println("이순신은 한식요리");
    }
}
