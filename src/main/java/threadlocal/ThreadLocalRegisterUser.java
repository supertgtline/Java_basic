package threadlocal;

import java.util.Random;

public class ThreadLocalRegisterUser implements Runnable{
    ThreadLocal<String> threadLocal = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "No value";
        }
    };
    String registeredUserName;
    @Override
    public void run() {
        createUser();
        try {
            getUserWithDelay();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void createUser(){

            System.out.println(Thread.currentThread().getName()+"  Before starting registration, value of registeredUserName :"+threadLocal.get());
            System.out.println(Thread.currentThread().getName()+" Registering a user.");
            registeredUserName = Thread.currentThread().getName()+" User"+ new Random().nextInt(999);
            threadLocal.set(registeredUserName);
            System.out.println(Thread.currentThread().getName()+" After registration, value of registeredUserName :"+threadLocal.get());
    }
    public void getUserWithDelay() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName()+" After some delay , value of registeredUserName :"+threadLocal.get());
    }
}
