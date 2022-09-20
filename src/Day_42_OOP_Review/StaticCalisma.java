package Day_42_OOP_Review;

public class StaticCalisma {

    public static  int x=5;
    public int y=10;

    public  void  normalMetot(){
        System.out.println(x*10);
    }
    public static void  staticMetot(){          //static olanı static de kullabiliriz
        System.out.println(x);                  // static olmayan metodu statiğin içinde kullanamayız..

                //    System.out.println(y);        kullanamayız....
    }
}
