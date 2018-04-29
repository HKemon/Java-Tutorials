package com.tutorials.java.thread_group;

public class ThreadGroupPriority {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Thread Group - 1");
        Thread thread1 = new Thread(threadGroup,"Thread - 1");
        Thread thread2 = new Thread(threadGroup,"Thread - 2");
        threadGroup.setMaxPriority(3);
        Thread thread3 = new Thread(threadGroup,"Thread - 3");
        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
        System.out.println(thread3.getPriority());
    }
}
