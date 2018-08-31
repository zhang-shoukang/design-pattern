package com.zsk.behavioral.design.pattern.singleton;

/**
 * Create by zsk on 2018/8/31
 **/
import com.zsk.basic.annoactions.NotRecommend;
import com.zsk.basic.annoactions.ThreadSafe;
//懒汉式 加锁

/**
 * 好处：通过加锁保证了线程安全
 * 坏处：因为加锁，带来的性能问题 （一次只能有一个线程被处理）
 */
@ThreadSafe
@NotRecommend
public class Singleton03 {
    private Singleton03 singleton03 =null;
    private Singleton03(){};

    public synchronized Singleton03 getSingleton03() {
        if (singleton03==null){
            singleton03=new Singleton03();
        }
        return singleton03;
    }
}
