package com.zsk.behavioral.design.pattern.singleton;

import com.zsk.basic.annoactions.Recommend;
import com.zsk.basic.annoactions.ThreadSafe;

/**
 * Create by zsk on 2018/8/31
 **/

//静态内部类实现

/**
 * 优点：当Singleton07加载的时候，SingletonHoler不会加载进入内存，只有当真正调用getInstance方法，才会加载，初始化INSTANCE
 * 而且可以达到延迟加载的目的，而且由虚拟机提供了对线程安全的支持。
 */
@ThreadSafe
@Recommend
public class Singleton07 {
    private Singleton07(){}

    private static class SingletonHoler{
        private static final Singleton07 INSTANCE = new Singleton07();
    }
    public static Singleton07 getInstance(){
        return SingletonHoler.INSTANCE;
    }

}
