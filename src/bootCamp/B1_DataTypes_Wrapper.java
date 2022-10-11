package bootCamp;

import java.util.Scanner;

public class B1_DataTypes_Wrapper {
    public static void main(String[] args) {

        // primitive *************************
//        byte<short<int<long<
//        float<double // floating point number
//        char ---> single string character represent
//        boolean -->true or false represent

//        Casting/ -primitive   küçüğü büyüğe cevirme otomatik genişletme *******************
//        implicit casting -- automatically--smaller to larger type
        int a = 100;
        double dl = a;//implicit casting//kapalı
        System.out.println("dl = " + dl);

//        explicit casting --coder must do--larger to smaller type
        double d = 100.0;
        int i = (int)d;//explicit casting/açık     covert ediyoruz yani atama  ****************************


        //--------------------------------------

//        ***Wrapper class****************************************************
//        Why do you need wrapper class for primitive type?
//        Because; For example :
//        nesne oluşturmak için.daha geniş alanda kullanabilmek için
//        Arrays work with both types primitive and non primitive
//        Collection/Map can not work primitive type
//        for that we need wrapper class to utilize flexiblility of collcetion/Map
        //Collection ve Map yapılarından istifade edebilmek için
        // primitive tiplerin wrapper class larına ihtiyac duyarız.

//        every primitive types has a wrapper class

//        int  ---> Integer //
//        double ---> Double
//        char --->Character
//        ....

        double db = 10.0;
        Double db1 = db;//auto boxing
        System.out.println(db1 + db);

        Integer num = 10;
        int n = num;//unboxing

        System.out.println(num == n);    //her türlü şeye bakar.. true?
        System.out.println(10 == 10);
        System.out.println("num.equals(n) = " + num.equals(n));   //sadece değerlerini ölçüyor true..
        System.out.println("num.equals(n) = " + num.equals(n));

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);//2147483647
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);//-2147483648

        System.out.println("Integer.sum(10,20) = " + Integer.sum(10, 20));//30
        System.out.println("Integer.sum(num,n) = " + Integer.sum(num, n));//20
//    sum metodu toplama yapar..*********

        int x = 10;
        int y = 20;

        System.out.println("Integer.max(x,y) = " + Integer.max(x, y));//20
        System.out.println("Integer.max(x,y) = " + Integer.min(x, y));//10
//
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        for (int j = Integer.min(num1,num2); j <= Integer.max(num1,num2); j++) {
//            System.out.print(j+" ");
//        }

//        **parseInt()** - Convert "a string consist of dijit" to primitive
        // string i int e dönüştürür..

        int z = Integer.parseInt("10");

        System.out.println("z = " + z);

        int t = Integer.parseInt("5") + 5;
        System.out.println("t = " + t);

//        **valueOf() - Convert "string consist of dijit" to wrapper class object
        // string i wrapper int e dönüştürür..
        Integer integer = Integer.valueOf("5");

        System.out.println(Integer.valueOf("5")+5);

        //----------------------------------
        System.out.println("Character.isDigit('5') = " + Character.isDigit('a'));//false
        System.out.println("Character.isDigit('5') = " + Character.isDigit('4'));//true

        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));//true
        System.out.println("Character.isLetterOrDigit('a')++Character.isLetterOrDigit('4') = "
                + Character.isLetterOrDigit('a') + "---" + Character.isLetterOrDigit('4'));

        System.out.println("Character.isAlphabetic('*') = " + Character.isAlphabetic('*'));

        String dateEncrypted = "//|*1-=%&&&!__+/*^#2-? M)))'*_+++|||!!'''a>>y//%-/((&^'*ı^^^^---+/s %%%*(&&2||||0-2>>£2";

        String dateDecrypt = "";

        for (int j = 0; j < dateEncrypted.length(); j++) {
            if (Character.isLetterOrDigit(dateEncrypted.charAt(j))){
                dateDecrypt+=dateEncrypted.charAt(j);
            }
        }
        System.out.println("dateDecrypt = " + dateDecrypt);//12Mayıs2022


    }

}