package Day_24_ArraysCont;

public class Tasks {

    public static void main(String[] args) {

        int[] iArr = {1,2,3,8,5,6,7,8,-9,-9};
        int[] iArr2 = {1,2,3,4,5};
        int[] sayılar = {1000,3348374,1,5};
        int[] sayılar2 = {100,33,48,37,1,5};
        String str = "merhaba java insanları bugün nasılsınız";
        String str2 = "kayısı, armut, üzüm, çilek, nar";
        String str3 = "elma, armut, üzüm, çilek, nar";
        String str4 = "merhaba java insanları bugün nasılsınız";

//        System.out.println(Arrays.toString(stringToArray(str)));
//        System.out.println(Arrays.toString(stringToArray2(str2)));
//        System.out.println(Arrays.toString(stringToArray3(str3)));
//        System.out.println(Arrays.toString(stringToArray4(str4)));
//        System.out.println(checkLength(iArr));
//        System.out.println(find5(iArr));
//        System.out.println(find5(sayılar));
//        System.out.println(compareFirstElements(iArr, iArr2));
//
//        System.out.println(Arrays.toString(   newArrWithFirstElements(iArr, iArr2)   ));
//        System.out.println(sumArryElemens(iArr2));
//        System.out.println(Arrays.toString(concatArry(iArr, iArr2)));


    }
    //    Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.
    public static boolean checkLength(int[] iArr){
        return iArr.length>5;
    }
    //    Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.
    public static boolean find5(int[] arry){
        int param = 5;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]==param){
                return true;
            }
        }
        return false;
    }
    //    Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.
    public static boolean compareFirstElements(int[] iarr1, int[] iarr2){
        return iarr1[0]==iarr2[0];
    }
    //    2 array kabul eden bir method yazın ve arraylerin ilk elemanları ile yeni bir array döndürsün.
    public static int[] newArrWithFirstElements(int[] iArr1,int[] iArr2){
        int[] newArr = new int[2];
//            int[] newArr = {iArr1[1],iArr2[3]};
        newArr[0]=iArr1[0];
        newArr[1]=iArr2[0];
        return newArr;
    }
    //    Int array in elemanlarının toplamını veren bir method yazın
    public static int sumArryElemens(int[] iArr){
        int sum = 0;
        for (int i = 0; i < iArr.length; i++) {
            sum+=iArr[i];
            sum = sum+iArr[i];
        }
        return sum;
    }
    //    Verilen 2 arrayi birleştirip array döndüren bir method yazın.
    //7         //5
    public static int[] concatArry(int[] Arr1, int[] Arr2){
        int[] newArry = new int[Arr1.length+Arr2.length];
        for (int i = 0;
             i < newArry.length;
             i++) {
            if (i<Arr1.length){
                newArry[i]=Arr1[i];
            }else{
                newArry[i]=Arr2[i-Arr1.length];
            }
        }
        return newArry;
    }



}
