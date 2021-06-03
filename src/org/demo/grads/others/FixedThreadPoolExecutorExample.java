package org.demo.grads.others;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FixedThreadPoolExecutorExample {

    public static  void main(String[]args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Callable<Integer>> callableList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            callableList.add(new FixedTask(i + 1));
        }
        List<Future<Integer>> futures = executorService.invokeAll(callableList);
        Thread.sleep(500);
        for(Future future: futures){
            System.out.println(" futute output value is :"+future.get());
        }
        executorService.shutdown();
    }
}

class FixedTask implements Callable<Integer>{

    int valueToBeSquared;

    public FixedTask(int valueToBeSquared){
        this.valueToBeSquared=valueToBeSquared;
    }
    @Override
    public Integer call() throws Exception {
        int squaredValue = valueToBeSquared*valueToBeSquared;
        System.out.println("Thread is :"+Thread.currentThread().getName()+" and Square value is "+squaredValue);
        return squaredValue;
    }
}


