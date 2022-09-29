package Day_46_Exception;

public class ThrowClause {

    public static void main(String[] args) {

        int x=0;
        try {
            if(x==0){
                throw  new ArithmeticException("aritmetik exception hatası");
        }
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("program sonlandı");
    }

}
