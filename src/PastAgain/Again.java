package PastAgain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Again {
    public static void main(String[] args) {



     /*  int i =5;
       switch (i){
            case 5:
                System.out.println("5 e esittir");
                break;
            case  6:
            System.out.println( "6 ya esittir");
            break;                                    // return diyebiliriz cıkış için kullanılır
            case 7:
                System.out.println("7ye esittir");
            default:
                System.out.println("farkli bir sayidir"); */

        // switch lerde sadece tam sayılar kullanılır. double float  boolean kullanılamaz..
        // char kullanılabilir.

                                             /*  int i=5;
                if(i==5);
                i+=10;
                System.out.println(i);
        int i=5;
        int j=10;
        switch (i){
            case 5:
                switch (j){
                    case 10:
                        System.out.println("harikasin");
                        break;
                    case 20:
                        System.out.println("olmadi");
                        break;
                }
                break;
            case 6:
                System.out.println("6 ya esittir");
                return;
            case 7:
                System.out.println("7 ye esittir"); */

        Scanner scan = new Scanner(System.in);
        System.out.print("araba fiyati :");
        double araba = scan.nextInt();
        System.out.print("kdv orani :");
        double kdv = scan.nextInt();
        System.out.print("otv orani :");
        double otv = scan.nextInt();
        double toplam = araba + araba + kdv / 100;
        toplam = toplam + toplam + otv / 100;
        if (toplam > 700000 && toplam < 1000000) {
            System.out.println(toplam + " alabilirim");
        } else if (toplam >= 1000000) {
            System.out.println(toplam + " bu devirde araba alınmaz");
        } else {
            System.out.println(toplam + " sudan ucuz");
        }


        /* for (int s=0; s<10; s++){
       if (s>5 && s<8){
           continue;
       }
       System.out.println(s);                             //01234589 yazdırır 678 i yazdırmaz..

        }*/


    }


    public static List<Integer> removeListMethod(List<Integer> list, int data) {

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (!list.get(i).equals(data)) {
                list.add(list1.get(i));
            }
        }
        return list1;
    }
}

