package Day_14_Method;

import java.util.Scanner;

public class MethodDay {

    public static void main(String[] args) {

//        message();
//        message();
//        message();
//        aritmetik();
//        bigOfTwo();
//        kiloToOkka();
//        short s = 5;
//        message4((int)5.5);
        message5("Cuma",12);
        message5("salı",9);


    }

    public static void message() {
        message2();
    }

    public static void message2() {
//            message3();
        System.out.println("message3 cagrılmadı");
    }

    public static void message3() {
        System.out.println("message3 den hello world");
    }

    public static void aritmetik(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ortalama için 3 sayı girin");
        int sayı1 = sc.nextInt();
        int sayı2 = sc.nextInt();
        int sayı3 = sc.nextInt();
        System.out.println("girmiş olduğunuz sayıların ortalaması " + (sayı3 + sayı2 + sayı1) / 3 + " dir");

    }
    public  static void bigOfTwo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("2 sayı giriniz");
        int sayı1 = sc.nextInt();
        int sayı2 = sc.nextInt();
//        int sonuc =sayı1>sayı2 ? sayı1 : sayı2;
//        System.out.println(sonuc);
        System.out.println(sayı1 > sayı2 ? sayı1 : sayı2);

    }

    public static void kiloToOkka(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilogramı girin");
        double kilogram = sc.nextDouble();
        System.out.println(kilogram / 1.282);

    }
    public static void message4(int num){
        System.out.println(num + " burada");
        System.out.println(num+3);
    }

    public static void message5(String str,int i){
        System.out.println("Ayın " + i + " i " + str + " dir");
    }

    public static void message6(int a,int b){

    }
}
