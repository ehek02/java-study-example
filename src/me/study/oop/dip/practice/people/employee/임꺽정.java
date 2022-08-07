package me.study.oop.dip.practice.people.employee;

import me.study.oop.dip.practice.abstrac.종업원;
import me.study.oop.dip.practice.people.chef.장보고;

public class 임꺽정 extends 종업원 {
    장보고 j; // 장보고가 없다면?

    @Override
    protected void 청소() {
        System.out.println("임꺽정은 주방청소");
    }
}
