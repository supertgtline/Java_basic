package testNg;

import org.testng.annotations.Test;

public class Test2 extends  BaseTest{
    @Test
    public void TC_01_test2(){
        long id = Thread.currentThread().getId();
        System.out.println("This is test 1 form Test 2 Class: "+id);
    }    @Test
    public void TC_02_test2(){
        long id = Thread.currentThread().getId();
        System.out.println("This is test 2 form Test 2 Class: "+id);
    }    @Test
    public void TC_03_test2(){
        long id = Thread.currentThread().getId();
        System.out.println("This is test 3 form Test 2 Class: "+id);
    }    @Test
    public void TC_04_test2(){
        a = 9;
        long id = Thread.currentThread().getId();
        System.out.println("This is test 4 form Test 2 Class: "+id);
    }
}
