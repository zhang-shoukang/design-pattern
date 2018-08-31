package com.zsk.behavioral.design.pattern.singleton;

/**
 * Create by zsk on 2018/8/31
 **/
public class Main {
    public static void main(String[] args) {
        Singleton01 instance = Singleton01.getInstance();
        System.out.println(instance);
    }
}
