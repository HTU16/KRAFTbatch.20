package Day_8_All_Operators_2;

import java.util.Scanner;

public class LogicOperators {

    public static void main(String[] args) {
        // boolean sonuc=(5>=4)&&(4==4);               //&& iki tane ve varsa ilkine bakar false ise ikiciye bakmaz.
        //    true   true
        //  boolean sonuc=(5>=6)&&(4==4);              // & bi ve tane varsa ikisine de ayrı ayrı bakar.
        // false    false                              // bir yerde false varsa hep false dir.
        //  boolean sonuc=(5>=5)&&(4==3);
        //  true  false
        // System.out.println("sonuc  = "+ sonuc);

        //  boolean sonuc= (false)&&(false);     //tek false varsa hepsi false dur.

        // System.out.println("sonuc  = "+ sonuc);

        /*boolean sonuc= (false)||(false);      // | tek veya da true varsa hep true dur.
++        boolean sonuc1= (false)||(true);
++        boolean sonuc2= (true)||(false);
++        boolean sonuc3= (true)||(true);
++
++        System.out.println("sonuc  = "+ sonuc);
++        System.out.println("sonuc  = "+ sonuc1);
++        System.out.println("sonuc  = "+ sonuc2);
++        System.out.println("sonuc  = "+ sonuc3);
++
++
++        boolean sonuc= (false)^(false);   //^ ya da işaretidir.  t-t olursa false,, f-f olursa true, t-f olursa false.
++
++        // &= ve     | = veya    ^ ya da */
        //  & false varsa hep false olur.      | true varsa her yer true.

                                                                                                                                            /*int a=5,b=10,c=10;
++        boolean sonuc=a>b || b>=c;
++        System.out.println(sonuc);*/



        /*  int a=5,b=10,c=10;
++        boolean sonuc=a>b || b>=c && !(a>c);
++        System.out.println(sonuc);*/      /* Ödev: Scanner sınıfını kullanarak kullanıcıdan 10 ile 100 arasında bir rakam aldırın;
++        Bu sayıyı operatör kullanarak 5 ile çarpın;
++        Çıkan sonucu operatör kullanarak 2 ye bölün;
++        Çıkan sonucu operatör kullanarak 1 arttırın;
++        Çıkan sonucu operatör kullanarak 4 e göre modunu alın;
++        Çıkan sonucu operatör kullanarak 1 azaltın;
++        Çıkan sonucu ekrana yazdırın*/
                                                    /* Scanner scan=new Scanner(System.in);
++        System.out.print("lutfen 10 ile 100 arasi sayi giriniz:");
++        int sayi=scan.nextInt();
++        int girilenSayi =(((((sayi*5)/2)+1))%4)-1;
++        System.out.println(girilenSayi);
++
++       /* Ödev:
++        Kullanıcıdan double araba fiyatı ,KDV , ÖTV oranını alın. Araba fiyatı üzerinden KDV miktarını
++        hesaplayın . Hesapladığınız toplam tutar (araba +KDV miktarı) üzerinden ÖTV oranındaki artışı
++        toplam tutara ekleyerek hesaplayın. Çıkan sonuç 700.000 ve üzeri ile 1.000.000 (bir milyon)
++        arasında ise ekrana true yazdırın*/
        /* Scanner scan=new Scanner(System.in);
++
++        System.out.print("lutfen araba fiyatini giriniz");
++        double araba= scan.nextDouble();
++        System.out.print("lutfen kdv fiyatini giriniz");
++        double kdv= scan.nextDouble();
++        double kdvTutari= araba*100/kdv;
++        System.out.println("kdvli fiyat:" +kdvTutari);
++        System.out.print("lutfen otv fiyatini giriniz");
++
++        double otv= scan.nextDouble();
++        double  ötvTutari= araba*100/otv;
++        System.out.println("otv fiyatli: " + ötvTutari);
++        double toplamFiyat=ötvTutari+ kdvTutari;
++        boolean sonuc= toplamFiyat>=700000 && toplamFiyat<=1000000;
++        System.out.println(sonuc);*/

             /* Ödev:
++        Scanner sınıfını kullanarak kullanıcıdan önce String türünde kullanıcının ismini alın ardından
++        double türünde 0-100 arasında 3 sayı alın ;
++        Bu verileri kullanarak
++        1. Ortalama 70 ile 80 arasında ise ekrana true;
++        2. Ortalama 80 ve üzeri ile 90 arasında ise false;
++        3. 90 ve üzeri 100 arasında ise true;
++        4. Tam 100 ise ekrana false yazdırın*/

        Scanner
        scan = new Scanner(System.in);
        System.out.print("lutfen isim giriniz : ");
        String isim = scan.nextLine();
        System.out.print("lutfen 0 ile 100 arasi sayi giriniz : ");
        double sayi1 = scan.nextDouble();
        System.out.print("lutfen 0 ile 100 arasi sayi giriniz : ");
        double sayi2 = scan.nextDouble();
        System.out.print("lutfen 0 ile 100 arasi sayi giriniz : ");
        double sayi3 = scan.nextDouble();
        double ort = (sayi1 + sayi2 + sayi3) / 3;
        System.out.println("ortalama not : " + ort);

        boolean sonuc1 = ort >= 70 & ort <= 80;
        System.out.println("not1 : " + sonuc1);
        boolean sonuc2 = ort >= 80 & ort <= 90;
        System.out.println("not2 : " + sonuc2);
        boolean sonuc3 = ort > 90 & ort < 100;
        System.out.println("not3 : " + sonuc3);
        boolean sonuc4 = !(ort == 100);
        System.out.println("not4 : " + sonuc4);
        System.out.println("SAYIN H.TALHA UYSAL notlariniz yukaridaki gibidir");

    }
}
