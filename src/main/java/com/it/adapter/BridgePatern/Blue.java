package com.it.adapter.BridgePatern;

public class Blue implements Colour {
    @Override
    public String toString() {
        return getClass().getName().toLowerCase();
    }
}
