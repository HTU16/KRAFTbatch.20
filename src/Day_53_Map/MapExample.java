package Day_53_Map;

import Day_33_Encapsulation.Person;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();    //key - value şeklinde saklanır..
        map.put(133,"htu");                         // put: içerisine veri eklemek için put kullanıyoruz..
        map.put(978,"htuysal");
       // System.out.println(map.get(133));   // htu ismini getirir..

        //   List<Integer> list=new ArrayList<>();
        //list.add(5);
        //list.add(10);


        // map.forEach((k,v)-> System.out.println(k+" --> "+v));

        // System.out.println(map.get(978));
        //  System.out.println(map.size());
        // System.out.println(map.toString().toUpperCase());
        // map.remove(978);     silerr..

        //  System.out.println(map.containsKey(133));   içinde  integer sayı var mı yok mu kontrol eder.. containsKey
        // System.out.println(map.containsValue("htu"));   içinde string var mı yok mu kontrol eder... containsValue


        // map.replace(978,"fenerbahce");      //içerisindekileri değiştirmek için kullanılır..

        //  System.out.println(map);

        // System.out.println(map.keySet());        // sadece key olanları integer olanları secer ve yazdırır..
        // System.out.println(map.values());        // sadece value olanları string olanları secer ve yazdırır..

        Map<Integer, String> fenA = new LinkedHashMap<>();
        fenA.put(133, "Htu");
        fenA.put(429, "hasan");
        fenA.put(671, "harunhocaciğim");
        fenA.put(978, "htuysal");

        for (Integer num: map.keySet()) {
           // System.out.println(map.get(num));
        }

        Map<Integer, String> fenB = new LinkedHashMap<>();
        fenB.put(10, "alex");
        fenB.put(7, "ronaldo");
        fenB.put(9, "torres");
        fenB.put(5, "zidane");


        List<Map<Integer, String>> okul = new ArrayList<>();
        okul.add(fenA);
        okul.add(fenB);

          System.out.println(okul.size());
         System.out.println(okul.toString());

         System.out.println(fenB.get(7));
         System.out.println(okul.get(1).get(5));

      /*  for (Map<Integer,String> sinif:okul){           1.yol
            for(Integer key:sinif.keySet()){               foreach olarak yapılmalı
                System.out.println(sinif.get(key));
            }
        }

       */


        for (int i = 0; i < okul.size(); i++) {           //2.yol
            for (Integer key : okul.get(i).keySet()) {
               System.out.println(okul.get(i).get(key));
            }


        }



    }
}
