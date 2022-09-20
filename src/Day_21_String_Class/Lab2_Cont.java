package Day_21_String_Class;

public class Lab2_Cont {

    //soru 9
    public static String first_2_30_2(String str1,String str2){
        String resut="";
        if(str1.length()<=str2.length()){
            firsLoop: for(int i=0; i<2; i++){
                resut+=str1+str1;
                for (int j=0; j<30; j++){
                    if(i==1) {continue firsLoop;}
                    resut+=str2;
                }
            }
        }
        return resut;
    }
    //soru 10

    public static String nokta(String str){
        String nokta="";
        if(str.length()>=5){
            return str.substring(0,5);
        }
        for(int i=0; i<5-str.length(); i++){
            nokta+=".";
        }
        return str.concat(nokta);
    }

    //soru 11
    public static boolean firstLastControl(String str){
        str=str.toLowerCase();
        return str.endsWith(str.substring(0,2));
    }


    //soru 12

    public static String findSurName(String str){
        str=str.trim();
        int i=0,count=0;
        while (i<str.length()){
            if(str.charAt(i)==' '){
                count=i;
            }
            i++;
        }
        if(count==0){
            return "Lütfen soy isminizi arada boşluk olacak şekilde giriniz";
        }
        return str.substring(count+1);
    }

    //soru 13

    public static String yinelenenKelimeleriCikar(String str){
        String result="";
        while (!str.isEmpty()){
            result+=str.substring(0,1);
            str=str.replace(str.substring(0,1),"");
        }
        return result;
    }
    //soru 14

    public static String yinelenenKelimeleriYazdir(String str){
        String result="";
        while (!str.isEmpty()){
            if(str.substring(1).contains(str.substring(0,1)) && !str.substring(0,1).equals(" ")){
                result+=str.substring(0,1);
            }
            str=str.replace(str.substring(0,1),"");

        }
        return result;
    }
    //soru 15
    public static void main(String[] args) {
        System.out.println(yinelenenKelimeleriYazdir("Derslerime cok calisiyorum"));
    }
}
