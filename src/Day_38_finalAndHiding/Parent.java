package Day_38_finalAndHiding;

public class Parent {

    protected int num=100;
    static int x;

    /* static {System.out.println("static initalize metod çalıştı");
    }
     {
     x++;
     System.out.println("Instance initalize metod çalıştı");
     }
     {
     System.out.println("2.Instance initalize metod çalıştı");}
 */
    Parent(){

    }


    private static void run(){
        System.out.println("Parent runs");
    }



}
