package PastAgain;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int a=sc.nextInt();
        System.out.println("Bir sayı giriniz");
        int b=sc.nextInt();
        System.out.println("1:Toplama \n 2:Çıkarma \n 3:Çarpma \n 4: Bölme" );
        System.out.println("Bir işlem giriniz");
        int islem= sc.nextInt();

        if (islem==1){
            System.out.println(a+b);
        }else if (islem==2){
            System.out.println(a-b);
        }else if (islem==3){
            System.out.println(a*b);
        }else if (islem==4) {
            System.out.println(a/b);
        }else System.out.println("Yanlış bir numara girdiniz");

    }
}
