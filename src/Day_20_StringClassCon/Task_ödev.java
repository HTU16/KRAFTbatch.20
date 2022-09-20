package Day_20_StringClassCon;

import java.util.Scanner;

public class Task_ödev {
    public static void main(String[] args) {
        checkWord();
    }
    public static String checkWord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("2 kelime giriiz");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String message = "";
        if (s1.length()==s2.length()){
            if (!(s1.equalsIgnoreCase(s2))){
                System.out.println("girdiğiniz kelimelerin karakter sayısı eşit");
            }
            if (s1.equalsIgnoreCase(s2)){
                System.out.println("bu kelimeler aynı");
            }
        }else{
            checkWord();
        }
        return message;
    }
}
