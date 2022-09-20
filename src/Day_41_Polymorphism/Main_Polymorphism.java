package Day_41_Polymorphism;

import Day_36_Inheritance.VanKedisi;

public class Main_Polymorphism {
    public static void main(String[] args) {

      /*  Dog karabas=new Dog();
        karabas.voice();

        Animal akbas=new Dog();   //overriding yapılan metodu alır.   *********************************************
        akbas.eat();

        SporCar kirmiziMelek=new SporCar();
        kirmiziMelek.start();
        kirmiziMelek.speed();
        kirmiziMelek.stop();

        Car beyazMelek=new SporCar();
        IVehicle sariMelek=new SporCar();
        sariMelek.stop();
        System.out.println(sariMelek.tekerSayisi());


        System.out.println(beyazMelek.getClass().getName());  // class ı package i verir.  ***************************
        VanKedisi minnos=new VanKedisi();
        System.out.println(minnos.getClass().getName());*/

      /*  int a=5;
        double b=(byte)a;                        // narrowing casting -- widening casting
        System.out.println(b);

        Kus kus=new Kus();
        Kanarya kanarya=(Kanarya)kus;*/

  //      Animal animal=new Animal();
//        Dog dog=new Dog();
//        System.out.println(dog.ayakSayisi);              //hiding oldu..
//
//        Dog dog=(Dog) animal;
//        animal.eat();                               hatalı
//        System.out.println(animal.ayakSayisi);
//        ((Dog) animal).speed();

        Animal animal1=new Dog();
        Dog dog2=(Dog)animal1;
        System.out.println(dog2.ayakSayisi);          //type casting yapıldı..
        dog2.speed();
        dog2.eat();

//        Animal animal=new Animal();
//        Dog dog=(Dog)animal;                      HATALI
//        dog.eat();

        Animal animal=new Dog();
        Dog dog=(Dog)animal;
        dog.eat();
        System.out.println(dog.disSayisi);
        System.out.println(dog.ayakSayisi);
        dog.voice();
        dog.speed();
        animal.voice();

    }

}
