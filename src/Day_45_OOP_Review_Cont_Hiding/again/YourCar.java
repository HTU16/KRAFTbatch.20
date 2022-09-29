package Day_45_OOP_Review_Cont_Hiding.again;

public class YourCar extends  MyCar {
    public  static  boolean haveSunroof(){
        return  true;
    }
    public void  getYourSunroofStatus(){
        System.out.println("your car have sunroof "+ haveSunroof());
    }
}
