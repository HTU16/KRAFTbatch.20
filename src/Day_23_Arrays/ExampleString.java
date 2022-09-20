package Day_23_Arrays;

public class ExampleString {

    public static void main(String[] args) {
        System.out.println(task_28("Mmerhhahbae"));

    }

    public static String task_28(String str){
        str=str.replace(" ","").toLowerCase();

        String result="";

        while(str.length()!=0){
            int count=1;
            for (int j=1; j<str.length(); j++ ){
                if(str.charAt(0)==str.charAt(j)){
                    count++;
                }
            }
            result+=count+str.substring(0,1);
            str=str.replace(str.substring(0,1),"");
        }
        return result;


    }
}
