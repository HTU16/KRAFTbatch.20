package Day_16_Summary;

import java.util.Scanner;

public class Summary_1 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayi: ");
        int x= scan.nextInt();
        System.out.print("2.sayi: ");
        int y= scan.nextInt();
        System.out.print("3.sayi: ");
        int z= scan.nextInt();

        int t=(x+y+z)/3;
        if(t>70&& t<81){
            System.out.println("iyi");
        }
        else if(t>80 && t<91){
            System.out.println("fena değil");
        }
        else if(t>90){
            System.out.println("çok iyi");
        }
        else{
            System.out.println("çok kötü");
        }

    }
}
