package Day_42_OOP_Review;

public class Main_42 {
    public static void main(String[] args) {


        System.out.println("Daire.alan(2) = " + Daire.alan(2));
        System.out.println("Daire.cevre(13) = " + Daire.cevre(13));

        Daire daire=new Daire();
        daire.setRadius(0);


    }

    public  void  staticOlmayanMetod(){
        Daire daire=new Daire();
    }
}
// OOP  ****************************************************************************************************************
// ENCAPSULATION : Data hidding-kapsülleme, GET-SET,  only set-only get
// INHERITANCE : is-a, parent-child, kalıtım, extends,
//
// static metotlarda this super gibi keyword kullanılmaz.