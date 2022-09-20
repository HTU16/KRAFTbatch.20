package Day_17_Class_And_Object;

public class Daire {

    final static double PI=3.14;
    int r;

    public void mesaj(){
        System.out.println(r+" yarıçaplı bir daire");
    }

    public void cevreHesapla(){
        double sonuc=2*PI*r;
        System.out.println(r+" yarıçaplı dairemizin çevresi "+ sonuc);
    }

    public double alanHesapla(){
        return (PI*r*r);
    }
    public static double cevreHesapla(int yaricap){
        double sonuc=2*PI*yaricap;
        return sonuc;
    }
    public static double alanHesapla(int r){

        double sonuc=PI*r*r;
        return sonuc;
    }
}
