package org.tiaa.grads.concurrency;

public class ThreadClassExample {

    public static void main(String[]args){
        ThreadMain threadMain = new ThreadMain("Thread One");
        threadMain.start();
    }
}
class ThreadMain extends Thread{

    String name;

    public ThreadMain(String name){
        
        super(name);
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
