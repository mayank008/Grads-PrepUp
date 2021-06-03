package org.demo.grads.exceptionhandling;

public class CustomCheckedUncheckedException {
    public static void main(String[]args) throws InterruptedException {
        try {
            MyTestExceptionExample.call();
        } catch (MyTestException myTestException) {
            System.out.println(myTestException.getMessage());
            try {
                MyTestExceptionExample.run();
            }catch(MyRuntimeTestException myRuntimeTestException){
                System.out.println("Modified Runtime Exception ");
                Thread.sleep(5000);
                myRuntimeTestException.printStackTrace();
            }
        }finally {
            System.out.println("In finally block");
        }
    }
}
class MyTestExceptionExample{
    public static void call() throws MyTestException{
       throw new MyTestException("MyTestException is thrown") ;
    }
    public static void run(){
        throw new MyRuntimeTestException("MyRuntime Exception is thrown");
    }
}
class MyTestException extends Exception{

    public MyTestException(String message){
        super(message);
    }

}
class MyRuntimeTestException extends RuntimeException{

    public MyRuntimeTestException(String message){
        super(message);
    }
}