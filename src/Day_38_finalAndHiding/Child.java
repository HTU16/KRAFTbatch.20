package Day_38_finalAndHiding;

public class Child extends Parent  {
    protected int num=50;
    public void start_2(){
        System.out.println();
    }

    protected static void run(){
        System.out.println("Child runs");
    }

}
