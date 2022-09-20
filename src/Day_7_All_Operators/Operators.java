package Day_7_All_Operators;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {

        //tekli unary    ikili binary    üçlü ternary

        /* int a=55, b=69;                                      //? = mi demek            ! =false yapar tersine cevirir.
        int max =(a<=b)?b:a;
        System.out.println(max);*/


        // int a=4;
        //System.out.println(a++); //4
        // System.out.println(a); //5

        //System.out.println(++a); //6
        //System.out.println(a++); //5

        // System.out.println(a--); //4 a=3
        // System.out.println(--a); //2 a=2


                                                                                                                                                      /*  int a=4;
++        boolean sonuc=a==4;
++        System.out.println(!sonuc);  */             // ! faulse yapar yani tersine cevirir
                                                                                                                                                              /*int i=5,j;
++        j=i++;
++        System.out.println(j);        // 5 cıkar
++        System.out.println(++j); */     // 6 çıkar
                                                                                                                                                                            /* int i=5;
++        i=(i++) + (--i)+(++i)-(i--);
++        //5 + 5 + 6 - 6
++        //6 + 5 + 6 - 5
++        System.out.println(i);  //10 çıkar
++
++        double i=1;
++        double j=i++ + --i/ ++i * i--;
++        System.out.println(j); */       /* int sayi=20;
++        sayi+=5;
++        System.out.println(sayi);
++        sayi-=10;
++        System.out.println(sayi);
++        sayi*=2;
++        System.out.println(sayi);
++        sayi/=3;
++        System.out.println(sayi);
++        sayi%=3;
++        System.out.println(sayi);*/

                                                                                                                                                                                                                                    /*   Scanner scan=new Scanner(System.in);
++        System.out.print("lutfen bir sayi tutunuz:");
++        int sayi=scan.nextInt();
++        int tut=(((sayi*2)+10)/2)-sayi;
++        System.out.print(tut);*/
                                                                                                                                                                                                                                             /* Scanner scan=new Scanner (System.in);
++        int a,b;
++        System.out.print("lutfen bir sayi girin:");
++        a= scan.nextInt();
++        System.out.print("lutfen ikinci sayiyi girin:");
++        b= scan.nextInt();
++        boolean sayi=a==b;
++        System.out.println(sayi);*/
               /* Scanner scan=new Scanner (System.in);
++       int a,b;
++        System.out.print("lutfen bir sayi girin:");
++        a= scan.nextInt();
++        System.out.print("lutfen ikinci sayiyi girin:");
++        b= scan.nextInt();
++        boolean sonuc=(a>=b);
++        System.out.println(sonuc);
++
++        int max=(a>=b)? a:b;
++        System.out.println(max); */


        //ali fizik 92, kimya 55, mat 89
        /*  Scanner scan=new Scanner (System.in);
++        System.out.print("fizik notunu girin:");
++        double f,k,m;
++        f= scan.nextDouble();
++        System.out.print("lutfen kimya notunu girin:");
++        k= scan.nextDouble();
++        System.out.print("lutfen matematik girin:");
++        m = scan.nextDouble();
++
++        double ort=(k+k+m)/3;
++        boolean bir=(ort>=80);
++        boolean iki=(ort>80);
++        boolean uc=(ort==80);
++        boolean dort=!(ort!=80);
++        System.out.println(ort);
++        System.out.println(bir);
++        System.out.println(iki);
++        System.out.println(uc);
++        System.out.println(dort);*/

        Scanner scan = new Scanner(System.in);

        // String lerde karşılaştırma için == kullanma bunun yerine b=scan.nextLine kullan.

        String a = "talha";
        System.out.print("lutfen adinizi yaziniz");
        String b = scan.nextLine();
        boolean sonuc = b.equals(a);
        System.out.println(sonuc);


    }
}
