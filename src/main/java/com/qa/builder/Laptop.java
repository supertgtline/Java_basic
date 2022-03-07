package com.qa.builder;

public class Laptop implements Computer{
    @Override
    public void compute() {
        System.out.println("Laptop computers");
    }
}
