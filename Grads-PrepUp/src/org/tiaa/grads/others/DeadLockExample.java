package org.tiaa.grads.others;

public class DeadLockExample{

    String first = "first";
    String secomd = "second";

    Thread thread1 = new Thread("ThreadOne"){
        public void run(){
            synchronized (first){
                while(true){
                    synchronized (secomd){
                        System.out.println(Thread.currentThread().getName()+" "+first+" "+secomd);
                    }
                }
            }
        }
    };

    Thread thread2 = new Thread("ThreadTwo"){
        public void run(){
            synchronized (secomd){
                while(true){
                    synchronized (first){
                        System.out.println(secomd+" "+first);
                    }
                }
            }
        }
    };

    public static void main(String[]args){
        DeadLockExample deadLockExample = new DeadLockExample();
        deadLockExample.thread1.start();
        deadLockExample.thread2.start();
    }
}
