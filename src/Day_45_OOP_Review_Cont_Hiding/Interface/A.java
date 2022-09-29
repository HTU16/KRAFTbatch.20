package Day_45_OOP_Review_Cont_Hiding.Interface;

public interface A {

   //public static final int i;  instance variable olmaz yani değer belirtilmeli
   public static final int i=10;
                       int j=20;

   public  abstract  void M1();
   public  abstract  void M2();
   public  abstract  void M3();
   public  abstract  void M4();

   private  void  M10(){
       System.out.println("hello from private method from interface A");
   }


    default void M5() {} //java 8
    static  void  M6(){} // java 8

    private void  M7(){} // java 9
}
