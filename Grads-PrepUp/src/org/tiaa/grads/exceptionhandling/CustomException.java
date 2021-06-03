package org.tiaa.grads.exceptionhandling;

public class CustomException {

    static void show(int i) throws MyException{
        if(i>10 || i<0){
            throw new MyException(" Invalid Input : The input is either >100 or <0");
        }
        else{
            System.out.println("valid input :"+i);
        }
    }

    public static void main(String []args){
        try{
            show(5);
            show(11);
        }catch(MyException myException){
         System.out.println(myException.toString());
        }
    }
}

class MyException extends Exception{

    public MyException(String message){
        super(message);
    }

    public String toString(){
        return "Custom Exception Occured :"+super.getMessage();
    }
}