package Day_46_Exception;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        System.out.println("program başladı");

        boolean devam = true;

        htu:
        while (devam) {

            try {
                Scanner scan = new Scanner(System.in);
                System.out.print(" sayı : ");
                int x = scan.nextInt();
                System.out.print("bölüm : ");
                int y = scan.nextInt();
                System.out.println("sonuç: " + (x / y));


            } catch (java.lang.Exception e) {
                System.out.println(e.getMessage());  //************************************************   by zero
                e.printStackTrace();                 //************************************************
                System.out.println("lütfen tekrar deneyiniz");
                continue htu;
            } finally {            // olsa da olur olmasa da
                System.out.println("finally bloğu çalıştı");
            }
            devam = false;
        }

        System.out.println("program sonlandı");

    }
}
