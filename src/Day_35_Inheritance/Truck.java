package Day_35_Inheritance;



    public class Truck extends Vehicle{
        //    Truck is a Vehicle
        int carryingCapasity;

        public void carrying(){
            System.out.println(color+" "+type+" "+carryingCapasity+" yük taşır");//Vehicle Class field lerine doğrudan erişilebildiğine dikkat edin
        }


        public String toString() {
            return "Truck{" +
                    "carryingCapasity=" + carryingCapasity +
                    ", type='" + type + '\'' +
                    ", price=" + price +
                    ", color='" + color + '\'' +
                    '}';
        }
}
