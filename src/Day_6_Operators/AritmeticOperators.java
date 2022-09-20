package Day_6_Operators;

public class AritmeticOperators {
    public static void main(String[] args) {

                  /* int x=5 , y=8 , z;
      z=y%x;
       System.out.println(z);
       int kalan=3123%168;
        System.out.println("kalan"=kalan);*/

        int sayi = 3 + 5 / 2 * 4 % (12 - 9);
        System.out.println(sayi);

        //SORU1----<<<<<Ali 1990 yilinda doğdu. Ali kaç yasinda

        int dogum = 1990;
        int suanTarihi = 2022;
        System.out.println(suanTarihi - dogum);


        //SORU2---<<<Ali ile Ahmet kardeş.Ali 1990 da doğdu.Ali Ahmet den 5 yaş büyük old. Ahmet kaç yasında?
        int ali = 1990;
        int bugun = 2022;
        int ahmet = ali + 5;
        System.out.println(bugun - ahmet);

        // SORU3---<<2cm yarıçapına sahip dairenin alanı ve cevresini hesapla

        //pi=3.14  yarıçap=r
        // cevre=2*pi*r    alan=pi*(r*r)

        float pi = 3.14f;
        System.out.println("alan = " + 3.14 * (2 * 2));
        System.out.println("cevre = " + 2 * 3.14 * 2);

        //SORU4----<<<<300 F kaç C dır? (c=(f-32)/1.8)
        float fl = 300f;
        System.out.println((fl - 32) / 1.8);

        //SORU5----<<<<<<<<<<<<<<
        float f = 92f;
        float k = 55f;
        float m = 89f;
        System.out.println((f + k + m) / 3);

        int ortalama = 80;
        boolean sonuc = ortalama > 80 == true;
        System.out.println(sonuc);

        // DEBUG ETMEK KODU SIRA SIRA ÇALIŞTIRMAK.STEP STEP,  üstteki RUN ın yanı böcek olan :)

                                 /*int sira=15;
++        int siradakiKoltuk=12;
++        int katilimci=113;
++        int kapasite=sira*siradakiKoltuk;
++        System.out.println(kapasite);                   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$#####
++        int bosK=kapasite-katilimci;
++        System.out.println(bosK);
++
++        int  oturanK =katilimci/siradakiKoltuk;
++        int bosK=sira-oturanK;
++        System.out.println(bosK);
++        System.out.println(sira%bosK);*/



                                                                  /*int saat = 31502 % 3600;+        System.out.println("saat= "+ saat);
       int dk=(31502-saat*3600)/60;
        System.out.println("dakika="+dk);
       int sn=31502-(saat*3600)*(dk*60);++        System.out.println("saniye"+sn);


        int ToplamSaniye;
        ToplamSaniye= 31502;
        int saat= ToplamSaniye/3600;
        int dakika= ToplamSaniye%3600/60;
     int saniye= ToplamSaniye%60;
       System.out.println(saat+ " saat" + dakika + "dakika" + saniye + "saniye");*/


    }
}
