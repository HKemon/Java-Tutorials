package com.tutorials.java.thread_local;

public class ThreadLocalDemo2 {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal(){
            public Object initialValue(){
                return "Thread Local Demo 2";
            }
        };
        System.out.println(threadLocal.get());
        threadLocal.set("New Name");
        System.out.println(threadLocal.get());
    }
}
