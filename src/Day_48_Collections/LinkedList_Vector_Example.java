package Day_48_Collections;

import java.util.Vector;

public class LinkedList_Vector_Example {

    public static void main(String[] args) {
        /*
        ArrayList<String> arrayList=new ArrayList<>();
        LinkedList<String> linkedList=new LinkedList<>();        addlast addfirst seklinde metotları var..
        linkedList.add("kanuni");                                 son elemanı getirir --- ilk elemanı getirir...
        linkedList.add("fatih");
        linkedList.add("yavuz");
        linkedList.add("htu");

        System.out.println(linkedList.size());
        System.out.println(linkedList.pop());                      remove gibidir silmeye yarar...
        System.out.println(linkedList.size());                     yine 0 dan baslanır...
        System.out.println(linkedList.get(2)); */

        Vector<String> vector=new Vector<>();           //senkronize işlemlerde kullanılır..  therad--safe--locks
        //  System.out.println(vector.size());
        System.out.println(vector.capacity());         //10 verir..
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("Alpaslan");
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("Alpaslan");
        vector.add("ahmet");
        vector.add("mehmet");
        vector.add("ayşe");
        vector.add("Alpaslan");
        System.out.println(vector.size());
        System.out.println(vector.capacity());   // 20 verir..


    }
}