package Day_5_TypeCasting;

public class TypeCasting {

        public static void main(String[] args) {

            //TYpe casting
            //Widening

            int myAge = 8;
            double myDouble = myAge;

            System.out.println(myDouble);

            int version = 2;
            double ver = version;

            long uzun = 3;
            ver = uzun;

            float kayan = uzun;

            System.out.println(ver);
            System.out.println(kayan);

            System.out.println("-----------------------");


            //Narrowing
            double d = 9.78;
            int i = (int) d;

            System.out.println(i);

            //2.3  , 4.1  , 5 sayılarını uygun type lare atayın sayıların toplamını tamsayı olarak yazdırın.

            double num1 = 2.3;
            double num2 = 4.1;
            int num3 = 5;

            int toplam = (int) num1 + (int) num2 + num3;

            System.out.println(toplam);

            //2.3 , 4.4  , 5.3  , 5 sayılarını uygun type lare atayın
            // sayıların toplamını tamsayı olarak yazdırın.

            double num4 = 2.3;
            double num5 = 4.4;
            double num6 = 5.3;
            int num7 = 5;
            //2   +    4     +    5   +  5 = 16
            int sum = (int) num4 + (int) num5 + (int) num6 + num7;


            //    (2.3+4.4 +5.3)
//                               12     + 5  = 17
            int sum2 = (int) (num4 + num5 + num6) + num7;


            System.out.println("sum = " + sum);
            System.out.println("sum2 = " + sum2);




        }
}
