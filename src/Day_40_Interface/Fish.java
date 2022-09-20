package Day_40_Interface;


    public class Fish implements Animal,Food  {//Multi inheritance
        //Animal class ına imlements olmasa bile her iki methodu da
//implemet yapmak zorundadır. Hiyerarşik olarak bağlı
        @Override
        public void hunt() {

        }

        @Override
        public void meal() {

        }
    }
    class chicken implements Food{
        //chicken class ı hiyerarşik olarak 2 interface de bağlı olduğu için
//    tum abstract methodların rın implementasyonlarını yapmak zorunda
        @Override
        public void meal() {

        }

        @Override
        public void hunt() {

        }
}
