package Day_29_WrapperCalss_WarArgs;

public class WrapperClass_task3 {

    public static void main(String[] args) {

        String str = "A number is a mathematical object used to count, " +
                "measure, and label. The original examples are the natural " +
                "numbers 1, 2, 3, 5, and so forth";                      // sayıların toplamını aldık...
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.charAt(i) + "");
            }
        }
        System.out.println("sum = " + sum);
    }
}
