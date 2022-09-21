package Day_21_String_Class;

public class Main {

    public static void main(String[] args) {

        String str = "merhaba";
        //System.out.println(str);
        String str2 = str.concat(" dunya");    //concat + dan daha hızlı ve aynı anda bir sürü kodu birlestirmeye yarar.
        String str3 = str + " dunya";

        System.out.println(str2);
        System.out.println(str3);
        System.out.println("str.lenght = " + str.length());               // 1 den basla.kelime uzunlugunu verir.  "lenght"   ***************************
        System.out.println("str charat = " + str.charAt(2));                // 0 dan baslayarak kacıncı kelimeyi verir.******************************
        //   *******************************************// TRİM SAGDA VE SOLDA OLAN BOSLUKLARI SİLER.*************************************************
        System.out.println("str replace = " + str.replace("a", "x"));   // eskiyi siler yeniyi koyar.*********************************
        System.out.println("str replacefirst = " + str.replaceFirst("a", "x"));   // ilk gördüğü harfi yenisiyle değiştirir.**********
        System.out.println("str indexof = " + str.indexOf("e"));          // harfin kacıncı sıradan basladıgını verir. bulamazsa -1 olur.**************
        System.out.println("str equals = " + str.equals(str));           // true false olarak verir.eşitliğe bakar.************************************
        System.out.println("str  isempty= " + str.isEmpty());            //boş olup olmadığını belirler boşsa true cıkar.******************************
        System.out.println("str startswith= " + str.startsWith("mer"));    //kelimenin nasıl basladığına bakar büyük küçük harf algılar true false seklinde.
        System.out.println("str substring = " + str.substring(1, 3));  // sıralamaya göre yazdırır. arasındaki seyleri de yazdırabiliriz.*******************
        System.out.println("str contains =" + str.contains("dunya"));   // içersinde varsa true yoksa false döndürür.*************************************
    }
}

