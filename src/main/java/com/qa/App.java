package com.qa;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setID(10);
        System.out.println(car1.getID());
        car1.driver();

    }
}
