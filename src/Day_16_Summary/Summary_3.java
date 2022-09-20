package Day_16_Summary;

public class Summary_3 {

    public static void main(String[] args) {

        firstLoop:  for(int i=1; i<=5  ;i++){
            System.out.println(i+" dış döngü");
            secondLoop:  for(int j=1; j<=3; j++){
                System.out.println(j+" orta döngü");
                thirtLoop: for(int k=1; k<=2; k++){
                    System.out.println(k+" en iç dögü");
                    if(k==1){
                        continue firstLoop;
                    }
                    System.out.println("merhaba");
                }
            }
        }

    }
}
