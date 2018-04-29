package com.tutorials.java.callable;

import java.util.concurrent.*;

class Jobs implements Callable {
    String name;

    Jobs(String name) {
        this.name = name;
    }


    @Override
    public Object call() throws Exception {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        Jobs[] jobs = {new Jobs("com.tutorials.java.callable.Jobs - 1")
                , new Jobs("com.tutorials.java.callable.Jobs - 2")
                , new Jobs("com.tutorials.java.callable.Jobs - 3")
                , new Jobs("com.tutorials.java.callable.Jobs - 4")
                , new Jobs("com.tutorials.java.callable.Jobs - 5")};
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 0; i < 2; i++) {
            for (Jobs job : jobs) {
                Future future = executorService.submit(job);
                try {
                    System.out.println(future.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
        executorService.shutdown();
    }
}

