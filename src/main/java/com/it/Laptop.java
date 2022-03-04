package com.it;

import java.util.*;

public class Laptop extends Computer{
    @Override
    public void showInfo() {
        System.out.println("Show info Laptop");
    }

    @Override
    public void start() {
        System.out.println("Laptop Started");
    }
    public <E> void genericMethod(E[] inputArray){
        for (E element: inputArray){
            System.out.println("Here is the element: "+element);
        }
    }
    Set<String> setDemo = new HashSet<>();
    //Performance is the best for this set
    // Random order

    Set<String> setDemo2 = new TreeSet<>();
    //Slowest set for adding and retrieving data
    //All data is sorted

    Set<String> setDemo3 = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(setDemo3, laptop.setDemo3);
    }

    @Override
    public int hashCode() {
        return 0;
    }
    //Faster than TreeSet and slower than HashSet

}
