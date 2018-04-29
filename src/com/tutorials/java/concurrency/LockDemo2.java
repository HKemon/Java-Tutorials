package com.tutorials.java.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread2 extends Thread{
    String name;
    ReentrantLock reentrantLock;
    MyThread2(String name, ReentrantLock reentrantLock){
        this.name = name;
        this.reentrantLock = reentrantLock;
    }
    public void run(){
        do {
            try {
                if (reentrantLock.tryLock(20, TimeUnit.MILLISECONDS)){
                    System.out.println("executing : "+ name);
                    Thread.sleep(500);
                    reentrantLock.unlock();
                    break;
                }else {
                    System.out.println("waiting "+ name);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (true);
    }
}

public class LockDemo2{
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new MyThread2("Thread - 1", lock).start();
        new MyThread2("Thread - 2", lock).start();
    }
}