package Day_40_Interface;

    public interface A {

        //implements kullanılır. java 8-9 dan sonra private default eklendi.
        //iki interface birbiriyle extends yapılabilir.
        //override yapılabilir.
        //multi inheritance destekler.
        //public ve default(sadece int,boolean ,string..seklinde) kullanılır.
        //block, constructor sahip değildir.

        int number=10;

        void M1();
        void M2();
        void M3();
        void M4();

        default void M5(){

        }
        static void M6(){

        }
}
