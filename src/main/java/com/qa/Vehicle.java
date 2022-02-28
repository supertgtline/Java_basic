package com.qa;

public abstract class Vehicle {
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    private int ID;
    public abstract void driver();
}
