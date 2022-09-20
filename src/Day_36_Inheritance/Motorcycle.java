package Day_36_Inheritance;


    public class Motorcycle extends Vehicle {
        int cc;

        public int changeCcHp(){
            return cc/15;
        }
        public void start(){
            System.out.println("Motorsiklet anahtar ile çalıştı");
        }
        public  void stop(){
            System.out.println("Motorsiklet durdu");

        }
}
