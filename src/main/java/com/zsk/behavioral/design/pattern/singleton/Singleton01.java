package com.zsk.behavioral.design.pattern.singleton;

/**
 * Create by zsk on 2018/8/31
 **/

import com.zsk.basic.annoactions.NotRecommend;
import com.zsk.basic.annoactions.NotThreadSafe;

/**
 * 1. 单例（Singleton）
 意图
 确保一个类只有一个实例，并提供该实例的全局访问点。

 类图
 使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。

 私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。

 */

//懒汉式

/**
 * 好处： 用到改实例的时候，才会实例化该对象，不会浪费资源
 * 坏处：非线程安全，多线程环境下，会创建多个实例。
  */
@NotThreadSafe
@NotRecommend
public class Singleton01 {
    private static Singleton01 singleton01;
    private Singleton01(){};
    public static Singleton01 getInstance(){
        if (singleton01==null){           //point
            singleton01 =  new Singleton01();
        }
        return singleton01;
    }
}
