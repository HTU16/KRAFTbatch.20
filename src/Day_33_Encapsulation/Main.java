package Day_33_Encapsulation;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*
        Person enes=personCreate("enes yilmaz",1211);
        System.out.println(enes.name);
        personChange(enes,"mehmet yılmaz",1213);
        System.out.println(enes.name);
    Dog dog=new Dog();
       // System.out.println(dog.getAge());
dog.setAge(15);
       // System.out.println(dog.getAge());
dog.setSpeed(100);
        System.out.println(dog.getSpeed());
      KrafBankCustomer enes=new KrafBankCustomer(1254,"Enes yılmaz",false);
        System.out.println(enes.getCustomerToken());
        enes.setCustomerFullName("1254En12","enes şen");
        System.out.println(enes.getCustomerFullName());
        enes.addMoney(500);
        enes.setIsSms(true);
        */



        int[] array={0,1,2,3,4,5};
        System.out.println(sayiKaydir(array, 1));


    }

    //kayan sayılar interview sorusu: Girilen sayılar kayma miktarına göre sağa kaydırılması
    //gerekmektedir. Fakat sağa doğru kayan sayılar soldan tekrar giriş yapabilmeli.
    //metod(sayilar,kaymaMiktari)
    //
    //0,1,2,3,4,5 girildi kayma miktarı 2 ise 4, 5, 0, 1, 2, 3
    //0,1,2,3,4,5 girildi kayma miktarı 4 ise 2, 3, 4, 5, 0, 1

    public static ArrayList<Integer> sayiKaydir(int[] array, int kaymaMiktari){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int sayi:array) {
            arrayList.add(sayi);
        }

        for(int i=0; i<kaymaMiktari; i++){
            arrayList.add(0,arrayList.remove(arrayList.size()-1));
        }
        return arrayList;

    }












    public static Person personCreate(String name,int id){
        Person person=new Person(name,id);
        return person;
    }

    public static Person personChange(Person person,String name,int id){
        person.name=name;
        person.id=id;
        return person;

    }
}
