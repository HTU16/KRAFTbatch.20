package Day_12_NestedAndWhileLoops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
/*
        int i=5;
        while(i<10){  //for(int i=0; i<5; i++){}
            System.out.println(i+" harun");
            i++;
        }
        //Örnek 1
        int i=0;
        while(i<20){
            System.out.println("merhaba dünya");
            i+=2;
        }
        //Örnek 2
        int i=0;
        while(i<100){
            System.out.print(i+" ");
            i++;
        }
        //Örnek 3
        int i=13;
        while(i<=100){
            System.out.print(i+" ");
            i++;
        }
//Örnek 4
        int i=100;
        while(i>0){
            System.out.print(i+" ");
            i--;
        }
//Örnek 5
        int i=0;
        while (i<=100){
            System.out.println(i);
            i+=2;
        }
        int j=0;
        while (j<=100){
            if(j%2==0){
            System.out.print(j+" "); }
            j++;
        }
//Örnek 6
        int i=0;
        while (i<=100){
            if(i%2==1)
            System.out.print(i+" ");
            i++;
        }
//Örnek 7
        int i=10;
        while(i<=1000){
            System.out.print(i+" ");
            i+=10;
        }
        //Örnek 8
        int i=1,sonuc=1;
        while (i<=8){
            sonuc*=i;
            i++;
        }
        System.out.println("sonuc = " + sonuc);
*/
//Örnek 9

       /* int i=3;
        while(i<20){
           int sonuc=i*i*i;
            System.out.println(i+"küpü:"+sonuc);
           i+=3;
*/


        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.print("lütfen kelime giriniz: ");
            String kelime= scan.next();
            if(kelime.equals("x")){
                break;
            }
            System.out.print("kaç defa yazdırmak istersiniz: ");
            int repeat=scan.nextInt();
            for (int i=0; i<repeat; i++){
                System.out.println(kelime);
            }

        }






    }
}
