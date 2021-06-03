package com.io.exceptionhandling;

import java.io.*;

public class ExceptionHierarchyOrder {

    public static void main(String []args) {
        BufferedReader br=null;
        FileReader fr =null;
        try{

            File file =null;
            file.getParentFile();
            file = new File("test.txt");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            System.out.println(br.readLine());

        }catch(NullPointerException nullPointerException){
            System.out.println("Inside catch of NullPointerException Exception :"+nullPointerException.getMessage());
        } catch(FileNotFoundException fileNotFoundException){
            System.out.println("Inside catch of FileNotFoundException Exception :"+fileNotFoundException.getMessage());
        } catch(IOException ioException){
            System.out.println("Inside catch of IOException Exception :"+ioException.getMessage());
        } finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
