package Day_54_CollectionCont;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetStudy {
    public static void main(String[] args) {

        NavigableSet<Integer> pumaSet =new TreeSet<>();        //her zaman küçükten büyüğe gidiyor..
        pumaSet.add(2);                                        // tekrar eden sayıları tekrar yazmaz..1 kez yazar olayı kapatır..
        pumaSet.add(30);
        pumaSet.add(20);
        pumaSet.add(45);
        pumaSet.add(2);
        pumaSet.add(35);
        pumaSet.add(40);
        pumaSet.add(10);
        System.out.println(pumaSet);

        //lower()    yazılan değerin bi küçüğünü verir.. ya da yazılan sayılar arasındaki bi tık küçük olanı verir
        System.out.println("pumaSet.lower(35) = " + pumaSet.lower(35));

        //higher()  yazılan değerin bi büyüğünü verir.. ya da yazılan sayılar arasındaki bi tık büyük olanı verir
        System.out.println("pumaSet.higher(35) = " + pumaSet.higher(35));

        //floor()    yazılan sayılar arasındaki alt değeri verir...
        System.out.println("pumaSet.floor(35) = " + pumaSet.floor(35));

        //ceiling()  yazılan sayılar arasındaki üst değeri verir.
        System.out.println("pumaSet.ceiling(35) = " + pumaSet.ceiling(35));

        //pollFirst   sıralamadaki ilk sayıyı yazdırır..sonra tekrar yazdırınca o sayıyı siler..
        System.out.println("pumaSet.pollFirst() = " + pumaSet.pollFirst());  // 2
        System.out.println(pumaSet);   // [10, 20, 30, 35, 40, 45]

        //pollLast   sıralamadaki son sayıyı yazdırır..sonra tekrar yazdırınca o sayıyı siler..
        System.out.println("pumaSet.pollLast() = " + pumaSet.pollLast());   //45
        System.out.println(pumaSet);   //[10, 20, 30, 35, 40,]

        //descendingSet()   //sondakiyle baştakini yer değiştirir.. tersten yazdırır..
        pumaSet.addAll(Arrays.asList(30,60,70,80));
        System.out.println(pumaSet);        // [10, 20, 30, 35, 40, 60, 70, 80]
        System.out.println(pumaSet.descendingSet());  // [80, 70, 60, 40, 35, 30, 20, 10]

        //subSet() [10, 20, 30, 35, 40, 60, 70, 80]
        System.out.println("pumaSet.subSet(30,true,70,false) = " + pumaSet.subSet(30, true, 70, false));
          //  aralık olarak yazdırır. [30, 35, 40, 60] şeklinde yazdırır. dahil edip etmemeyi true false olarak biz belirleriz

        //headSet()  yazdığımız sayıya kadar olanları yazdırır. kapsayıp kapsamadığını true false olarak biz belirleriz..
        System.out.println("pumaSet.headSet(40,false) = " + pumaSet.headSet(40, false));

        //tailSet()   yazdığımız sayıdan sonraki değerleri yazdırır. yine kendimiz belirleriz..
        System.out.println("pumaSet.tailSet(40,false) = " + pumaSet.tailSet(40, false));

        Iterator<Integer> iterator= pumaSet.iterator();
        while (iterator.hasNext()){
            Integer next=iterator.next();
            if (next>39){
                iterator.remove();
            }
            System.out.println("pumaSet = " + pumaSet);   //[10, 20, 30, 35]

        }
    }
}
