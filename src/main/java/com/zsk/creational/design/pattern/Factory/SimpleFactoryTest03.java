package com.zsk.creational.design.pattern.Factory;

/**
 * Create by zsk on 2018/9/16
 **/

/**
 * 简单工厂设计模式
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 *
 * 03、静态方法
 *
 * 总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，
 * 可以通过工厂方法模式进行创建。在以上的三种模式中，第一种如果传入的字符串有误，
 * 不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，
 * 所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
 *
 *
 * 简单工厂模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了开闭原则（开闭原则：对扩展开放,对修改关闭，多使用抽象类和接口。）
 */
public class SimpleFactoryTest03 {
    public static void main(String[] args) {
        Mouse hpMouse = SimpleFactory3.createHpMouse();
        Mouse dellMouse = SimpleFactory3.createDellMouse();
    }
}

class SimpleFactory3 {
    public static Mouse createHpMouse(){
            return new HpMouse();
    }
    public static Mouse createDellMouse(){
            return new DellMouse();
    }
}

