package com.it.adapter.legacy;

public class legacyBankAccount {
    private int ID;
    private String name;

    public legacyBankAccount(int ID, String name){
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

}
