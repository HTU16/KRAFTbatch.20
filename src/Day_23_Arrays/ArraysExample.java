package Day_23_Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample {

    public static void main(String[] args) {


        String[] str = new String[5];

        String str1[] = new String[6];

        String[] str2;
        str2 = new String[7];

        String str4[];
        str4 = new String[20];  //0123456789...19

        int[] sayi1 = new int[17];
        boolean[] sayi2 = new boolean[7];
        char[] sayi = new char[4];           ///köşeli parantez içindeki sayılara index numarası denir.
        double[] a = new double[8];
        String[] b = new String[0];

        String[] st = new String[5];
        System.out.println(st[0]);  // sonuc olarak null gelir.

        int[] i = new int[5];
        System.out.println(i[0]);   // sonuc 0 olarak cıkar.

        int[] abc = new int[3];
        abc[0] = 2022;
        abc[1] = 978;
        abc[2] = 133;
        System.out.println(abc[0]);
        System.out.println(abc[1]);
        System.out.println(abc[2]);

        for (int j = 0; j < 3; j++) {
            System.out.println(abc[j]);
        }


        int[] x = new int[3];
        x[0] = 2;
        x[1] = 3;
        x[2] = 5;
        System.out.println(x[0] * x[0]);
        System.out.println(x[1] * x[1]);
        System.out.println(x[2] * x[2]);


        for (int k = 0; k < 2; k++) {
            System.out.println(x[k * k]);

        }

        String[] q = new String[7];
        q[0] = "pazartesi";
        q[1] = "salı";
        q[2] = "carsamba";
        q[3] = "persembe";
        q[4] = "cuma";
        q[5] = "cumartesi";
        q[6] = "pazar";
        System.out.println("bugun gunlerden " + q[2]);

        //  String [] q={0,1,2,3,4,5,6,7};   üsttekinin aynısı bu sekilde de kullanılabilir..*************************************************
        // String q[]={pazartesi,,salı,carsamba,persembe,cuma,cumartesi,pazar);    ya da böylr kullan..***************************************

        if (q[2].equals("carsamba")) {
            System.out.println("haftanin ucuncu gunu carsambadir");

        } else {
            System.out.println("haftanin ucuncu gunu carsamba degildir");

        }


        //günlerde cuma var mıdır varsa true yoksa false yazdır.
        for (int h = 0; h < 7; h++) {
            if (q[h].equals("cuma")) {
                System.out.println(true);

            } else {
                System.out.println("");

            }

        }

        String isim = "htu";
        String j[] = {
                "htu", "talha", "uysal", "michael"
        };
                  /* Random random=new Random();
        int w= random.nextInt(100);
       System.out.println(w);*/
        //20 boyutunda bir dizi oluşturun ve her bir index’ine random 0 ile 100 arasın bir değer
        //atayın. Sonrasında 17 index numarasındaki veriyi ekrana yazdırın


        Random random = new Random();
        int[] sayi5 = new int[20];
        for (int m = 0; m < 20; m++) {
            sayi5[m] = random.nextInt(100);
            // System.out.println(m)+" sayi :"+ sayi5[m];

        }
        System.out.println("17.sayi:" + sayi5[17]);
        //array içindeki tek ve cift sayılar kaac adettir.
        int tek = 0, cift = 0;
        for (int o = 0; o < 20; o++) {
            if (sayi[o] % 2 == 0) {
                cift++;

            } else {
                tek++;

            }

        }
        System.out.println("tek = " + tek);
        System.out.println("cift = " + cift);

        int[] iArry = {10, 20, 30, 40, 50};
        for (int xi : iArry) {
            System.out.println(xi);

        }
        for (int xi = 0; xi < iArry.length; xi++) {
            System.out.println(xi);

        }

        String[] sArry = new String[3];
        sArry[0] = "huseyin";
        sArry[1] = "talha";
        sArry[2] = "uysal";
        System.out.println(sArry[0].length());   //kelime kac harfli onu hesapaldı. 1 den baslayarak saydı.

        System.out.println(Arrays.toString(sArry));
        System.out.println(Arrays.toString(iArry));

    }

}

