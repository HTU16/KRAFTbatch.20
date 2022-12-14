package Day_49_CollectionCont;

//import java.util.*;   tek seferle hepsini sağlatır..
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
        List<Integer> lst
                = new LinkedList<>(Arrays.asList(10,70,50,40,100));
        System.out.println(lst);

        //accessing items

        System.out.println("get(0) = " + lst.get(0));             // ilk indexi bize getirir. 0 dan başlar..

        //adding items with index

        lst.add(0,11);//[11, 10, 70, 50, 40, 100]
        System.out.println(lst);
        System.out.println("get(0) = " + lst.get(0));

        //updating item

        lst.set(0,10);//[10, 10, 70, 50, 40, 100]        // set ile 0. indexe atama yaptık..
        System.out.println(lst);

        //getting index of item              get ile indexleri getirdik..

        System.out.println("indexOf(10) = " + lst.indexOf(10));
        System.out.println("indexOf(10) = " + lst.indexOf(40));
        System.out.println("indexOf(1000) = " + lst.indexOf(1000));  //-1         olmayan sey varsa -1 olur..

        //remove with index

        lst.remove(0);//[10, 70, 50, 40, 100]
        System.out.println("lst = " + lst);

        //add all

        lst.addAll(Arrays.asList(60,80));//[10, 70, 50, 40, 100, 60, 80]
        System.out.println("lst = " + lst);
        lst.addAll(2,Arrays.asList(30,90));//[10, 70, 30, 90, 50, 40, 100, 60, 80]
        System.out.println("lst = " + lst);

        //sort           sıralama yapar..

//        lst.sort(null);
        System.out.println("lst = " + lst);//[10, 30, 40, 50, 60, 70, 80, 90, 100]

//        lst.sort(Comparator.naturalOrder());
        System.out.println("lst = " + lst);

        lst.sort(Comparator.reverseOrder());//[100, 90, 80, 70, 60, 50, 40, 30, 10]       //tersten sıralama yapar..
        System.out.println("lst = " + lst);

        //sublist(from,to)        kacıncı index arasını yazdırmak için kullanılır..

        System.out.println("subList(2,6) = " + lst.subList(2, 6));
        List<Integer> subList3_8 = lst.subList(3, 8);//[70, 60, 50, 40, 30]
        System.out.println("subList3_8 = " + subList3_8);
        System.out.println("lst = " + lst);
        subList3_8.set(1,555);// lst = [100, 90, 80, 70, 555, 50, 40, 30, 10]
        System.out.println("subList3_8 = " + subList3_8);
        System.out.println("lst = " + lst);
        lst.set(5,556);
        System.out.println("lst = " + lst);
        System.out.println("subList3_8 = " + subList3_8);

        //list iterator.. coming soon ..


    }
}