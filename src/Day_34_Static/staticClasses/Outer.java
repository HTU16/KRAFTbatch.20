package Day_34_Static.staticClasses;

public class Outer {
    //outer nesnesi burda
    static class nested{

        public static void message1(){
            System.out.println("selam static class dan");
        }
    }
    class Inner {
        //selam nesnesi burda
        public void message2(){
            System.out.println("selam inner class dan");
        }

    }
}
class main{
    public static void main(String[] args) {

        Outer.nested.message1();

        Outer outer = new Outer();
        Outer.Inner selam = outer.new Inner();

        // bir üst satırda create edilmiş /outer/ nesnesi ile /new Inner()/  Inner class dan bir nesne create ediliyor.
        // Nesnenin ismi /selam/ Nesnenin tipi Outer.Inner

//        Outer.Inner selam = new Outer().new Inner();   // one line /selam/ nesnesi create edildi

        selam.message2();




    }
}
