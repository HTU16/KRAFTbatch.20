package Day_44_OOP_Review.finalKeyword;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalArrayAndArrayList {
    public static void main(String[] args) {
        final String[] BATCH2 = {"hüseyin","uysal"};
        BATCH2[0]="halil";                             //final olmasına rağmen array atama yapabiliriz..
        System.out.println(Arrays.toString(BATCH2));

//        batch2 = new String[]{"Ali","Mehmet"};// batch2 final olduğu için referansı değiştirilemez
        System.out.println(Arrays.toString(BATCH2));

        System.out.println("---------------------");

        final ArrayList<String> NAME = new ArrayList<>();
        NAME.add("HTU");
        NAME.add("TALHA");

//        NAME = new ArrayList<>();// final olduğu için referansı değiştirilemez.




    }



}

