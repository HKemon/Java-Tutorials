package com.tutorials.java.concurrency;

import java.util.concurrent.locks.ReentrantLock;

class Display {
    ReentrantLock reentrantLock = new ReentrantLock();
    public void wish(String name){
        reentrantLock.lock();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            }catch (Exception ex){

            }
            System.out.println(name);
        }
        reentrantLock.unlock();
    }
}

class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display display, String name){
        this.d = display;
        this.name = name;
    }
    public void run(){
        d.wish(name);
    }
}

public class LockDemo1{
    public static void main(String[] args) {
        Display display = new Display();
        new MyThread(display,"Thread - 1").start();
        new MyThread(display,"Thread - 2").start();
    }
}