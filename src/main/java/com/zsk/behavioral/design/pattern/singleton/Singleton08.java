package com.zsk.behavioral.design.pattern.singleton;

import com.zsk.basic.annoactions.Recommend;
import com.zsk.basic.annoactions.ThreadSafe;

/**
 * Create by zsk on 2018/8/31
 **/

//枚举方式

/**
 * 优点： 最安全
 * // JVM保证这个方法绝对只调用一次
 //Singleton() {
 //singleton = new SingletonExample7();
 //}
 */

@ThreadSafe
@Recommend
public class Singleton08 {
    private Singleton08(){}
    public static Singleton getInstance(){
        return Singleton.INSTANCE.getSingleton();
    }
    private enum Singleton{
        INSTANCE;
        public Singleton singleton;

        public Singleton getSingleton() {
            return singleton;
        }
    }
}

/**
 * 考虑以下单例模式的实现，该 Singleton 在每次序列化的时候都会创建一个新的实例，为了保证只创建一个实例，必须声明所有字段都是 transient，并且提供一个 readResolve() 方法。

 public class Singleton implements Serializable {

 private static Singleton uniqueInstance;

 private Singleton() {
 }

 public static synchronized Singleton getUniqueInstance() {
 if (uniqueInstance == null) {
 uniqueInstance = new Singleton();
 }
 return uniqueInstance;
 }
 }
 如果不使用枚举来实现单例模式，会出现反射攻击，因为通过 setAccessible() 方法可以将私有构造函数的访问级别设置为 public，然后调用构造函数从而实例化对象。如果要防止这种攻击，需要在构造函数中添加防止实例化第二个对象的代码。

 从上面的讨论可以看出，解决序列化和反射攻击很麻烦，而枚举实现不会出现这两种问题，所以说枚举实现单例模式是最佳实践。
 */
