package org.tiaa.grads.others;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VolatileTest {
    private static final Logger LOGGER = Logger.getLogger("VolatileTest.class");

    private static volatile int MY_INT = 0;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ChangeListener());
        Thread thread2 = new Thread(new ChangeMaker());
        thread1.start();
        thread2.start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while ( local_value < 5){
                if( local_value!= MY_INT){
                    LOGGER.log(Level.INFO,"Got Change for MY_INT : {0}", MY_INT);
                    local_value= MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT <5){
                LOGGER.log(Level.INFO, "Incrementing MY_INT to {0}", local_value+1);
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}