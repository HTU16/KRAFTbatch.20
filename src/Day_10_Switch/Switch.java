package Day_10_Switch;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kaçıncı ay");
        //int numOfMonth = sc.nextInt();

//        switch (numOfMonth) {
//            case 1:
//                System.out.println("Ocak");
//                break;
//            case 2 :
//                System.out.println("Şubat");
//                break;
//            case 3 :
//                System.out.println("Mart");
//                break;
//            case 4 :
//                System.out.println("Nisan");
//                break;
//            case 5 :
//                System.out.println("Mayıs");
//                break;
//            case 6 :
//                System.out.println("Haziran");
//                break;
//            case 7 :
//                System.out.println("Temmuz");
//                break;
//            case 8 :
//                System.out.println("Ağustos");
//                break;
//            case 9 :
//                System.out.println("Eylül");
//                break;
//            case 10 :
//                System.out.println("Ekim");
//                break;
//            case 11:
//                System.out.println("Kasım");
//                break;
//            case 12:
//                System.out.println("Aralık");
//                break;
//            default:
//                System.out.println("girdiğiniz sayı bir ay ile eşlesmiyor");
//
//        }

        /*Bir program yazın switch yapısını kullanın. Şu beden
        numaralarını : small(38-40-42),
                       medium(44-46-48),
                       large(50-52-54) yakalasın.
        Aşağıdaki şekilde çıktı alın.Example output: 50 numara bir large bedendir.*/

        int num = 42;

        switch (num) {
            case 38, 40, 42:
                System.out.println(num + " bir small bedendir");
                break;
            case 44, 46, 48:
                System.out.println(num + " bir medium bedendir");
                break;
            case 50, 52, 54:
                System.out.println(num + " bir large bedendir");
                break;
            default:
                System.out.println("girilen numara ile eşlesenbir bedenimiz yoktur");
        }



//basit hesap makinesi

        System.out.println("Hesap makinesi hazır");
        int num1 = sc.nextInt(); // num1 = 5;
        sc.nextLine();
        String aritmetik = sc.nextLine(); //aritmetik = "+";
        int num2 = sc.nextInt(); // num2 = 3;

        int sonuc = 0;

        switch (aritmetik) { //"+"
            case "+":
                sonuc = num1 + num2;
                System.out.println("sonuç : " + sonuc);
                break;
            case "-":
                sonuc = num1 - num2;
                System.out.println("sonuç : " + sonuc);
                break;
            case "*":
                sonuc = num1 * num2;
                System.out.println("sonuç : " + sonuc);
                break;
            case "/":
                sonuc = num1 / num2;
                System.out.println("sonuç : " + sonuc);
                break;
            default:
                System.out.println("girdiğiniz matamatiksel işaret yanlıştır");

        }


    }
}
