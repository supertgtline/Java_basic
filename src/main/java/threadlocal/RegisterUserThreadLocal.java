package threadlocal;

public class RegisterUserThreadLocal {
    public static void main(String args[]){
        ThreadLocalRegisterUser registerUser = new ThreadLocalRegisterUser();
        Thread thread1 = new Thread(registerUser);
        Thread thread2 = new Thread(registerUser);
        thread1.start();
        thread2.start();
    }
}
