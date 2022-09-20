package Day_13_DoWhile_bracking_labels;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //örnek
    /*
    int i=1;
    do{
        System.out.println(i+"nci işlem");
        i++;
    }while(i<6);
    System.out.println(i);
     */

        //örnek toplam 0 ise programdan çıksın
/*
    Scanner scan=new Scanner(System.in);
   int i=0;
    do{
        System.out.println("toplam 0 ise programdan çıkış işlemi olacaktır");
       System.out.print("1.sayi");
       int a= scan.nextInt();
        System.out.print("2.sayi");
        int b= scan.nextInt();
        System.out.println("toplam="+(a+b));
         if((a+b)==0){
             break;
         }
        i++;
    }while(i<21);
    Scanner scan=new Scanner(System.in);
    boolean k=true;
    do{
        System.out.println("toplam 0 ise programdan çıkış işlemi olacaktır");
        System.out.print("1.sayi");
        int a= scan.nextInt();
        System.out.print("2.sayi");
        int b= scan.nextInt();
        System.out.println("toplam="+(a+b));
            if((a+b)==0){
              k=false;
            }
    }while(k);
    while(k){
    }
*/
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(50);

        System.out.println("Tuttuğum sayıyı bul bakalııııım 5 hakkın var");
        int j = 1;
        do {
            System.out.print(j + " Tahmin: ");
            int tahmin = scan.nextInt();
            if (tahmin == i) {
                System.out.println("tebrikler sayıyı buldun");
                break;
            } else if (tahmin > i) {
                System.out.println("aşağı");
            } else {
                System.out.println("yukarı");
            }
            j++;
        } while (j < 6);

        System.out.println("Tuttuğum sayı" + i);


    }
}
