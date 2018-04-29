package com.tutorials.java.thread_group;

public class SystemsThreadGroupAllThreads {
    public static void main(String[] args) {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup().getParent();
        Thread [] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);
        for (Thread thread: threads) {
            System.out.println(thread.getName());
        }
    }
}
