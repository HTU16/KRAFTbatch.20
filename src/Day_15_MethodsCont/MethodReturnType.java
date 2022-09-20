package Day_15_MethodsCont;

public class MethodReturnType {

    public static void main(String[] args) {

//        System.out.println(lastDijitCheck(124,444));
//        boolean bl = lastDijitCheck(235,55);
//        System.out.println("bl = " + bl);
//        System.out.println(lastDijitCheck(23, 24));
//        System.out.println(primeNumber(49));
//        System.out.println(convertToPozitif(-5));


        System.out.println(gecmaNotu(20, 56, 57));
        System.out.println(gecmaNotu(90, 76, 87));

    }
    public static boolean lastDijitCheck(int sayı1,int sayı2){

        if (sayı1%10==sayı2%10){
            return true;
        }

        return false;
    }

    public static boolean primeNumber(int num){

        if (num==0 || num==1){
            return false;
        }else{                  //8
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static int convertToPozitif(int a){

//        return a>0 ? a : -a;
        return a<0 ? -a : a;

//        return Math.abs(a);
    }

    public static char gecmaNotu(double not1,double not2,double not3){
        double ortalama = (not1+not2+not3)/3;
        char not = 'X';

        if(ortalama>=76 && ortalama<=100){
            not = 'A';
//            return 'A';
        }else if (ortalama>=51 && ortalama<=75){
            not = 'B';
//            return 'B';
        }else if (ortalama>=0 && ortalama<=50){
            not = 'C';
//            return 'C';
        }

        return not;
    }
}
