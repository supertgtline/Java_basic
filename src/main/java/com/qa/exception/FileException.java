package com.qa.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileException {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("A:/A.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Print line exception");
    }
}
