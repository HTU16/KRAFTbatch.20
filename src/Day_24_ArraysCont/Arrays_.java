package Day_24_ArraysCont;

import java.util.Arrays;

public class Arrays_ {

    public static void main(String[] args) {

//        int[] iArry = new int[5];
//
//        iArry[0]=10;
//        iArry[1]=20;
//        iArry[2]=30;
//        iArry[3]=40;
//        iArry[4]=50;
//
//        for (int i : iArry){
//            System.out.println(i+5);
//        }
//        for (int i = 0; i < iArry.length; i++) {
//            System.out.println(iArry[i]);
//        }
//
//        String[] sArry = new String[3];
//        sArry[0]="muhammed";
//        sArry[1]="Alparslan";
//        sArry[2]="beytulah";
//
//        System.out.println(sArry[0].length());
//
//        System.out.println(sArry[0]+"15");
//
//        System.out.println(sArry);
//
//        System.out.println(Arrays.toString(sArry));
//        System.out.println(Arrays.toString(iArry));

//        String str = "Merhaba java insanları";
//
//        String[] arry = str.split(" ");
//
//        arry[1]="yurdum";
//
//        System.out.println(arry[0]);
//        System.out.println(arry[1]);
//
//        System.out.println(Arrays.toString(arry));
//
//        String[] arry2 = str.split("java");
//
//        System.out.println(arry2.length);
//
//        System.out.println(Arrays.toString(arry2));
//
//        int[] arrys = {1,2,3,4,5,6,7,8,9};
//
//        int[] ints = Arrays.copyOfRange(arrys, 2, 6);
//
//        System.out.println(Arrays.toString(ints));
//        System.out.println(arrys.length);

        int[] arrys2 = {9,7,4,5,8,7,1,11};
        Arrays.sort(arrys2);
        System.out.println(Arrays.toString(arrys2));

        Arrays.fill(arrys2,10);
        System.out.println(Arrays.toString(arrys2));
        Arrays.fill(arrys2,2,5,5);
        System.out.println(Arrays.toString(arrys2));
    }
}
