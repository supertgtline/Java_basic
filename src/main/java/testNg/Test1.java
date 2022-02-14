package testNg;

import org.testng.annotations.Test;

public class Test1 extends BaseTest{
    @Test
    public void TC_1test1(){
        long id = Thread.currentThread().getId();
        System.out.println("This is test 1 form Test 1 Class: " +id);
    }
    @Test
    public void TC_2test2(){
        long id = Thread.currentThread().getId();
        System.out.println("This is test 2 form Test 1 Class: "+id);
    }
    @Test
    public void TC_3test2(){
        long id = Thread.currentThread().getId();
        System.out.println("This is test 3 form Test 1 Class: "+id);
    }
}
