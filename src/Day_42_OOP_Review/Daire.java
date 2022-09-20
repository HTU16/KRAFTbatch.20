package Day_42_OOP_Review;

public class Daire {

    private final static double PI=3.14;
    private  double radius;

    {
        System.out.println("hoop hemşehrim nereye burası  instance block");
    }

    static{
        System.out.println("hooop hemşehrim nereye burası static block ");
    }

    {
        System.out.println("iyi hadi geç ama burası instance block");
    }

    public  Daire(){}
    public Daire(double radius) {
        this.radius = radius;
    }

    public  void  setRadius(double radius){
        if( !(radius<=0)){
            this.radius=radius;
        }else{
            System.err.println("hatali kanks sorry..yariçap 0 ve 0 dan küçük olamaz");
        }
    }

    public double getRadius() {
        return this.radius=radius;
    }

    public  double alan(){            //pi*r kare
        return PI*Math.pow(radius,2);
    }
    public  double cevre(){          // 2*pi*r
        return  2*PI*this.radius;
    }
    public static double alan(double radius ){           //overloading oldu..
        return  PI*radius*radius;
    }
    public static  double cevre(double radius){
        return  2*PI*radius;
    }
}
