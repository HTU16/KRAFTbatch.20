package PastAgain;

import java.util.Scanner;

public class ImportantInformations {


    //import static  java.lang.Math.*;          //bunu kullanırsak tüm math sınıfını static yapar.her yerden cagırılır.

    //sqrt karekökünü alır.
    //max sınıfı en büğünü verir.

    // excute: YÜRÜTMEK DEMEK.
    // declare: BİLDİRMEK DEMEK.değişkene isim vermek
    //fields : özellik demek
    //array.sort : sıralama yapar.
    //reserve: tersden yazdırır
    //instance veriable override edilemez...gizlenebilir
    //static metodlar override edilemez. gizlenebilir
    //vehicle=arac demek..
    //super tanımlarsak parametreli sınıfı getirir. bos super i tanımlamazsak üstteki sınıf gelir..

    //static blok ilk calışır ve bir defa calışır.
    //normal block her defasınada calısır.

    // DÖNÜŞTÜRME (CONVERTING)  2 ye ayrılır.
    // widening casting<<< küçük datadan büyük dataya sıralar. 'otomatik' kapalı dönüştürme ( implicit conversion / casting up)
    // narrowing casting<<< büyük datadan küçük olana sıralar. 'manuel'açıktan dönüştürme ( explicit coversion / casting down)
    // assign atama operatörü (=)


    //System.out.println(str.equals(str1));   true verir. içeriğe yazılana bakar.  equals esitlik kontrolu yapar.
    //System.out.println(str == str1);      false olur. objelere bakar. farklılık olur.
    // kod parantez ile bitiyorsa  her zamana metoddur.()  diğer türlü field olabilir.

    //int sonuc=sayia>sayib ? sayia : sayib; yazarsak daha pratik
    // sayi a büyükse b den a yı yazdır değilse b yi yazdır şeklindedir.

    //void olursa this name
    //return döndürür.Stringler int boolean...

    //STATİC METOTDA İNT TERİMİ DEĞİŞTİRİRSEK HER YERDE DEĞİŞTİRDİĞİMİZ SAYI  YANİ SON SAYI GECERLİDİR. örn: static int a;
    //STATİC YOK SADECE DEĞER VARSA  YAZILAN SAYI DEĞERİ GELİR.     örn: int a; gibi

    //overloading -OVERRIDING  ********************************************************************************

    //aynı sınıfta yapılır ---- inheritance sınıflarda yapılır is A gibi
    //metot parametresi farklı---- metot paremetresi aynı
    //private ve final methotlarda yapılabilir----  yapılamaz..
    //overloading de bos constructor yapılır..----- öyle bir durum yok.
    //extends yapılırsa ne tanımlanırsa (int,string..) diğer sınıfta da tanımlama yapılmalı..

    //ERİŞİM BELİRLEYECİLER  --ACCESS MODIFIERS*****************************

    //DEFAULT: OLURSA SADECE OLDUGU PACKAGE ONA ULAŞABİLİR,DİĞER PACKAGE ULAŞAMAZ...
    //PRİVATE: SADECE TANIMLI OLDUĞU SINIF CLASS ULAŞABİLİR...
    //PUBLİC: HER CLASS HER PACKAGE ONA ULAŞABİLİR.
    //PROTECTED: AYNI PACKAGE VEYA ALT SINIFLAR ULAŞABİLİR.********** extends yapılabilir..


    //REMOVE: YAZILAN YERİ KAYBEDER.SİLİNİR YOK OLUR.***************************
    //SET : SİLER VE YERİNE YENİ  BİR ŞEY EKLER.. KAÇINCI SIRAYA YAZARSAN ORAYA GİRER .*************
    // ADD: EKLEME YAPAR..*************************************
    //isEmpty: BOŞ OLUP OLMADIĞINI KONTROL EDER.*************
    // clear : İÇERİĞİ SİLMEYE YARAR.*************************

//contains *************************************************************************************************
    //Bir string değer içinde başka bir string değeri aratırken
    //kullanabileceğimiz bir method dur. Boolean değer döndürür. Eğer
    //aratılan string değeri bulursa true bulamazsa false döndürür

    //      lenght:  boşluk arada olsa bile  boşluğu da sayar. kac adet harf oldugunu buluruz..

    //lower: hepsini küçük yapar..           upper: hepsini büyük yapar.

    //charAt:  saymaya 0 dan basla.. kacıncı sıradaki harfi verir.. son harf için -1 yaz..

    // trim *****************************************************************************************************
    //  String değerin önündeki ve arkasındaki boşlukları alır. Ve stringin yeni halini
    //döndürür. Dikkat edin! String in önünde ve arkasında bir boşluk varsa length kısalır
    // Ancak string değerin ilk ve son karekteri arasındaki boşlukları almaz.

    // VALUEOF : Method, String ve int parametre kabul eder.Çağrıldığı wrapper class için object döndürür.**************

    // PARSE.INT : Parametre olarak String kabul eder. (convert String to int). int döndürür.***********************************

    // typeValue()       Bir wrapper class nesnesinin primitive değerini döndürür.*************************


    // replace *******************************************************************************************
    //Bir string değerdeki char değeri yada bir substring i değiştirir. Dönen
    // string değişimden sonraki yeni string dir.           DÜZELTMEDİR.

// indexOf ****************************************************************************************************
    // Bir string değer içinde başka bir string değerin ilk karakterinin index
    // numarasını döndürür. Döndürülen değer int tipindedir. Eğer bulamazsa -1 döndürür.

    // substring(int beginIndex, int endIndex)***********************************************************************
    //Girilen index numarasından itibaren stringin sonuna kadar olan bölümü döndürür.
    //Eğer son index değeri de girilirse ona kadar olan bölümü döndürür.   7.harf dahil 14. hariç örneği


    // switch lerde sadece tam sayılar kullanılır. double float  boolean kullanılamaz..
    // char kullanılabilir.

}