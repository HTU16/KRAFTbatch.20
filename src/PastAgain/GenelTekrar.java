package PastAgain;

import java.util.Scanner;

public class GenelTekrar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.print(" Dairenin yari capini giriniz; ");
//        int yaricap=scan.nextInt();
//        final double PI=3.14;                                                   //yarıçap
//        double alan=PI*yaricap*yaricap;
//        System.out.println(" Dairenin alani ="+alan);
//        System.out.println(" Dairenin cevresi = "+(2*PI)*yaricap);


//        System.out.println(" Lutfen guncel Fahrenheit degerini yaziniz;");
//        double fah= scan.nextDouble();
//        double cel=(fah-32)/(1.8);                                                   //fahrenheit
//        System.out.println(" Guncel Celcius degeri " +cel );


//        System.out.println(" Lutfen toplantida kac adet sira oldugunu giriniz; ");
//        int sira= scan.nextInt();
//        System.out.println(" Lutfen toplantida her sirada kac adet koltuk oldugunu giriniz; ");
//        int koltuk= scan.nextInt();
//        System.out.println(" Lutfen toplantiya kac kisinin katildigini giriniz; ");
//        int katılanlar= scan.nextInt();
//        int kapasite=sira*koltuk;                                                                 //kapasite
//        System.out.println(" Toplanti salonunun toplam kapasitesi = "+sira*koltuk);
//        System.out.println(" Bos koltuk sayisi = "+(katılanlar-kapasite));
//        System.out.println(" Oturulan sira = "+katılanlar/koltuk+1);
//        System.out.println(" Toplam oturulan sira = "+(sira-katılanlar/koltuk+1));
//        System.out.println(" Toplam bos kalan koltuk = "+(koltuk-katılanlar/koltuk+1));

        System.out.println("--------------------------------------------------");

//        System.out.println(" Lutfen surenin toplam kac saniye oldugunu giriniz: ");
//        int saniye=scan.nextInt();
//        int saat= saniye/3600;
//        int dakika= saniye%3600/60;                                                         //dakika saniye saat
//        int saniye2= saniye%60;
//        System.out.println(" Toplam saat ="+saat+ " dakika = "+dakika+ " saniye = "+saniye2);

        System.out.println(" -------------------------------");

//        System.out.print(" Lutfen 10 ile 100 arasinda bir rakam degeri giriniz; ");
//        int a=scan.nextInt();
//        int a1= ((a*5)/2);
//        int a2= a1++;
//        int a3= a2%4;
//        int a4= a1--;
//        System.out.println("  sonuc = " +a3);

//           int a=15;
//          a*=5; a/=2;  a++; a%=4; a--;System.out.println(a);
//          böyle yazmayıda öğren..

//-----------------------------------------

//        System.out.print(" Lutfen hayalinizdeki arabanin fiyatini giriniz; ");
//        double arabaFiyati=scan.nextDouble();
//        System.out.print(" Lutfen Kdv miktarini giriniz; ");
//        double kdv=scan.nextDouble();
//        System.out.print(" Lutfen Otv miktarini giriniz; ");
//        double otv=scan.nextDouble();                                                //arac kdv ötv hesaplama
//        double kdvDegeri= (arabaFiyati*kdv)/100;
//        double arabaFiyati1= kdvDegeri+arabaFiyati;
//        double otvDegeri= (arabaFiyati1*otv)/100;
//        System.out.println(otvDegeri);
//        double sonDurum= otvDegeri;
//        double v = 1000000;
//        boolean sonuc= otvDegeri>700.000 && otvDegeri<v;
//        System.out.println(sonuc);

//
//        System.out.print(" Lutfen adinizi giriniz; ");
//        String adiniz=scan.nextLine();
//        System.out.print(" Lutfen birinci sayiyi giriniz; ");
//        double sayibir=scan.nextDouble();
//        System.out.print(" Lutfen ikinci sayiyi giriniz; ");
//        double sayiiki=scan.nextDouble();
//        System.out.print(" Lutfen ucuncu sayiyi giriniz; ");
//        double sayiuc=scan.nextDouble();                                          //not ortalama true false
//        double ortalama= (sayibir+sayiiki+sayiuc)/3;
//        System.out.println(" ortalama =" +ortalama);
//        boolean a= ortalama>70 && ortalama<80;
//        boolean a1= !(ortalama>80 || ortalama<90);
//        boolean a2= (ortalama>90 && ortalama<100);
//        boolean a3= !(ortalama==100);
//        System.out.println(adiniz+ " bey sonuc =" +a );
//        System.out.println(adiniz+ " bey sonuc =" +a1 );
//        System.out.println(adiniz+ " bey sonuc =" +a2 );
//        System.out.println(adiniz+ " bey sonuc =" +a3 );


        System.out.println(" ---------------------------------------");

//        System.out.print(" Lutfen birinci sayiyi giriniz; ");
//        int sayi1= scan.nextInt();
//        System.out.print(" Lutfen ikinci sayiyi giriniz; ");
//        int sayi2= scan.nextInt();
//        System.out.print(" Lutfen ucuncu sayiyi giriniz; ");
//        int sayi3= scan.nextInt();                                                 //sayı sıralaması
//        if (sayi1>sayi2&&sayi1>sayi3){
//            System.out.println(" Buyuk olan sayi " +sayi1+ " dir");
//        } else if (sayi2>sayi1&&sayi2>sayi3) {
//            System.out.println(" Buyuk olan sayi " +sayi2+ " dir");
//        } else if (sayi3>sayi2&&sayi3>sayi2) {
//            System.out.println(" Buyuk olan sayi " +sayi3+ " dir");
//        }else{
//            System.out.println(" Dalga gecme buyuk bir sayi degeri gir");
//        }

//
//        System.out.print(" Lutfen ders notunuzu giriniz; ");
//        int dersNotu= scan.nextInt();
//
//        if (dersNotu>=85&&dersNotu>100){
//            System.out.println(" Ders notu karsiligi A dir ");
//        } else if (dersNotu>=70&&dersNotu<85) {
//            System.out.println(" Ders notu karsiligi B dir ");
//        } else if (dersNotu>=55&&dersNotu<70) {
//            System.out.println(" Ders notu karsiligi C dir ");
//        }else if (dersNotu>=40&&dersNotu<55) {                                     //harf notu hesaplama
//            System.out.println(" Ders notu karsiligi D dir ");
//        }else if (dersNotu>=0&&dersNotu<40) {
//            System.out.println(" Ders notu karsiligi F dir ");
//
//        }
//


//        System.out.println("lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin ve oda adı seçin.");
//        System.out.println("1.kat : Resepsion-Güvenlik-Oda hizmetleri\n2.kat : Yemekhane-Dinlenme salonu-Room1-Room2\n3.kat : Room3-Room4-Room5-Room6");
//
//        int kat= scan.nextInt();
//        scan.nextLine();
//        String secim=scan.nextLine();
//
//        switch (kat){                                                   //otel sorusu
//            case 1:
//                switch (secim){
//                    case "resepsion":
//                        System.out.println("tüm işlemleriniz için bekleriz");
//                        break;
//                    case " güvenlik":
//                        System.out.println("profosyonel bir hizmettir");
//                        break;
//                    case " oda hizmetleri":
//                        System.out.println("temizlik ve taşıma hizmetleri için 101 dahili hattan ulaşabilirsiniz\n" +
//                                "//        Yemekhane : Kahvaltı 08-11");
//                        break;
//                    default:
//                        System.out.println(" böyle bir oda yoktur");
//
//
//                }
//                break;
//
//            case 2:
//                switch (secim){
//                    case "yemekhane":
//                        System.out.println("Kahvaltı 08-11\nÖğle yemeği 12-15\nAkşam yemeği 18-21");
//                        break;
//                    case "dinlenme salonu":
//                        System.out.println("24 saat çay servisi ile hizmetinizdedir");
//                        break;
//                    case "Room1","Room2":
//                        System.out.println("ekonomik oda");
//                        break;
//                    default:
//                        System.out.println(" böyle bir oda yoktur");
//
//                }
//
//                break;
//
//            case 3:
//                switch (secim){
//                    case " room3","room4":
//                        System.out.println("standart oda");
//                        break;
//                    case "room5","room6":
//                        System.out.println("özel oda");
//                        break;
//                    default:
//                        System.out.println(" böyle bir oda yoktur");
//                }
//                break;
//            default:
//                System.out.println(" Otelimizde boyle bir kat yoktur.");
//
//        }


    }
}
