package com.zsk.behavioral.design.pattern.singleton;

/**
 * Create by zsk on 2018/8/31
 **/
import com.zsk.basic.annoactions.NotRecommend;
import com.zsk.basic.annoactions.ThreadSafe;


//双重校验锁 + validate  防止指令重排


/**
 *优点： 加入validate 避免指令重排，线程安全
 * 缺点：还是加锁
  */
@ThreadSafe
@NotRecommend
public class Singleton05 {
    private Singleton05(){}
    private volatile static Singleton05 singleton05=null;
    public static Singleton05 getInstance(){
        if (singleton05==null){
            synchronized (Singleton05.class){
                if (singleton05==null){
                    singleton05=new Singleton05();
                }
            }
        }
        return singleton05;
    }
}
