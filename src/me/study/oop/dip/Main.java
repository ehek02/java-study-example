package me.study.oop.dip;

import me.study.oop.dip.child.AvanteEngine;
import me.study.oop.dip.child.SonataEngine;
import me.study.oop.dip.child.Tire20;

public class Main {
    public static void main(String[] args) {
        Car avante = new Car();
        Car sonata = new Car();
        avante.setEngine(new AvanteEngine());
        sonata.setEngine(new SonataEngine());
        System.out.println("아반떼의 마력은 " + avante.getEngine().getPower() + "cc  입니다.");
        System.out.println("소나티의 마력은 " + sonata.getEngine().getPower() + "cc  입니다.");

        avante.setTire20(new Tire20()); // 30 inch tire를 넣고싶다면?
    }
}
