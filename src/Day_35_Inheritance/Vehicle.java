package Day_35_Inheritance;

public class Vehicle {

    String type;
    double price;
    String color;

    public void sellPriceWithTax(double price){
        price+=price*0.10;
        System.out.println(price);
    }
}
