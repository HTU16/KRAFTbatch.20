package Day_44_OOP_Review.accessModifier2;


import Day_44_OOP_Review.accesModifier.Car1;

public class Car2 extends Car1 {

        @Override
        public void method2() {
            super.method2();

//        private int i = 10;
//        protected int i2 = 10;
//        public int i3 = 10;
        }

        @Override
        protected void method4() {
            super.method4();
        }

        public Car2(){
            super();
//        model= "Mazda";
            engine=1.6;
            year=2019;
//        door=4;
        }

//    private class inner{
//
//    }
    }

