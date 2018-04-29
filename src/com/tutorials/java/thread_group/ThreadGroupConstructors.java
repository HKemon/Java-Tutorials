package com.tutorials.java.thread_group;

public class ThreadGroupConstructors {
    public static void main(String[] args) {
        ThreadGroup threadGroup1 = new ThreadGroup("Thread - 1");
        ThreadGroup threadGroup2 = new ThreadGroup(threadGroup1,"Thread - 2");
        System.out.println(threadGroup2.getParent().getName());
    }
}
