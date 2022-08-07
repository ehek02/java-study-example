package me.study.extend;

import me.study.extend.abstrac.육식동물;

public class Tiger extends 육식동물 {
    @Override
    protected void 사냥() {
        System.out.println("사냥하기");
    }
}
