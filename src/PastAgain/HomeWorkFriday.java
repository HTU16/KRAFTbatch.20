package PastAgain;

import java.util.Scanner;

public class HomeWorkFriday {

    public static void main(String[] args) {
        System.out.println(firstThree("htuysal fenerbahce spor kulubu"));
        System.out.println(boslukKaldir("htuysal fenerbahce spor kulubu"));
        System.out.println(ikinci("htuysal fenerbahce spor kulubu"));
        System.out.println(change("fenerbahce", "e", "x"));
        System.out.println(kelime("htu"));
        System.out.println(dongu("hicran dolu", "gunler"));
        System.out.println(harf("fenerbahce", "b"));
        System.out.println(ctrl("fenerbahce spor kulubu", "bahce"));
        System.out.println(shortLong("kanuni", "yavuz"));
        System.out.println(nokta("fb"));
        System.out.println(ikiKelime("kanka"));
        System.out.println(adSoyad("h.talha uysal"));
        System.out.println(karakter("manchester united"));
        System.out.println(yineleyen("    al ex and e r   "));
        System.out.println(rakamBul("   1al ex   3and er    3"));
        System.out.println(unluUnsuz(""));
        // System.out.println(ucKelime());
        System.out.println(sehir());

    }
    // Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan , 3 harften az  ise inputu döndüren bir metot yazınız.

    public static String firstThree(String str) {
        if (str.length() < 3) {
            return str;
        } else {
            return str.substring(0, 3);
        }
    }

    //  Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
    public static String boslukKaldir(String str) {
        if (str.length() < 3) {
            return str;
        }
        return str.replace(" ", "%");
    }

    //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program yazdır.
    public static String ikinci(String str) {
        return str.substring(str.length() / 2);
    }

    //  Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
    //alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu yazınız.
    public static String change(String str, String old, String new1) {
        return str.replaceFirst(old, new1);
    }


    // Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
    public static String kelime(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(str.charAt(i));
            }
        }
        return "";
    }

    //  Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
    //  kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek) Ankara,a 3    Edirne,e 2   bulamazsa 0 döndür.
    public static int dongu(String str, String target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equalsIgnoreCase(target)) {
                count++;
            }
        }
        return count;
    }

   /* String a,b;
    Scanner scan=new Scanner(System.in);
    a= scan.nextLine();
        System.out.println("LUTFEN KELIME YAZIN: ");
    b=scan.nextLine();
        System.out.println("LUTFEN HARF YAZIN: ");
}*/


    // Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
    //kaldırılmış şekilde string döndüren programı yazını
    public static String harf(String kel, String harf) {
        return kel.replace(harf, "");           // yazılan harfi silmeye yarar.
    }


    /*Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
    gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
    Kinlenmek true
    Kin tutmak true
   Ekin ektim true
    Keskin ilçesinden geçiyorum false
    Neden kin tutuyorsun false*/
    public static boolean ctrl(String kelime, String kontrol) {
        if (kelime.substring(0, kontrol.length()).equalsIgnoreCase(kontrol) || kelime.substring(1, kontrol.length()).equalsIgnoreCase(kontrol)) {
            return true;
        }
        return false;
    }

    //Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
    //defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    public static String shortLong(String str1, String str2) {
        String sonuc = "";
        for (int i = 0; i < 2; i++) {
            sonuc += str1;
        }
        for (int i = 0; i < 30; i++) {
            sonuc += str2;
        }
        for (int i = 0; i < 2; i++) {
        }
        sonuc += str1;
        return sonuc;

    }

    //  Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
    // altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    public static String nokta(String str) {
        if (str.length() >= 5) {
            return str.substring(0, 5);
        } else {
            for (int i = 0; i < 5 - str.length(); i++) {
                String sonuc = "";
                sonuc += ".";
            }
            return str.concat("1907");
        }
    }

    // Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true almıyorsa false yazdırın.
    public static boolean ikiKelime(String str) {
        String str1 = str.toLowerCase();
        return str1.substring(0, 2).equals(str1.substring(str1.length() - 2));
    }

    // Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.
    public static String adSoyad(String str) {
        String str1 = str.trim();
        return str1.substring(str1.lastIndexOf(" ") + 1);
    }

    // Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
    // çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
    public static String karakter(String str) {
        String result = "";
        while (!str.isEmpty()) {
            result += str.charAt(0);
            str = str.replace(str.substring(0, 1), "");
        }
        return result;
    }

    // Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string olarak return eden methot yazınız.
    public static String yineleyen(String str) {
        String str1 = str.replace(" ", "");
        String result = "";
        while (!str1.isEmpty()) {
            if (str.substring(1).contains(str1.substring(0, 1))) {
                result += str1.substring(0, 1);
            }
            str1 = str1.replace(str1.substring(0, 1), "");
        }
        return result;
    }

    //yazilan kelimenin içerinde sayıları yazdıran metodu yazın
    public static String rakamBul(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                result += str.charAt(i);

            }
        }
        return result;
    }

    // Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve ünsüz harfleri
    // ayrı ayrı ekrana yazan programı yazınız.

    public static String unluUnsuz(String str) {
        Scanner giris = new Scanner(System.in);
        String metin;
        System.out.println("Lutfen bir metin giriniz:");
        metin = giris.nextLine();
        int sayac = 0;
        for (int i = 0; i < metin.length(); i++) {
            String harf = metin.substring(i, i + 1);

            if (harf.equals("a") || harf.equals("e") || harf.equals("i") || harf.equals("o") || harf.equals("u")) {
                sayac++;
            }
        }
        System.out.println("Girilen metindeki unlu harf sayisi:" + sayac);

        return metin;
    }


    // 17* Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3  harfini kelimeden keserek sonuna ekleyin.

  /*  public static String kesmeliHarf(String str) {
        Scanner giris = new Scanner(System.in);
        String kesme;
        System.out.println("Lutfen bir metin giriniz:");
        kesme = giris.nextLine();


    }*/

     /*   public static String ucKelime() {
    String str3 = "Hakkiniz dolmustur. Program kapaniyor.";
        Scanner scan = new Scanner(System.in);
        System.out.println("birinci kelime giriniz : ");
        String word = scan.nextLine();
        word = word.toLowerCase();
        if (word.length() >= 1 && word.length() <= 4) {
           System.out.println("ikinci kelime giriniz : ");
            String word2 = scan.nextLine();
            word2 = word2.toLowerCase();
            if (word2.length() >= 1 && word2.length() <= 4) {
                return word.concat(" " + word2);
            } else {
                System.out.println("Hatali sayida karakter sayisi girdiniz tekrar giriniz :");
                loop1:
                for (int i = 0; i < 3; i++) {
                    System.out.println("ikinci kelime giriniz : ");
                   String word3 = scan.nextLine();
                    if (word3.length() >= 1 && word3.length() <= 4) {
                        return word.concat(" " + word3);
                    } else {
                        continue loop1;
                    }
                }
            }
        } else {
            System.out.println("Hatali sayida karakter sayisi girdiniz tekrar giriniz :");
            loop2:
            for (int i = 0; i < 3; i++) {
                String word4 = scan.nextLine();
                if (word4.length() >= 1 && word4.length() <= 4) {
                    System.out.println("ikinci kelime giriniz : ");
                    String word2 = scan.nextLine();
                    word2 = word2.toLowerCase();
                    if (word2.length() >= 1 && word2.length() <= 4) {
                        return word4.concat(" " + word2);
                    } else {
                        continue loop2;
                    }
                }
            }
        }
        return str3;
   }*/

    //soru26  Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı  sayılarda dönüyorsa false yazdıran metodu yazınız.
    public static boolean sehir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cumle yaziniz:");
        String kelime = scan.nextLine();
        String[] str;
        str = kelime.split("ankara");
        int count = str.length - 1;
        str = kelime.split("bursa");
        int count2 = str.length - 1;
        if (count2 == count) {
            return true;
        }
        return false;
    }
}
