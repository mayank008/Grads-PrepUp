package org.demo.grads.concurrency;

class ThreadExample implements Runnable{

    String name;

    public ThreadExample(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}

public class ThreadRunnableMain{

    public static void main(String[]args){
        ThreadExample threadExample = new ThreadExample("FirstName");
        ThreadExample threadExample1 = new ThreadExample("LastName");

        Thread th1 = new Thread(threadExample);
        Thread th2 = new Thread(threadExample1);

        th1.start();
        th2.start();
    }
}
