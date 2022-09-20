package Day_9_If_Else;

import java.util.Scanner;

public class IfStatements {


/*       int para=4;
       if (para > 5) {
                  System.out.println(para);
               }else{
                 System.out.println(para+10);
               }*/

                   /*double paraHesabi= 2000;
++        int suit= 2500;
++
++        if (paraHesabi>=suit) {
++            System.out.println("takimi alabilir");
++
++        }else{
++            System.out.println("yetersiz bakiye");
++        }*/

                  /* Scanner sc = new Scanner(System.in);
++        int x;
++        int y;
++        System.out.println("lutfen sayilarinizi girin");
++        x=sc.nextInt();
++        y=sc.nextInt();
++
++        if (x==y) {
++            System.out.println("sayilar esit");
++        }else{
++            System.out.println("sayilar esit degildir");
++        }*/
    //System.out.println("------------------------------");
                   /*Scanner sc = new Scanner(System.in);
++
++        System.out.println("lutfen tum sayilarinizi girin");
++        System.out.print("sayi1 : " );
++        int sayi1= sc.nextInt();
++        System.out.print("sayi2 : ");
++        int sayi2=sc.nextInt();
++        System.out.print("sayi3 : ");
++        int sayi3= sc.nextInt();
++
++        if (sayi1+sayi2>sayi3){
++            sayi3 = sayi1 - sayi2;
++
++            System.out.println(sayi3);*/
                /*  Scanner sc = new Scanner(System.in);
++        System.out.println("lutfen bir sayi giriniz");
++         int number = sc.nextInt();
++         if (number%2==0) {
++             System.out.println("Bu bir cift sayidir ");
++         }else{
++             System.out.println("Bu bir tek sayidir");*/
                /*  Scanner sc = new Scanner(System.in);
++        System.out.println("lutfen tum sayilarinizi girin");
++        System.out.print("aci1 : ");
++        int aci1 = sc.nextInt();
++        System.out.print("aci2 : ");
++        int aci2 = sc.nextInt();
++        System.out.print("aci3 : ");
++        int aci3 = sc.nextInt();
++        if (aci1 + aci2 + aci3==180) {
++            int num = 90;
++            if (aci1 == 90 || aci2 == 90 || aci3 == 90){
++            System.out.println("bu bir dik ucgendir");
++        } else {
++            System.out.println("bu bir ucgendir");
++        }
++    }else {
++
++
++            System.out.println("bu bir ucgen olamaz"); */
                 /*  Scanner sc = new Scanner(System.in);
++        System.out.print("lutfen notunuzu giriniz : ");
++        double not = sc.nextDouble();
++
++        if (not >= 100 & not < 85) {
++            System.out.println(" tebrikler harf notunuz A gectiniz supersiniz");
++        } else if (not < 84 & not > 70) {
++            System.out.println("tebrikler harf notunuz B gectiniz iyisiniz");
++        } else if (not <= 69 & not >= 55) {
++            System.out.println("ucu ucuna gectin harf notun C");
++        } else if (not <= 54 & not >= 40) {
++            System.out.println("uzgunum harf notun D  kaldin bute gir");
++        } else if (not <= 39 & not >= 0) {
++            System.out.println("doogru sanayiye :) F");
++        } else {
++            System.out.println("lutfen gecerli not giriniz");
++        }  */
                 /* Scanner scan = new Scanner(System.in);
++        System.out.print("lutfen 1.sayiyi giriniz : ");
++        int sayi1 = scan.nextInt();
++        System.out.print("lutfen 2.sayiyi giriniz : ");
++        int sayi2 = scan.nextInt();
++        System.out.print("lutfen 3.sayiyi giriniz: ");
++        int sayi3 = scan.nextInt();
++
++        if (sayi1 > sayi2 & sayi1> sayi3) {
++            System.out.println( "en buyuk sayi :" + sayi1);
++        } else if (sayi2>sayi1 & sayi2>sayi3) {
++            System.out.println(" en buyuk sayi :" + sayi2 );
++        }else if (sayi3>sayi1 & sayi3>sayi2) {
++            System.out.println(" en buyuk sayi :" + sayi3);
++        }else{
++            System.out.println("sistem hatali");
++        } */

                       //Karar verme if, if-else ve switch-case
                     // Döngü(looping) while, do while, for
                    //Dallanma(branching) break,continue,return
     /* Scanner sc = new Scanner(System.in);
       System.out.print("lutfen sayinizi girin : ");
        int sayi = sc.nextInt();
        if (sayi >5) {
           System.out.println("5 den büyüktür :" + sayi);
        }else if (sayi>25) {
                System.out.println("25 den büyük: " + sayi);
           } else if (sayi>50) {
            System.out.println(" 50 den büyük:" + sayi);
        }else {
            System.out.println("hatali");
        } */
                  /*Scanner sc = new Scanner(System.in);
++        System.out.print("lutfen sayinizi girin : ");
++        int sayi = sc.nextInt();
++        if (sayi > 5) {
++            System.out.println("5 den buyuktur ");
++            if (sayi > 25) {
++                System.out.println("25 den buyuk  ");
++                if (sayi > 50) {
++                    System.out.println("50 den buyuk ");
++                } else {
++                }
++                System.out.println("sayi 50 den kucuk ");
++            } else {
++                System.out.println("sayi 25 den ve 50 den  kucuk ");
++            }
++        } else {
++            System.out.println(" sayi 50 den 25 den ve 5 den kucuk ");
++        } */
  /* Scanner sc = new Scanner(System.in);
        System.out.print("pozitif bir sayi tahmin et : ");
    int sayi = 50;
    int tahmin = sc.nextInt();

    if(tahmin<sayi){
        if (tahmin > sayi / 2) {
            System.out.println("yaklastin biraz daha buyuk sayi gir");
        } else if (tahmin < sayi / 2) {
            System.out.println("yakin degilsin daha buyuk sayi gir");
        } else {
            System.out.println("pek yakin degilsin");
        }
    } else if(tahmin >sayi){
        if (tahmin < sayi / 2) {
            System.out.println("tahminin yakin ancak daha kucuk bir sayi gir");

        } else if (tahmin > sayi / 2) {
            System.out.println("yakin degilsin daha kucuk bir sayi gir");

        } else {
            System.out.println("pek yakin degilsin");
        }
    }else{
        System.out.println("tebrikler tahminin dogru");
    }*/

}



