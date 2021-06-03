package org.demo.grads.exceptionhandling;

import java.io.*;

public class TryWithResourcesExample {

    public static void main(String[]args){

        try(FileInputStream fis = new FileInputStream(new File("Tests.txt"))){
            int i = fis.read();
            while(i!=-1){
                System.out.print((char)i);
                i=fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
