package com.zsk.creational.design.pattern;

/**
 * Create by zsk on 2018/9/16
 **/

/**
 * 抽象工厂  (抽象的工厂，我们要创建一个抽象的工厂类，具体工厂实现这个抽象工厂)
 *
 * 工厂方法模式只有一个抽象产品类，而抽象工厂模式有多个。 （Mouse  vs  Mouse&KeyBo）
 * 工厂方法模式的具体工厂类只能创建一个具体产品类的实例，而抽象工厂模式可以创建多个。 （Mouse  vs  Mouse&KeyBo）
 * 工厂方法创建 "一种" 产品，他的着重点在于"怎么创建"，也就是说如果你开发，你的大量代码很可能围绕着这种产品的构造，初始化这些细节上面。也因为如此，类似的产品之间有很多可以复用的特征，所以会和模版方法相随。
 * 抽象工厂需要创建一些列产品，着重点在于"创建哪些"产品上，也就是说，如果你开发，你的主要任务是划分不同差异的产品线，并且尽量保持每条产品线接口一致，从而可以从同一个抽象工厂继承。
 */

interface KeyBo{}
class DellKeyBo implements  KeyBo{}
class HpKeyBo implements  KeyBo{}
class AsusKeyBo implements KeyBo{}

interface Mic{}
class DellMic implements  Mic{}
class HpMic implements  Mic{}
class AsusMic implements Mic{}


public class AbstractFactoryTest {
    public static void main(String[] args) {
        PcFactory hpFactory = new HpFactory();
        Mouse hpFactoryMouse = hpFactory.createMouse();
        KeyBo hpFactoryKeyBo = hpFactory.createKeyBo();
        PcFactory dellFactory = new DellFactory();
        Mouse dellFactoryMouse = dellFactory.createMouse();
        KeyBo dellFactoryKeyBo = dellFactory.createKeyBo();
        PcFactory asusFactory = new AsusFactory();
        KeyBo keyBo = asusFactory.createKeyBo();
        Mouse mouse = asusFactory.createMouse();
    }
}

abstract class PcFactory {
    public abstract KeyBo createKeyBo();
    public abstract Mouse createMouse() ;
}
class AsusFactory extends PcFactory{
    @Override
    public Mouse createMouse() {
        return new AsusMouse();
    }

    @Override
    public KeyBo createKeyBo() {
        return new AsusKeyBo();
    }
}
class HpFactory extends PcFactory{
    public KeyBo createKeyBo() {
        return new HpKeyBo();
    }

    public Mouse createMouse() {
        return new HpMouse();
    }
}
class DellFactory extends PcFactory{
    public KeyBo createKeyBo() {
        return new DellKeyBo();
    }

    public Mouse createMouse() {
        return new DellMouse();
    }
}