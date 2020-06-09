package com.study.demo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadLocal threadLocal = new ThreadLocal();
        threadLocal.set("dddd");
        System.out.println(threadLocal.get());
        System.out.println("Hello World!");
    }
}
