public class MyClass {
    private static int  i = 5;
    public MyClass(int i){
        this.i = i;
    }
    public void print(){
        System.out.println("print valude: "+i);
    }
    public void ifElseCheck(){
        boolean flag = false;
        String str ="myStr";
        if(flag){
            System.out.println("MyClass.ifElseCheck");
        }
        else{
            System.out.println("I'm else");
        }
    }
    public void forLoopCheck(){
        for (int i = 0;i<5;i++){
            System.out.println("i is "+i);
            if (i==3){
                break;
            }
        }
    }
    public void whileLoopCheck(){
        int i = 6;
        while(i>0){
            System.out.println("i is "+i);
            i--;
        }
    }
    public static void main(String[] args){
        MyClass myClass = new MyClass(10);
        myClass.print();
        myClass.ifElseCheck();
       // myClass.forLoopCheck();
        myClass.whileLoopCheck();
    }
}
