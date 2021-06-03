package com.io.others;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ConcurrentThreadExecutorExample {

    public static  void main(String[]args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Callable<Integer>> callableList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            callableList.add(new ConcurrentTask(i + 1));
        }
        List<Future<Integer>> futures = executorService.invokeAll(callableList);
        Thread.sleep(500);
        for(Future future: futures){
            System.out.println(" futute output value is :"+future.get());
        }
        executorService.shutdown();
    }
}

class ConcurrentTask implements Callable<Integer>{

    int valueToBeSquared;

    public ConcurrentTask(int valueToBeSquared){
        this.valueToBeSquared=valueToBeSquared;
    }
    @Override
    public Integer call() throws Exception {
        int squaredValue = valueToBeSquared*valueToBeSquared;
        System.out.println("Thread is :"+Thread.currentThread().getName()+" and Square value is "+squaredValue);
        return squaredValue;
    }
}


