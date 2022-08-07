package me.study.oop.dip;

import me.study.oop.dip.child.AvanteEngine;
import me.study.oop.dip.child.Tire20;

public class Car {
    Engine engine; // 이렇게 들고 있다면 이 자동차가 엔진을 바꾸고 싶다면 코드수정이 많이 일어나겠죠?
    Tire20 tire20;

    public Tire20 getTire20() {
        return tire20;
    }

    public void setTire20(Tire20 tire20) {
        this.tire20 = tire20;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}