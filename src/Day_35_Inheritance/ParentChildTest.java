package Day_35_Inheritance;

public class ParentChildTest {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.print_message_P(); //bu methodu ChildClass icinde de çağırabilirdik. Child Class 6. line kontrol et
        childClass.print_message_C();

        ParentClass parentClass = new ParentClass();
//        parentClass.print_message_C(); // parent class child class ın
        // methodlarına fields larına erişmez.
    }
}
