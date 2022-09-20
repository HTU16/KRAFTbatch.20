package Day_36_Inheritance;



    public class Cat extends Animal{
        boolean isNankor;

        public Cat(int ayaksayisi,String color,boolean isNankor){
            super(ayaksayisi,color);
            this.isNankor=isNankor;
        }

        public Cat(){}

    }
