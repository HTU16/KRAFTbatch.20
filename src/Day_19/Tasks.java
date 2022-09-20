package Day_19;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println("counterOfChar(s) = " + counterOfChar(s));

//        System.out.println("fullNameLength() = " + fullNameLength());
//        System.out.println(fullNameUpper());
//        System.out.println(lastİndex());
//        charInTheColumn();
//        System.out.println(trimmed("      ghfkjg     fkfk      "));
        System.out.println(dateStamp("18/08/2022 21:32:35"));
    }
    //Konsoldan kullanıcıdan bir mesaj alın ve method onun karakter sayısını versin
    public static int counterOfChar(String str){
        return str.length();
    }
    //Adınızın ve soyadınızın kaç karakterden oluştuğunu konsola yazdırın.
    public static int fullNameLength(){

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        return (s1.concat(s2)).length();
    }
    //Adınızın ve soyadınızı büyük harfle yazdıran bir method yazın.
    public static String fullNameUpper(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        return s1.toUpperCase().concat("\n"+s2.toUpperCase());
    }
    //Aldığınız mesajın son index ini yazdırın.
    public static char lastİndex(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        return s1.charAt(s1.length()-1);

    }
    //Aldığınız mesajın her karakterini konsola alt alta yazdırın.
    public static void charInTheColumn(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
    }
    //Bir method yazın ve verilen string in önünde ve arkasında boşluk varsa boşlukları alıp geri döndürsün.
    public static String trimmed(String str){

        return str.trim();

    }
    ///   18/10/2022 20:50:55   tarih bildirimini tarih damgasına döndürün   18102019145055
    public static String dateStamp(String str){

        String replace = str.replace("/", "");
        String replace1 = replace.replace(" ", "");
        return replace1.replace(":","");
    }




}
