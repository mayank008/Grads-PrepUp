package org.demo.grads.exceptionhandling;


public class ExceptionHandlingExample {
    public static void main(String[]args){
        int arr[]= new int[2];

        try{
            System.out.println(arr[2]);
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println(arrayIndexOutOfBoundsException);
        }
    }
}
