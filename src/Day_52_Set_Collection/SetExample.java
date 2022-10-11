package Day_52_Set_Collection;

import java.util.*;

public class SetExample {

    public static void main(String[] args) {

        //SET yinelen verileri kabul etmez.                  //LİST : yineleyen verileri kabul eder
        //ekleme sıralaması yapılmaz.                        // ekleme sırasını korur..
        //alfabetik olarak sıralanmaz.

     /*   Set<Integer>set=new HashSet<>();
        set.add(5);
        set.add(35);
        set.add(45);
        set.add(26);
        set.add(5);
        set.add(26);
        System.out.println(set);

      */

        Set<String>set=new HashSet<>();
        set.add("htu");
        set.add("16");
        set.add("htu");
        set.add("9");
        set.add("mathilda");
        System.out.println(set);


        String str="bidi bidi yapma kral kalibinin adami ol isini yap";              // SORU:içerisinde hangi harfler vardır?
        str=str.replaceAll(" ","");
        str=str.replaceAll(" ","");
        String[] strArray=str.split("");

        Set<String>newSet=new HashSet<>();                //hashset : kendisine kafasına  göre sıralama yapar
        for (int i = 0; i <strArray.length ; i++) {
            newSet.add(strArray[i]);
        }
        System.out.println("newSet = "+ newSet);


        List<String> newList=new ArrayList<>(Arrays.asList(strArray));
        System.out.println("newList = " + newList);

        Set<String> HashSet=new HashSet<>(Arrays.asList(strArray));
        Set<String> treeSet=new TreeSet<>(Arrays.asList(strArray));              //treeset: doğal sıralama yapar.. yineleyen verileri kabul etmez.
                                                                                 // daha hızlıdır.
        System.out.println(HashSet);
        System.out.println(treeSet);

        Integer[] arr={0,1,2,3,4,55,33,7,8,84,9,5,6,133};
        Set<Integer> hashSet=new HashSet<>(Arrays.asList(arr));
        Set<Integer> TreeSet=new TreeSet<>(Arrays.asList(arr));

        System.out.println(TreeSet);
        System.out.println(hashSet);


    }
}
