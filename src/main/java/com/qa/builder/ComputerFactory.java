package com.qa.builder;


public class ComputerFactory extends AbstractFactory{


    @Override
    Computer getComputer(String computerType) {
        if(computerType.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        if(computerType.equalsIgnoreCase("Phone")){
            return new Phone();
        }        if(computerType.equalsIgnoreCase("SmartTv")){
            return new SmartTv();
        }
        return null;
    }
}
