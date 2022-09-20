package Day_5_TypeCasting;

public class Tasks {
    public static void main(String[] args) {


//         1- Haydi! I am ready to be a java pro ☺ ifadesini konsola
//          yazdırın.

        System.out.println("I am ready to be a java pro  :)");


//         2- 1 den 5 kadar olan sayıları tek satır kod ile konsolda alt
//                alta yazdırın.

        System.out.println("\n1\n2\n3\n4\n5");

//        3- "hello world" yazdırın
        System.out.println("\"hello world\"");

//        4- 21'' monitor yazdırın
        System.out.println("21\" monitor");

//        5- 'eve geç kalma' dedi yazdırın
        System.out.println("'eve geç kalma' dedi");

//        6-   resimdeki J harfinin Konsolda çıktısını alın

        System.out.println("************");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("**    **");
        System.out.println("**    **");
        System.out.println(" **  **");
        System.out.println("  ****");


//        7- Ahmet
//           GÜL
//           30 yaşımdayım
//           İstanbul da yasıyorum

//        şeklindeki pankartı tek satır kodla konsola yazdırın

        System.out.println("Ahmet\nGÜL\n30 yaşımdayım\nİstanbul da yaşıyorum");

//        8- 3 degişken oluşturun(declare) int, String ve char tipinde olsun ve
//        farklı değerler atayarak(assign), konsolda aşağıda ki gibi yazdırın.
//        Example:"35,Ahmet,M"veya "30,Ayşe,W"

        int i;
        String str;
        char ch;

        i = 42;
        str = "Salih";
        ch = 'M';

        System.out.println("\"" + i + "," + str + "," + ch + "\"");


//       9-  bro1 ve bro2 ikiz kardeşlerin yaşlarını tek satırda declare edin ve yaşlarını
//        assign edin.

        int bro1, bro2;
        bro1 = 12;
        bro2 = bro1;

        System.out.println("bro1 ve bro2 kardeşler " + bro2 + " yaşındadır");

//        10- LPG, motorin, gasoline yakıt tiplerini tek satırda string türünde
//        tanımlayın(declare).

        String LPG,motorin,gasoline;



//        11- Fatih Sultan Mehmet 1453 yılında İstanbul u fethetmiştir.
//        İfadesini bir değişkene atayın ve yıl başka bir değişken ile
//        kontrol edilebilsin.
        System.out.println("-------------------------------------");

        int a = 1543;
        int b = 1435;
        int c = 1453;
        int d = 1455;


        System.out.println("fatih Sultan Mehmet "+ d +" yılında İstanblu fethetmiştir");

        int dogrucevap = 1453;

        boolean cevap = d==dogrucevap;
        System.out.println(cevap);

//        12- Bir program yazın. Yarıçapı (radius) x olan çemberin alanını
//        versin. Yarıçap(radius) ve alan(area) olmak üzere 2 değişken
//        oluşturun. Reminder: Pi=3.14

        double radius;
        double PI = 3.14;

        radius = 10;
        double alan = PI*radius*radius;

        System.out.println(alan);
        System.out.println("yarıçapı "+radius+" cm olan çemberin alanı "+alan+"cm²");

        // resimdeki şekilleri konsola yazdırın

        System.out.println("*******");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*******");



        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.println("*********");

        boolean b1,boolean_b2;        int in = 54;        System.out.println();  String str2;


    }
}
