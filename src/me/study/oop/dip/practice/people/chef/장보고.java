package me.study.oop.dip.practice.people.chef;

import me.study.oop.dip.practice.abstrac.요리사;

public class 장보고 extends 요리사 {
    @Override
    protected void 요리() {
        System.out.println("장보고는 양식요리");
    }
}
