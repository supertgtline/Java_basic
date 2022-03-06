package com.qa.exception;

public class Hello {
    static void inputValue(int value) {
        if(value<100){
            try {
                System.out.println("Value < 100");
            } catch (Exception e) {
                System.out.println("Value > 100"+e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        inputValue(102);
    }
}
