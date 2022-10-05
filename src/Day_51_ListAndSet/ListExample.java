package Day_51_ListAndSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
/*
        //bir arrayi list'in içerine alan ve list
        //return eden bir metod yazınız?
        Integer arr[]={1,2,3};
        //System.out.println(addListMethod(arr));
        System.out.println(addListMethod2(arr));
        List<Integer> list1=new ArrayList<>();
        list1.add(5);
        list1.add(2);
        List<String>  list2=new LinkedList<>();
        List<Double>  list3=new Vector<>();
        List<Object> list4=new ArrayList<>();
        list4.add(list1);
        list4.add(list2);
        list4.add(list3);
        System.out.println(list4.get(0));
        List<Object> list5=new ArrayList<>();
        list5.add(list4);
        System.out.println(list5);
        System.out.println(list5.size());
        //bir array i list in içine alan ve list return eden bir metot yazınız */



        Integer[] arr1={1,2,3,4,5,4,5,4,3,6,5,3};
        List<Integer> list=new ArrayList<>(Arrays.asList(arr1));

        // System.out.println(list);
        // System.out.println(removeListMethod3(list,4));
        System.out.println(removeListMethods4(list, 5));
        System.out.println(removeListMethods4(list, 4));
        System.out.println(removeListMethods4(list, 3));
        System.out.println(removeListMethods4(list, 2));
    }
    public static List<Integer> addListMethod(int[] arr){
        List<Integer> list=new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            list.add(arr[i]);
        }
        return  list;
    }

    public static  List<Integer> addListMethod2(Integer[] arr){

        List<Integer> list=new ArrayList<>();
        list= Arrays.asList(arr);
        return list;
    }

    public static boolean removeListMethod3(List<Integer> list,Integer data) {


        return list.removeAll(Arrays.asList(new Integer[]{data}));
    }

    public static List<Integer> removeListMethods4(List<Integer> list, Integer data){
        Iterator<Integer> iter=list.iterator();
        while (iter.hasNext()){
            if(iter.next().equals(data)){
                iter.remove();
            }
        }
        return list;

    }

    //içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen
    // sonucunda bir Integer list döndüren metodu yazınız?
    // clearAllList(List<Integer>, Integer data)

    public static List<Integer> removeListMethod(List<Integer> list,Integer data) {

        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if(!list.get(i).equals(data)){
                list2.add(list.get(i));
            }
        }
        return list2;
    }

    public static List<Integer> removeListMethod2(List<Integer> list,Integer data) {


        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals(data)){
                list.remove(list.get(i));
            }
        }
        return list;
    }

    public static boolean removeListMethod7(List<Integer> list,Integer data) {


        return list.removeAll(Arrays.asList(new Integer[]{data}));
    }



    public static List<Integer> removeListMethod8(List<Integer> list,Integer data) {

        List<Integer> list2=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if(!list.get(i).equals(data)){
                list2.add(list.get(i));
            }
        }
        return list2;
    }

    public static List<Integer> removeListMethod9(List<Integer> list,Integer data) {


        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).equals(data)){
                list.remove(list.get(i));
            }
        }
        return list;
    }


}
