package com.qa.exception;

public class exampleException {
    public static void main(String[] args) {

        try {
            int[] a = {5,6,7};
            System.out.println(a[4]);
        }
        catch (ArrayIndexOutOfBoundsException array){
            System.out.println("This element out of bound: "+array.getMessage());
        } finally{
            System.out.println("the End");
        }
        int i = 8;
        for(i=10; i<=5; i++){
            System.out.println("print i = "+i);
        }
    }
}
