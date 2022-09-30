package Day_48_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {

    public static void main(String[] args) {


        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("kanuni");
        arrayList.add("fatih");
        arrayList.add("yavuz");
        arrayList.add("yildirim");
        //System.out.println(arrayList.get(0));       0. indexi bize getirir..  0 dan baslanir..
       // System.out.println(arrayList.size());            kaç boyutlu oldugunu gösterir...


        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("orhanbey");
        arrayList2.add("osmangazi");

//kanuni fatih yavuz yildirim

        System.out.println("ilk durum:"+arrayList.size());
        System.out.println(arrayList.remove(3));   // 3.indexi siler..
        System.out.println(arrayList.set(0,"1.murat"));  // o endexe atama yapar..
        System.out.println("son durum:"+arrayList.size());
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.indexOf("yavuz"));  // kacıncı index olduğunu getirir..

        //System.out.println(arrayList.get(0));





    }
}