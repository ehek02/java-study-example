package me.study.extend.abstrac;

import me.study.extend.inter.MoveAble2;

public abstract class 초식동물 implements MoveAble2 {
    protected abstract void 채집();

    @Override
    public void up() {
        System.out.println("위로 이동");
    }

    @Override
    public void down() {
        System.out.println("아래로 이동");
    }

    @Override
    public void left() {
        System.out.println("왼쪽으로 이동");
    }

    @Override
    public void right() {
        System.out.println("오른쪽로 이동");
    }

    @Override
    public void hide() {
        System.out.println("숨기");
    }
}
