package Day_15_MethodsCont;

public class MethodOverloding {

    public static void main(String[] args) {



//        calculateArea(kenar(5.5),4);
        //calculateArea(3,2);

//        concat(5,"Alparslan",false);
        concat("Alparslan",5);


    }
    public static void calculateArea(int a,int b){
        System.out.println(a * b);
    }
    public static void calculateArea(int b){
        int r;
        double PI = 3.14;
        r=b;
        System.out.println(PI*r*r);

    }
    public static int kenar(double i){
        return (int)5;
    }


    public static void concat(int i,String str,boolean bl){

        if (bl){
            System.out.println(str + i);
        }else{
            concat(str,i); //buraya bir method cagıracagım
        }

    }
    public static void concat(String kelime,int c){
        for (int t = 0; t < c; t++) {
            System.out.println(kelime);
        }
    }


}
