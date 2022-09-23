package Day_39_Abstraction;

public abstract class Animal {

    //ABSTRACT DA NESNE ÜRETİLEMEZ.. new= gibi*********************************************************
    //CONSTRUCTOR EKLENEBİLİR...*******************************************************************
    // instantiate yapılamaz...*********************************************************************
    //override yapılmalı....*************************************************************************
    //static - final - private olamaz..**********************************************************************
    //default ve protected olabilir..**************************************************************
    //iki abstract class extends yapılırsa override yapılmasına gerek yok..***********************

    String name;

    public Animal(String name) {
                        //  {}  body ler olmayacak...
this.name = name;

}
    public abstract void eat();

    public abstract void move();

}

class AnimalTest {
    public static void main(String[] args) {
//        Animal animal = new Animal("behlül"); // Abstract class dan instantiate yapılamaz.
    }
}
