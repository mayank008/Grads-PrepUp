package org.demo.grads.concurrency;

public class SynchronizationEample {

    public static void main(String[]args) /*throws InterruptedException*/ {

        Printer p =new Printer();
        PrinterOne printerOne = new PrinterOne(p);
        PrinterTwo printerTwo = new PrinterTwo(p);

        Thread threadOne = new Thread(printerOne);
        Thread threadTwo = new Thread(printerTwo);

        threadOne.start();
        threadTwo.start();
    }
}

class Printer{
    public void print(int noOfCopies, String text){
        for(int i=0;i<noOfCopies;i++){
            System.out.println(text+" "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class PrinterOne implements Runnable{
    Printer p;

    public PrinterOne(Printer p){
        this.p=p;
    }

    @Override
    public void run() {
            p.print(10, "Session One");
    }
}
class PrinterTwo implements Runnable{
    Printer p;

    public PrinterTwo(Printer p){
        this.p=p;
    }

    @Override
    public void run() {
            p.print(10, "Session Two");
    }
}