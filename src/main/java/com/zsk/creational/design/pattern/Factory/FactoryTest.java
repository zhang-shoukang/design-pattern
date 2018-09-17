package com.zsk.creational.design.pattern.Factory;

/**
 * Create by zsk on 2018/9/16
 **/

/**
 * 工厂方法模式
 * 这种模式的好处是，当需要添加新的类的时候，只需要添加，实现Mouse接口，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
 *
 */
interface Provider{
    Mouse produce();
}
class HpMouseFactory implements Provider{
    public Mouse produce() {
        return new HpMouse();
    }
}
class DellMouseFactory implements Provider{
    public Mouse produce() {
        return new DellMouse();
    }
}
public class FactoryTest {
    public static void main(String[] args) {
        HpMouseFactory hpMouseFactory = new HpMouseFactory();
        hpMouseFactory.produce();
        DellMouseFactory dellMouseFactory = new DellMouseFactory();
        dellMouseFactory.produce();
    }
}


