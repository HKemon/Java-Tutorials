package com.tutorials.java.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Jobs extends Thread {
    String name;

    Jobs(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadPoolTest {
    public static void main(String[] args) {
        Jobs[] jobs = {new Jobs("Jobs - 1")
                , new Jobs("Jobs - 2")
                , new Jobs("Jobs - 3")
                , new Jobs("Jobs - 4")
                , new Jobs("Jobs - 5")};
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 2; i++) {
            for (Jobs job : jobs) {
                executorService.submit(job);
            }
        }
        executorService.shutdown();
    }
}