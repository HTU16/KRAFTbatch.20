package Day_23_Arrays;

import java.util.Random;

public class ArraysExample {

    public static void main(String[] args) {
/*
        String[] str = new String[5];
        str[1] = "mehmet";
        str[4] = "ahmet";
        // System.out.println(str[3]);
        // int türünde bir array oluşturun
        // tüm indekslere farklı değerler atayın.
        //ekrana sırası ile yazdırın.

        int deger[];
        deger = new int[3];
        deger[0] = 66;
        deger[2] = 256;

        // System.out.println(deger[0]+25);
        //System.out.println(2*deger[1]+25);
        //System.out.println(5*deger[2]/2+36);
        //for dögüsü ile tümünü yazdırın

      /* for(int i=0; i<3; i++){

            System.out.println(deger[i]*deger[i]);
        }*/

// for döngüsünde arayimizin içerindeki sayıların tümünün karelerini alarak ekrana yazdırın


        // System.out.println("Bugün günlerden "+day[2]);


        //haftanın 3 günün çarşamba olup olmadığını kontrol edin
        //  çarşamba ise  bugün günlerden çarşambadır
        //  çarşamba değil ise  bugün günlerden çarşamba değildir.


// günlerin içerinde cuma var mıdır. varsa true yoksa
// false şeklinde ekrana bir değer yazdırın
 /*       String[] day = new String[7];
        day[0] = "cuma";
        day[1] = "cuma";
        day[2] = "dsa";
        day[3] = "Perşembe";
        day[4] = "cuma";
        day[5] = "cumartesi";
        day[6] = "cuma";
        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (day[i].equalsIgnoreCase("cuma")) {
                count++;
            }
        }
        if(count>0){
            System.out.println("arrayimin içerisinde "+count+" tane cuma kelimesi vardır");
        }
        else{
            System.out.println(false); }
        int[] array=new int[5];
        int array2[];
        array2=new  int[5];
       // int[] array3={1,2,3,4,5,6,7,8};
        int[] array3=new int[8];
        array3[0]=154654;
        array3[1]=21354;
        array3[2]=3;
        array3[3]=421312;
        array3[4]=554654;
        array3[5]=621312;
        array3[6]=754354;
        array3[7]=813;
        String isim="Harun";
        String str[]={"harun","mehmet","ahmet","can","ihsan"};
       int count=0;
       for (int i=0; i<5; i++){
           if(str[i].equalsIgnoreCase(isim)){
               count++;
           }
       }
if(count>0){
    System.out.println("isminiz grup içerisinde vardır");
}else{
    System.out.println("isminiz grup içerisinde yoktur");
}
    Random random=new Random();
    int x= random.nextInt(100);
    System.out.println(x);
        */

        //20 boyutunda bir dizi oluşturun ve
// her bir index’ine random 0 ile 100
// arasın bir değer atayın. Sonrasında 17 index
// numarasındaki veriyi ekrana yazdırın.

        int[] sayi=new int[20];
        Random random=new Random();
        int tek=0,cift=0;
        for(int i=0; i< sayi.length; i++){

            sayi[i]= random.nextInt(100);
            //System.out.println((i)+" sayi :"+sayi[i]);
            if(sayi[i]%2==0){
                cift++;
            }
            else{
                tek++;
            }
        }



        int[] sayi2=new int[20];
        String str[]={"harunasdasdasdas","mehmet","ahmet","can","ihsan"};
        System.out.println("String Array usunluğu "+   str[0].length());



        // System.out.println("Array usunluğu "+     sayi[0].length);


// arrayimizin içerisindeki çift/tek sayılarımız kaç adettir.



        //System.out.println("tek sayı adedi: "+tek);
        // System.out.println("cift sayı adedi: "+cift);


    }

}
