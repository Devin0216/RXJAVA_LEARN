package com.xique.rxjavatest;

import io.reactivex.Flowable;

/**
 * Created by Administrator on 2018/8/20.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Flowable.just("Hello world").subscribe(System.out::println);
    }
}