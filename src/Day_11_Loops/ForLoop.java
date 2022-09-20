package Day_11_Loops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

             /*  System.out.println("giris");
       for (int i=0; i<10; i++){
           System.out.println(i+"-Talha");
       }
        System.out.println("cikis");

       for (int i=1; i<21; i++){
            System.out.println(i+ "-Merhaba Dunya");
        }
      for (int i=0; i<100; i++){
          System.out.println(i);

        }
        for (int i=15; i<100; i++){
           System.out.println(i);
       }
               for (int i=100; i>0; i--) {
++            System.out.println(i);
++        }
++
++        for (int i=0; i<100; i+=2) {
++            System.out.println(i);
++        }
++
++        for (int i=10; i<1000; i+=10) {
++            System.out.println(i);
++             for (int i=10; i<1000; i+=10) {
++             if(i%10==0){
++
++        }
++             //1.yol
++        int sonuc=1;
++        for (int i=6; i>0; i--) {
++            sonuc*=i;     //1.loop: sonuc=sonuc*i; sonuc=1*6; sonuc=6
++                          //2.loop: sonuc=sonuc*i; sonuc=6*5; sonuc=30
++                          //3.loop: sonuc=sonuc*i; sonuc=30*4; sonuc=120
++                          //4.loop: sonuc=sonuc*i; sonuc=120*3; sonuc=360
++                          //5.loop: sonuc=sonuc*i; sonuc=360*2; sonuc=720
++                          //6.loop: sonuc=sonuc*i; sonuc=720*1; sonuc=720
++            System.out.println("6!="+ sonuc); */

        // 2.yol
                                       /* Scanner scan=new
            int sonuc=1;
           int faktoriyel=6;
          for (int i=1; i<faktoriyel; i++) {
              sonuc=sonuc*i;
               System.out.println("6!=" + sonuc);
           }*/

        for (int i = 0; i < 20; i++) {
            int sonuc = 1;
            sonuc = i * i * i;
            System.out.println(i + sonuc);
        }

        for (int i = 24; i < 50; i++) {
            double fah = (i * 1.8 + 32);        //c=(f-32)/1.8      f=(c*1.8)+32
            System.out.println(i + "C= " + fah + "F dir");
        }

       /* Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen kelime yazin: ");
        String kelime = scan.nextLine();
        System.out.print("kac defa ekrana yazdirmak istiyorsunuz: ");
        int tekrarSayisi = scan.nextInt();
        for (int i = 0; i < tekrarSayisi; i++) {
            System.out.println(kelime);
        }*/
       /* Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 0 ile 1000 arasinda sayi giriniz: ");
        int sayi = scan.nextInt();
        int sonuc = 0;
        for (int i = 0; i <= sayi; i++) {
            sonuc = sonuc + i;
            System.out.println(sayi + " kadar olan toplam:" + sonuc);
        }*/
      /*  Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 0 ile 1000 arasinda sayi giriniz: ");
        int sayi = scan.nextInt();
        int tek = 0;
        int cift = 0;
        for (int i = 0; i <= sayi; i++) {
            if (i % 2 == 0) {
                cift += i;
            } else {
                tek += i;
                System.out.println(tek);
                System.out.println(cift);
            }*/
        Scanner scan = new Scanner(System.in);
        System.out.print("taban girin: ");
        int taban = scan.nextInt();
        System.out.print("üs girin: ");
        int us = scan.nextInt();
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
            System.out.println(sonuc);

        }
    }
}


