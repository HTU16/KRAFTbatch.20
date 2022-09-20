package Day_35_Inheritance;


    public class Minibus extends Vehicle {
        //    Minübüs is a Vehicle
        int seat;

        public void using(){
            System.out.println(color+" "+type+" "+seat+" yolcu taşır");//Vehicle Class field lerine doğrudan erişilebildiğine dikkat edin
        }


        public String toString() {
            return "Minibus{" +
                    "seat=" + seat +
                    ", type='" + type + '\'' +
                    ", price=" + price +
                    ", color='" + color + '\'' +
                    '}';
        }
}
