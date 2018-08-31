package com.zsk.behavioral.design.pattern.singleton;

import com.zsk.basic.annoactions.NotRecommend;
import com.zsk.basic.annoactions.ThreadSafe;

/**
 * Create by zsk on 2018/8/31
 **/


 //饿汉模式
//单例实例在类装载时进行创建

/**
 * 优点：在类装载的时候进行一次初始化，线程安全
 * 缺点：提前初始化，可能会浪费资源（如果一直没用到）
 */
@ThreadSafe
@NotRecommend
public class Singleton06 {

    private Singleton06(){}
    public static Singleton06 singleton06=null;
    static {
        singleton06 = new Singleton06();
    }
    public static Singleton06 singleton06(){
        return singleton06;
    }
}
