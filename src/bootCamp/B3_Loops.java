package bootCamp;

import java.util.Scanner;

public class B3_Loops {

    public static void main(String[] args) {
        //fori
        //iteration number is fixed
        //track index
        //for( initialization; condition; iterator){}

        //while
        //iteration is not fixed
        //do not track if index
        //while(condition){}

        //do while
        //one time execute even condition is false
        //do{}while(condition);

        String message = "Welcome to bootcamp";
        //how to reverse last word of message?
        String reverse = "";
        //1-tersden dondureyim
        //2-ilk boşlukta kodum kesilmeli
        int i = message.length()-1;

        for (i = i; i>=0 ; i--) {
            if (message.charAt(i)==' '){
                break;
            }if (message.charAt(i)!=' '){
                reverse+=message.charAt(i);
            }
        }
        System.out.println("reverse = " + reverse);
        System.out.println("reverse.length() = " + reverse.length());

        message = "Welcome to bootcamp";
        i=message.length()-1;
        reverse = "";
        while (message.charAt(i)!=' '){   // btrak a gerek kalmadı cunku koşulu sağlamayınca otomatik kesti..
            reverse+= message.charAt(i);//pma
            i--;
        }
        System.out.println("reverse = " + reverse);

        //---------------

        String color = "red";
        int count=0;
        do{
            count++;
            System.out.println(count +"--->do it");
        }while (color.equals("red") &&  count<10);  // koşul sağlamazsa 1 kez yapar ve biter.
        //koşulu saglarsa 10 kadar yazdırır..

        //break and continue

        //kullanıcan bir sayı aralığı alalım
        //1-  7 ye tam bolunen sayıya kadar azalan şekilde yazıralım.
        //2-  7 ye tam bolunenleri yazdıran artan sekilde yazdırın

        Scanner sc = new Scanner(System.in);
        System.out.print("lutfen sayi giriniz: ");
        int i1 = sc.nextInt();
        System.out.print("lutfen sayi giriniz: ");
        int i2 = sc.nextInt();
        //1
        for (int j = Integer.max(i1,i2); j >=Integer.min(i1,i2) ; j--) {
            if (j%7==0)break;//true oldugu anda donguyu keser loop un dışına cıkar
            System.out.print(" " + j);
        }
        System.out.println();
        //2
        for (int t = Integer.min(i1,i2); t<=Integer.max(i1,i2) ; t++) {
            if (t%7!=0)continue; //true ise devam etme altta ki satırları yazmadan for un başına dön
            System.out.println(t+" ");
        }




    }


}
