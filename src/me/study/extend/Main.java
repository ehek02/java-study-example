package me.study.extend;

import me.study.extend.abstrac.초식동물;
import me.study.extend.abstrac.육식동물;

public class Main {
    static void joyStick(초식동물 초식동물) {
        초식동물.hide();
        초식동물.up();
        초식동물.down();
        초식동물.left();
        초식동물.right();
    }

    static void joyStick(육식동물 육식동물) {
        육식동물.up();
        육식동물.down();
        육식동물.left();
        육식동물.right();
    }

    public static void main(String[] args) {
        Cow cow1 = new Cow();
        Tiger tiger1 = new Tiger();

        joyStick(cow1);
        System.out.println("=================");
        joyStick(tiger1);
    }
}
