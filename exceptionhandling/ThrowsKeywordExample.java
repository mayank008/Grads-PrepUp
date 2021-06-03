package com.io.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class ThrowsKeywordExample {

    public static void main(String[]args) throws IOException {

        File file = new File("test.txt");
        file.createNewFile();
    }
}
