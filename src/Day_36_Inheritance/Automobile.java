package Day_36_Inheritance;


//overloading -overriding*************************************************************************
//aynı sınıfta yapılır ---- inheritance sınıflarda yapılır is A gibi
//metot parametresi farklı---- metot paremetresi aynı
//private ve final methotlarda yapılabilir----  yapılamaz..
//overloading de bos constructor yapılır..----- öyle bir durum yok.
//extends yapılırsa ne tanımlanırsa (int,string..) diğer sınıfta da tanımlama yapılmalı..


//STATİC METOTDA İNT TERİMİ DEĞİŞTİRİRSEK HER YERDE DEĞİŞTİRDİĞİMİZ SAYI  YANİ SON SAYI GECERLİDİR. örn: static int a;
//STATİC YOK SADECE DEĞER VARSA  YAZILAN SAYI DEĞERİ GELİR.     örn: int a; gibi
public class Automobile extends Vehicle {
    String radioBrand;
    int hb;

    public void start() {
        System.out.println("araba start stop ile çalıştı");
    }
}
