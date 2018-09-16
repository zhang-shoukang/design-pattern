package com.zsk.creational.design.pattern;

/**
 * Create by zsk on 2018/9/16
 **/

/**
 * 简单工厂设计模式
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 *
 * 01、多个方法
 */
public class SimpleFactoryTest02 {
    public static void main(String[] args) {
        Mouse hpMouse = new MouseFactory2().createHpMouse();
        Mouse dellMouse = new MouseFactory2().createDellMouse();

    }
}

class MouseFactory2 {
    public Mouse createHpMouse(){
            return new HpMouse();
    }
    public Mouse createDellMouse(){
            return new DellMouse();
    }
}

