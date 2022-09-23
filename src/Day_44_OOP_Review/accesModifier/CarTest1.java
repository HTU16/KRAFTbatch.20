package Day_44_OOP_Review.accesModifier;

import Day_44_OOP_Review.accesModifier.Car1;

public class CarTest1 {

    //    private CarTest1() {  // baka class dan nesne üretmeyi engeller
//    }


    public static void main(String[] args) {
        Car1 car1 = new Car1();

        car1.model= "Mazda";
        car1.engine=1.6;
        car1.year=2019;
//        car1.door=4;

        System.out.println(car1.toString());
        System.out.println(car1);


    }
}
