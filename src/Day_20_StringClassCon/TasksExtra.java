package Day_20_StringClassCon;

public class TasksExtra {

    public static void main(String[] args) {
        System.out.println(ortadakı3("salih"));
        System.out.println(simulateNames("enes", "Torlak"));
        withoutFirst("akif", "Öztürak");
        System.out.println(nickNameGen("Alparslan", "Öztürk"));
        System.out.println(FrontEnd("sasama", "hasat"));
        System.out.println(reverse("merhaba"));
        System.out.println(coverÜ("Dün akşam eve giderken onları görmüştüm.", 'ü'));

    }
//    1-İsminizin ortadaki 3 harfini veren bir method yazın.

    public static String ortadakı3(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);

    }

    //    2-İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna
//      kısaltın yani fazla karakterleri atın. Ve isminizle soy adınızı
//      birleştirin.
//      Ahmet    can
    public static String simulateNames(String str1, String str2) {

        if (str1.length() > str2.length()) {

            return str1.substring(0, str2.length()).concat(str2);

        } else if (str2.length() > str1.length()) {
            return str1.concat(str2.substring(0, str1.length()));

        } else {
            return str1.concat(str2);
        }

    }
//  3-İsminizin baş harfi soy adınızda varsa soy adınızı isminizin
//  baş harfinden arındırıp yazdıran bir method oluşturun.

    public static void withoutFirst(String str, String str2) {
        String empty = "";
        char birincininIlkHarfi = str.charAt(0);

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != birincininIlkHarfi) {
                empty += str2.charAt(i);
                //empty = empty+str2.charAt(i);
            }

        }
        System.out.println(empty);
    }
    //  4-İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname
//      oluşturan bir method yazın.
    public static String nickNameGen(String name, String surname){
        String nickName = name.substring(0,3).concat(surname.substring(surname.length()-3));
        return nickName;

    }
    //5-Girilen 2 kelimeden kısa olanı uzun olanın başına ve sonuna ekleyen bir method yazın.
    public static String FrontEnd(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str2.concat(str1).concat(str2);
        } else if (str2.length() > str1.length()) {
            return str1.concat(str2).concat(str1);
        } else {
            return str1.concat(str2);
        }
    }

    //6-adınızı tersden yazdırın
    public static String reverse(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }
    //7-Dün akşam eve giderken onları görmüştüm.

    public static String coverÜ(String str, char arg) {
        String child = "";
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == arg && str.charAt(i + 1) != arg && str.charAt(i - 1) != arg) {

                child += str.charAt(i - 1);
                child += str.charAt(i + 1);

            }
            if (str.charAt(0) == arg && i == 1) {
                child += str.charAt(1);

            }
            if (str.charAt(str.length() - 1) == arg && i == str.length() - 1) {
                child += str.charAt(str.length() - 1);

            }
        }
        return child;
    }
}
