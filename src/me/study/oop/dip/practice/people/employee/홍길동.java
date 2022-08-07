package me.study.oop.dip.practice.people.employee;

import me.study.oop.dip.practice.abstrac.요리사;
import me.study.oop.dip.practice.abstrac.종업원;

public class 홍길동 extends 종업원 {
    요리사 c;

    @Override
    protected void 청소() {
        System.out.println("홍길동은 테이블청소");
    }
}
