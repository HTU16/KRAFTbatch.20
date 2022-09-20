package Day_4_Review;

public class Data_Types_review {
    public static void main(String[] args) {

        byte b;
        short s;
        int i;
        long l;

        float f;
        double d;

        char c;
        boolean bl;

//        byte
        b = 127;
        System.out.println(b);
        b = -128;
        System.out.println(b);
//        short
        s=32767;

//      int
        i = 2147483647;
//      long
        l =2147483648L;
        System.out.println("l = " + l);


//       float  ve double
//       genel olarak ornegin banka hesapları gibi degerleri temsil ederken kullanıyoruz. expressing currency
//       float 4 byte | double 8 byte
        f = 1.12345671F;
        d = 1.12345;
        System.out.println("f = " + f);
        System.out.println("d ="+d);
        d = f;
        f = (float)d;
        System.out.println("f = " +f);


    }

}
