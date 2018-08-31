package com.zsk.behavioral.design.pattern.singleton;

/**
 * Create by zsk on 2018/8/31
 **/
import com.zsk.basic.annoactions.NotRecommend;
import com.zsk.basic.annoactions.NotThreadSafe;



//双重校验锁


/**
 *优点：保证了单例，和延迟加载
 *缺点：但是有可能会出现安全问题。
  */

/**
 * 对象初始化顺序：
 * 1. memory= allocate()  分配对象的内存空间
 * 2.constructor Instance  对象初始化
 * 3. instance=memory  设置instance 指向刚刚分配的内存
 *
 * 但是多线程情况下，会出现jdk和jvm的优化，有可能会发生指令重排
 * 顺序变为如下：
 * 1. memory= allocate()  分配对象的内存空间
 * 3. instance=memory  设置instance 指向刚刚分配的内存
 * 2.constructor Instance  对象初始化
 *
 * 故障重演：
 * 线程A： 执行到  singleton04=new Singleton04();   因为发生指令重拍，出现了上面的顺序。
 * 线程B： 执行到  第一个 if (singleton04==null){   发现singleton04 不为null  ，return singleton04
 * 程序其他地方如果用到了返回的singleton04 ，就会报NullPointException
 */
@NotThreadSafe
@NotRecommend
public class Singleton04 {
    private Singleton04(){}
    private static Singleton04 singleton04=null;
    public static Singleton04 getInstance(){
        if (singleton04==null){
            synchronized (Singleton04.class){
                if (singleton04==null){
                    singleton04=new Singleton04();
                }
            }
        }
        return singleton04;
    }
}
