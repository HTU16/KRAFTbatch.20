package PastAgain;

public class TekCiftSayilar {

    public static void main(String[] args) {
        //1den 20 ye kadar olan Tek sayıları yazdır
        for (int i = 1; i <=20; i++) {
            if (i % 2 != 0)
                System.out.print(" " + i);
        }
        // ya da
        System.out.println();
        for (int j = 1; j <=20 ; j=j+2) {
            System.out.print(" " +j);
        }
        System.out.println();
//çiftler, yazdır
        for (int i = 1; i <=20 ; i++) {
            if (i%2==0)
                System.out.print(" "+i);

        }

        // ya da
        System.out.println();
        for (int j = 2; j <=20 ; j=j+2) {
            System.out.print(" " +j);
        }




    }
}
