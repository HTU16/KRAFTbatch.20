package Day_29_WrapperCalss_WarArgs;

public class VarArgs {

    public static void main(String[] args) {

        sum(5,10);
        sum(5,10,15);
        sum(5,10,15,20,25,30);
        sum(5,10,15,20,25,30,100,102);

        concat("ja","va");
        concat("ja","va"," ","insanları");

        System.out.println(concat1("JAVA", "PYTHON", "BHP"));

    }
    public static void sum(int... sayılar){
        //variable arguments
//        System.out.println(sayılar[0]);
//        System.out.println(sayılar.length);
        if (sayılar.length==2){
            System.out.println(sayılar[0] * sayılar[1]);
        }
        int sum = 0;
        for (int i : sayılar){
            sum+=i;
        }
        System.out.println("Girilen "+sayılar.length+ " nın toplamı : "+sum);
    }
    public static void concat(String... strs){
        String empty = "";
        for (String s : strs){
            empty+=s;
        }
        System.out.println(empty);
    }
    public static  String concat1(String... strs){
        String empty = "";
        for (int i = 0; i < strs.length; i++) {
            empty+=strs[i].charAt(0);
        }

        return empty;
    }

}
