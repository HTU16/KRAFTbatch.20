package Day_54_CollectionCont;

import java.util.*;

public class SortedSetStudy {
    public static void main(String[] args) {

        SortedSet<Integer>soldurdumcicegimiyasatamadim=new TreeSet<>();
      //  Set<Integer> soldurdumcicegimiyasatamadim=new TreeSet<>();
      //  NavigableSet<Integer>soldurdumcicegimiyasatamadim=new TreeSet<>();

        soldurdumcicegimiyasatamadim.add(2);
        soldurdumcicegimiyasatamadim.add(2);
        soldurdumcicegimiyasatamadim.add(10);
        soldurdumcicegimiyasatamadim.add(10);
        soldurdumcicegimiyasatamadim.add(10);
        System.out.println("soldurdumcicegimiyasatamadim = " + soldurdumcicegimiyasatamadim);  //2,10

        System.out.println("soldurdumcicegimiyasatamadim.first() = " + soldurdumcicegimiyasatamadim.first());  //2
        System.out.println("soldurdumcicegimiyasatamadim.last() = " + soldurdumcicegimiyasatamadim.last());  //10

        soldurdumcicegimiyasatamadim.addAll(Arrays.asList(25,35,45));
        System.out.println(soldurdumcicegimiyasatamadim);   // [2, 10, 25, 35, 45]
      //  System.out.println(soldurdumcicegimiyasatamadim.add(null)); // null değer almaz yoksa hata verir..

     //subSet     [2,10,25,35,45]              //baştakini alır sondakini almaz.. aralığı yazdırır..
        System.out.println("soldurdumcicegimiyasatamadim.subSet(25,45) = " + soldurdumcicegimiyasatamadim.subSet(25, 45));

        //headSet()      [2, 10, 25]   35 e kadar yazdırıyor yani yazdığın sayıya kadar olanları.
        System.out.println("soldurdumcicegimiyasatamadim.headSet(35) = " + soldurdumcicegimiyasatamadim.headSet(35));

        //tailSet()   [35, 45]    35 den sonrakileri yazdırıyor yani yazdığın sayıdan sonra olanları.
        System.out.println("soldurdumcicegimiyasatamadim.tailSet(35) = " + soldurdumcicegimiyasatamadim.tailSet(35));

     //HEPSİ KÜÇÜKTEN BÜYÜĞE DOĞRU YAZDIRIR...


    }
}
