package bootCamp;

public class B2_Operators {
    public static void main(String[] args) {
        //Arithmetic operators
        //* / + -
        int i = 5+3/2+1-1;//6
        System.out.println("i = " + i);
        i=5+3*2+2-1;//12
        System.out.println("i = " + i);
        i=5+(int)3.1+2-1;//9
        System.out.println("i = " + i);
        System.out.println("--------");
        i= (int)3.4+(int)6.6;
        System.out.println("i = " + i);
        i= (int)(3.4+6.6);
        System.out.println("i = " + i);

        i= (int)(4.5+(double)(5/2));//6
        System.out.println("i = " + i);

        i= (int)(4.5+(double)5/2);//7
        System.out.println("i = " + i);

        int s = (int)(10.5+12.7);//23
        System.out.println("s = " + s);


        //unary operators
        //+ - ++ -- !

        int value = 0;
        value++;//postfix increment
        System.out.println("value = " + value);
        ++value;//prefix increment
        System.out.println("value = " + value++);

        int i1 = value + 0;
        System.out.println("i1 = " + i1);


        //The assignment operators
        //The equality and relational operators
        //The conditional/logical operators

        int n = 10;
//          10   +   10  -  9  + 9 =20
        n = n++ + --n - --n + n++;
        System.out.println("n = " + n);//20

//                            0
//                    1     /    22
//     20   20    21     21     22
        n = n++ - n++ / --n / ++n;//20
        System.out.println("n2 = " + n);

        //The assignment operators******************
        // =  assigment operator  atama operatörü denir..

        int t = 10;
        int j = 20;

//        j = j+t;
        System.out.println(j += t); //assigment//30
        System.out.println("j = " + j);//j=30
        System.out.println(j + t);//aritmethic işlem//40

        System.out.println(j %= t);//0 assigment j = j%t--------> j = 0
//        System.out.println(t %= j);//   10/0   aritmethic exception


        //The equality and relational operators
        // == equal to
        // != not equal to
        // < less than
        // <= les than equal
        // > greater than
        // >= greater than equal

        //All of above represent boolean condition // true ya da false ifade eder

        double d = 10;

        if (d==10){}//true
        if (d>=10){}//true
        if (d<=10){}//true
        if (d!=10){}//false
        if (d>10){}//false
        if (d<10){}//false

        int a = 4;
        int b = 7;
        boolean bl;

        //The conditional/logical operators***************************
        // & bitwise AND // her iki tarafıda control ediyor/ check both side
        // && logical AND// doesn t check both side/ short - circuit // both side should be true to return true
        bl = a<b && a>3;//----> true && true = true
        System.out.println("bl = " + bl);//true
        System.out.println(a<b && a>3);//true

        // | bitwise OR
        // || logical OR//one side is true, return true
        bl = b-a>0 || b-a%2==0;
        System.out.println("bl = " + bl);
        System.out.println("-------------------");
        // ^  bitwise exclusive OR // if both side are same it return false
        bl=b+a>10 ^ b*a>25; //true ^ true ----> false
        System.out.println("bl = " + bl);
        bl=b+a<10 ^ b*a<25;//false ^ false -----> false
        System.out.println("bl = " + bl);
        bl=b+a<10 ^ b*a>25; //false ^ true ----> true
        System.out.println("bl = " + bl);

        boolean x = true, y = true, z = false;
        //true
        x=!y;               //true  false==false
        System.out.println(z = !x && x == z);//--------true
        System.out.println("z = " + z);

        // false
        //false / /false==true
        System.out.println(z = x && x == z);//----->false
        System.out.println("z = " + z);




    }
}