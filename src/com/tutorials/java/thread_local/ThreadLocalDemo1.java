package com.tutorials.java.thread_local;

public class ThreadLocalDemo1 {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        System.out.println(threadLocal.get());
        threadLocal.set("Thread Local Demo");
        System.out.println(threadLocal.get());
    }
}
