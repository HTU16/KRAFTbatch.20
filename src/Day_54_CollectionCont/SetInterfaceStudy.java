package Day_54_CollectionCont;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterfaceStudy {
    public static void main(String[] args) {

        Set<Long> alexSet=new HashSet<>();                   //nonprimitive-wpapper class oldugu için hep büyük harf ile..
        System.out.println(alexSet.add(7l)); // true
        System.out.println(alexSet.add(7l));// false
        alexSet.add(7l);  //false
   alexSet.add(7l);   //false
   alexSet.add(70l);   //true
   alexSet.add(70l);  // false

        System.out.println("alexSet = " + alexSet);         //sadece 7 ve 70 i yazdırır birer kez..

        for (long shakira: alexSet) {
            System.out.println("-->"+shakira);     //  7 yi  ve 70 i alt alta yazdırır..
        }

        alexSet.addAll(Arrays.asList(2l,3l,4l,4l,4l));
        System.out.println("alexSet = " + alexSet);     // [2, 3, 4, 70, 7] yazdırır..

        System.out.println(alexSet.add(null));  // set içinde null yok o yüzden true döndürür..
        System.out.println(alexSet.add(null));  // null var false döndürür.

        System.out.println(alexSet);   // [null, 2, 3, 4, 70, 7] yazdırır..

        if (!alexSet.add(8l)){
            //item varsa false döndürür  ! olduğu için  true dönüyor if çalışır
            alexSet.remove(8l);
        }
        System.out.println(alexSet);
    }
}
