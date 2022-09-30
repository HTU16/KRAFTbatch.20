package Day_49_CollectionCont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterating {
    public static void main(String[] args) {
        Collection<Integer> cll = new ArrayList<>(Arrays.asList(3,5,7,10,20));

        System.out.println("cll = " + cll);

//        for (Integer each : cll){
//            System.out.println(each);
//            if (each>5){
//                cll.remove(each);
//            }
//        }we can not use remove or update item

        Iterator<Integer> myIter = cll.iterator();   //  iterator inteface dir
/*
        //next()

        System.out.println("next() = " + myIter.next());
//        System.out.println("next() = " + myIter.next());

        //remove()

        myIter.remove();//[5, 7, 10, 20]  1. indexteki 3 ü attı
        myIter.remove();//hata verir. remove() dan once next() yapılmalı
        System.out.println("myIter.next() = " + myIter.next());
        myIter.remove();
        System.out.println("cll = " + cll);

 */
//[3, 5, 7, 10, 20]
        System.out.println("myIter.hasNext() = " + myIter.hasNext());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());

        while (myIter.hasNext()){
            Integer next = myIter.next();
            System.out.println(next);
            if (next>5){
                myIter.remove();
            }
        }
        System.out.println("cll = " + cll);    //3 ve 5 verir..
        System.out.println("myIter.hasNext() = " + myIter.hasNext());  //false olur..


//        System.out.println("myIter.hasNext() = " + myIter.hasNext());

        try {                                             // bunu yapmasaydım exception hatası alacaktım...
            System.out.println("myIter.next() = " + myIter.next());
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("bıdı bıdı yapma kral akıllı ol işini yap");
        }



    }
}