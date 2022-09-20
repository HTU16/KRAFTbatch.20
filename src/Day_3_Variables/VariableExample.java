package Day_3_Variables;

import java.util.Scanner;

public class VariableExample {

    public static void main(String[] args){
        //byte
       /* byte sayi=1;
         sayi=127;
        sayi=56;
        System.out.println(sayi);
        //short
        short sayi2=32000;
        //System.out.println(sayi2);
        sayi2=31000;
       // System.out.println(sayi2);
        short sayi3=31000;
        System.out.println(sayi2+sayi3);
        //int
        int sayi4;
        sayi4=5;
        System.out.println(sayi4);
        //long
        long sayi5=561334424311312312L;
        //float
        float a=1.2f;
        System.out.println(a);
        //double
        double b=5.4;
        System.out.println(b);
        //boolean
        boolean devam=true;
        devam=false;
        System.out.println(devam);
        boolean a=5<4;
        System.out.println(a);
        //char
        char b=65+45;
       // b='G';
        System.out.println(b);
        String a="bugün hava çok güzel";
        //System.out.println(a);
        String b="güneş parlıyor";
        //System.out.println(a+"\t"+b);
int c=5;
        System.out.println(a+c);
        int a=2;
              int  b=5;
                      int c=5;
        System.out.println(a+b+c);
        byte a=1;
        short b=3;
        int c=5;
        long d=6;
        float f=1.2f;
        double e=1.6;
        boolean g=true;
        char h='D';
        //System.out.println(5+10+"Ahmet"+20+30);
        //System.out.println(a+""+b+c+d+e+f+h);
        char ch='A'+1;
        System.out.println(ch);
short yil=2020;
byte yas=20;
String isim="Ahmet";
char a='a';
System.out.println(yil+" de "+isim+
        " "+yas+" yasinda olacak.");
double i=5;
i=10;
System.out.println(i);
        short i,j,k;
        i=5;
        j=10;
        k=i;
        i=j;
        System.out.println("i="+i+"\n"+"j="+j+"\n"+"k="+k);
float a=10.9f,b=20.3f,c;
byte d=2;
 c=b+a+d;
System.out.println(c);
int a=15, b=25, c=(a+b)/2;
System.out.println("Ortalama:"+c);
float f=10.9f;
String mesaj=" sizleri çok seviyorum";
System.out.println(f+mesaj); */
/*String metodAdi;
int a=5,b=5,c=a/b;
        System.out.println(c);
String string;
int adasdasdhsjkfhsabjfaksjdlksfjkbasjknmödnasml
 */

        Scanner scan=new Scanner(System.in);

        System.out.print("lütfen bir kelime yazın: ");
        String a=scan.nextLine();
        System.out.println("Girilen harf:"+ a);

        System.out.print("lütfen bir sayı girin: ");
        int b=scan.nextInt();
        System.out.println("Girilen sayi:"+ b);





        int sayi=31502;
        int saniye=sayi%60;
        int dakika=sayi%3600/60;
        int saat=sayi/3600;
        System.out.println("saat: "+saat+"\ndakika: "+dakika+"\nsaniye: "+saniye);

        System.out.println(sayi);




    }
}
