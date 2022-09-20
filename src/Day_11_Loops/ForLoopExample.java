package Day_11_Loops;

import java.util.Scanner;

public class ForLoopExample {

    public static void main(String[] args) {

   /* for(int x=0;     x<3;     x++ ){
    System.out.println(x);

    //<1-2-3-4-5....1700> url

    }
        for(char i='A'; i<='Z'; i++){
            System.out.print(i+" ");
        }
        int i=1;
      for(; i<=10; i++){
          System.out.println("9x"+i+"="+(i*9));
      }
System.out.println(i);

       Scanner scan=new Scanner(System.in);
        String sifre="harun";
        System.out.println("----Şifreyi bulmak için 10 hakkın var------ ");
   for(int i=0; i<10; i++){
        System.out.print("lütfen bir kelime giriniz: ");
        String kullaniciKelimesi= scan.nextLine();
        if (kullaniciKelimesi.equals(sifre)){
        System.out.println("tebrikler kelimeyi buldunuz");
        break;
    }else{
        System.out.println("kelimeyi bulamadınız");
    */


        Scanner scan = new Scanner(System.in);
        int sifre = 1211;
        int i = 0;
        for (; i < 3; i++) {

            System.out.print("Sifre: ");
            int kullaniciSifre = scan.nextInt();

            if (kullaniciSifre == sifre) {
                System.out.println("sifre doğru");
                break;
            } else {
                System.out.println("sifre hatalı");
            }

        }
        System.out.println("i = " + i);
        if (i == 3) {
            System.out.println("şifreniz bloke olmuştur");
        }


    }
}

