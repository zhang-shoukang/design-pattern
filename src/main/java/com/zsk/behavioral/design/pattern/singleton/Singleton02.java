package com.zsk.behavioral.design.pattern.singleton;

import com.zsk.basic.annoactions.NotRecommend;
import com.zsk.basic.annoactions.ThreadSafe;

/**
 * Create by zsk on 2018/8/31
 **/

//饿汉式
/**
 * 好处：线程安全，从始至终只有一个实例
 * 坏处：丢失了延迟实例化，资源可能浪费
 */
@ThreadSafe
@NotRecommend
public class Singleton02 {
    private Singleton02 singleton02 = new Singleton02();
    private Singleton02(){}
    public Singleton02 getSingleton02() {
        return singleton02;
    }
}
