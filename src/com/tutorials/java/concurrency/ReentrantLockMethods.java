package com.tutorials.java.concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMethods {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.lock();
        System.out.println("isLocked : "+reentrantLock.isLocked());
        System.out.println("isHeldByCurrentThread : "+reentrantLock.isHeldByCurrentThread());
        System.out.println("getQueueLength : "+reentrantLock.getQueueLength());
        reentrantLock.unlock();
        System.out.println("getHoldCount : "+reentrantLock.getHoldCount());
        System.out.println("isLocked : "+reentrantLock.isLocked());
        System.out.println("isHeldByCurrentThread : "+reentrantLock.isHeldByCurrentThread());
        reentrantLock.unlock();
        System.out.println("isLocked : "+reentrantLock.isLocked());
        System.out.println("isFair : "+reentrantLock.isFair());
        System.out.println("isHeldByCurrentThread : "+reentrantLock.isHeldByCurrentThread());
    }
}