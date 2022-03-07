package com.it;

import java.util.Scanner;

interface Event{
    String message ="An event has been triggered";
    void printMessage();
}
public class Anonymous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer");
        int number = scanner.nextInt();
        if(number==1){
            Event event = new Event() {
                @Override
                public void printMessage() {
                    System.out.println(message);
                }
            };
            event.printMessage();
        }
    }

}
