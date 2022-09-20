package Day_14_Method;

public class MethodDays2 {

    public static void main(String[] args) {

//        yasHesapla(1980);
//        kuvvet(2,3);  //9              //sorudan gelen bir sey ilk arguman kuvvet olması isteniyor
//        kuvvet(3,2);   //8

//        sumOf(5,4);

//        calculater(5,6,"*");

        sum(5,4); //9
        System.out.println(sum(5, 4));
        int sonuc = sum(5, 4);
        calculater(sonuc,6,"+");


    }
    public static void yasHesapla(int born){
        System.out.println(2022 - born);
    }
    public static void kuvvet(int num1,int num2){
        double pow = Math.pow(num2, num1);
        System.out.println((int)pow);
        //System.out.println(Math.pow(num2, num1));
    }

    public static void sumOf(int a ,int b){
        System.out.println(a + " +" + b + " =" + (a + b));

    }

    public static void calculater(double num1,double num2,String str){
        if (str.equals("+")){
            System.out.println(num1 + num2);
        }else if(str.equals("-")){
            System.out.println(num1 - num2);
        }else if (str.equals("*")){
            System.out.println(num1 * num2);
        }else if (str.equals("/")){
            System.out.println(num1 / num2);
        }else{
            System.out.println("Matematiksel operator gecerli değil");
        }
    }


    public static int sum(int a,int b){

        return a+b;
    }
}
