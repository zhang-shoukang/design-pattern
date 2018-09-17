package com.zsk.creational.design.pattern.Factory;

/**
 * Create by zsk on 2018/9/16
 **/
interface Mouse{}
class HpMouse implements Mouse{}
class DellMouse implements Mouse{}
class AsusMouse implements Mouse{}
/**
 * 简单工厂设计模式
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 *
 * 01、普通
 */
public class SimpleFactoryTest01 {
    public static void main(String[] args) {
        Mouse hpMouse = new MouseFactory().createMouse("hp");
        Mouse dellMouse = new MouseFactory().createMouse("dell");
    }
}
class MouseFactory {
    public Mouse createMouse(String type){
        if ("hp".equals(type)){
            return new HpMouse();
        }else if ("dell".equals(type)){
            return new DellMouse();
        }
        return null;
    }
}

