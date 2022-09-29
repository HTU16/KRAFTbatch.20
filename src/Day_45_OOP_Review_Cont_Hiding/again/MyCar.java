package Day_45_OOP_Review_Cont_Hiding.again;

public class MyCar {

    public  static  boolean haveSunroof(){
        return  false;
    }

    public void  getMySunroofStatus(){
        System.out.println("my car have sunroof " + haveSunroof());
    }
}
