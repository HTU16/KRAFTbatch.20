package Day_30_ArrayList;

import java.util.ArrayList;

public class ArrayList_ {

    public static void main(String[] args) {

        //size(),add(),set(),isEmty()

        ArrayList<String> names = new ArrayList<>();
               names.add("FATIH");
               names.add("YAVUZ");
               names.add("YILDIRIM");
               names.add("KANUNI");

               System.out.println("names.size() =" + names.size());
               System.out.println("names.toString() = " + names.toString());
               System.out.println("names = " + names);

              names.set(2,"SOKULLU");         //SET : SİLER VE YERİNE YENİ  BİR ŞEY EKLER.. KAÇINCI SIRAYA YAZARSAN ORAYA GİRER .************************
               System.out.println("names = " + names);

               names.add(2,"YILDIRIM");  // ADD: EKLEME YAPAR..****************************************************************************
               System.out.println("names = " + names);

               System.out.println("names.isEmpty() = " + names.isEmpty());      //BOŞ OLUP OLMADIĞINI KONTROL EDER.*************************************

              names.clear();                   //İÇERİĞİ SİLMEYE YARAR.*********************************************************************************
               System.out.println("names.isEmpty() = " + names.isEmpty());

              boolean b=names.size()==0;
               System.out.println(names.size()==0);
               System.out.println("b = " + b);

                  }
}
