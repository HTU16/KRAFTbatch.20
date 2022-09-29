package Day_45_OOP_Review_Cont_Hiding.Interface;

public abstract class B implements A {

    @Override
    public void M1() {

    }

    @Override
    public void M2() {

    }



    class C extends  B{
        @Override
        public void M3() {

        }

        @Override
        public void M4() {

        }
    }
}
