package Day_16_Summary;

public class Summary_2 {

    public static void main(String[] args) {

        int a=3;
        switch (a){
            case 5:
                System.out.println("a 5 dir");
                break;
            case 6:System.out.println("a 6 dir");
                break;
            default:System.out.println("a 5 ve 6 farklıdır");
        }


        if(a==5){
            System.out.println("a 5 dir");
        }
        else if(a==6){
            System.out.println("a 6 dir");
        }
        else{
            System.out.println("a 5 ve 6 farklıdır");
        }

    }
}

