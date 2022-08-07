package me.study.extend;

import me.study.extend.abstrac.초식동물;

public class Cow extends 초식동물 {
    @Override
    public void 채집() {
        System.out.println("풀 뜯기");
    }
}
