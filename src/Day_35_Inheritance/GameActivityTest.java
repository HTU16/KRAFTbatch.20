package Day_35_Inheritance;

import java.util.Scanner;

public class GameActivityTest {

    public static void main(String[] args) {
//        kullanıcıdan kac hedefle karsılastıgı ve kacını vurdugunu sorun verdiği cevaba gore
//        rank ini tespit edin
        Scanner sc = new Scanner(System.in);
        System.out.println("kaç hedefle karşılaştın");
        int düşman = sc.nextInt();
        System.out.println("kaç hedefi vurdun");
        int isabet = sc.nextInt();
        Challenge challenge = new Challenge(düşman,isabet);
        System.out.println(challenge.getScore());
        System.out.println(challenge.getRank());
    }
}
