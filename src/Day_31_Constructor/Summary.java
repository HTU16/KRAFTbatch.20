package Day_31_Constructor;

public class Summary {

    public static void main(String[] args) {
        String x="harun mehmet ayşe soner";
        String[] arg=x.split(" ");

        for(int i=0; i<arg.length; i++){
            System.out.println((i+1)+". argümant :" + arg[i]);
        }

    }
}
