package testNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected int a = 2;
    @BeforeTest
    public void beforeTest(){
        long id = Thread.currentThread().getId();
        System.out.println("This is before Test: " +id);
    }
    @AfterTest
    public void afterTest(){
        if(a==0){
            System.out.println("A = 0 at thread");
        } else {
            System.out.println(a+2);
        }
        a = 0;
        long id = Thread.currentThread().getId();
        System.out.println("This is After Test: " +id);
    }
}
