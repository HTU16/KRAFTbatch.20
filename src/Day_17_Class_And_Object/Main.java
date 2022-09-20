package Day_17_Class_And_Object;

public class Main {

    public static void main(String[] args) {
        Person ogrenci_1=new Person();
        ogrenci_1.isim="Harun";
        ogrenci_1.cinsiyet="Erkek";


        Person ogrenci_2=new Person();



        ogrenci_2.isim="Ayse";
        ogrenci_2.cinsiyet="Bayan";
        ogrenci_2.yas=16;
        // ogrenci_1.oyunOyna();
        // ogrenci_1.uyu();


        // System.out.println(ogrenci_1.isim +" ile "+ogrenci_2.isim+" arkadaştır");
        //  System.out.println(ogrenci_1.isim+" yasi:"+ogrenci_1.yas);

        Dog dog_1=new Dog();
        dog_1.isim="Karabaş";
        dog_1.cins="Sivas kangalı";
        dog_1.renk="Siyah beyaz";
        // System.out.println(dog_1.isim+" adlı köpeğin rengi "+dog_1.renk);
        // dog_1.havla();
        //  dog_1.uyu();
        // String c=dog_1.yemekYe();
        // System.out.println("c = " + c);

        Car tesla_1=new Car();

        tesla_1.renk="sarı";
        tesla_1.marka="Tesla";
        tesla_1.model="Model 3";
        //  tesla_1.calistir();
        //tesla_1.hizlan();
        // tesla_1.dur();
        //System.out.println("tesla_1.model = " + tesla_1.model);


        Daire daire_1=new Daire();
        // daire_1.cap=8;
        //  System.out.println("dairemizin alanı " + daire_1.alanHesapla());


        Daire daire_2=new Daire();
        //   daire_2.cap=7;
        //System.out.println("daire_2.cevreHesapla() = " + daire_1.cevreHesapla());


//double c=  daire_2.cevreHesapla();
        //System.out.println("c = " + c);


        //System.out.println("daire_2.cap = " + daire_2.cap);



        //Daire daire_3=new Daire();


        //System.out.println("Math2.pow(2,6) = " + Math2.pow(2, 6));
        // System.out.println("Daire.alanHesapla(3) = " + Daire.alanHesapla(3));



      /* Daire daire=new Daire();
       daire.r=5;
     double x=daire.alanHesapla();
        System.out.println("x = " + x);
        double x=Daire.alanHesapla(6);
        System.out.println("x: "+x);
        System.out.println("PI = " + Daire.PI);
        Daire daire=new Daire();
        System.out.println("Daire.r = " + daire.r);
        System.out.println("Math.PI = " + Math.PI);*/




        // Banka person_1=new Banka();
       /* person_1.hesapAc();
        person_1.mobilBankacilikOnay();
        person_1.paraYatir(50);
        person_1.paraYatir(150);
        Banka person_2=new Banka();
        person_2.hesapAc();
        person_2.mobilBankacilikOnay();
        person_2.paraYatir(188);
        person_1.hesapOzeti();
       person_2.hesapOzeti(); */

        //  Banka person_1=new Banka();
        //  person_1.musteriAdSoyad="harun";
        //System.out.println("person_1.musteriAdSoyad = " + person_1.musteriAdSoyad);
        //System.out.println(person_1);


        //   Car car=new Car();

/*
         Banka person_1=new Banka();
      person_1.hesapAc();
        person_1.mobilBankacilikOnay();
        person_1.paraYatir(50);
        person_1.paraYatir(150);
        person_1.hesapOzeti();
        Banka person_2=new Banka();
        person_2.hesapAc();
        person_2.mobilBankacilikOnay();
        person_2.paraYatir(188);
        person_2.hesapOzeti();
String a="harun";
String b="mehmet";
long start=System.nanoTime();
String c=a.concat(b);
 System.out.println(a);
        long finish=System.nanoTime();
        long result=finish-start;
        System.out.println(result);
*/


        String a="   mehmet sema orhan atmaca  ";
        String  c=a.trim();
        System.out.println("c.lastIndexOf(' ') = " + c.lastIndexOf(' '));
        System.out.println("c.substring(17) = " + c.substring(18));

        int d=0,e=0;
        while (true){
            if(c.indexOf(' ')==-1){
                break;
            }
            e+=c.indexOf(' ');
            d=c.indexOf(' ');
            c=c.substring(d+1);
        }
        // System.out.println(c);
        //  System.out.println("Sayın "+a.trim().substring(0,e+1)+ " soy isminiz "+c);
        System.out.println("c.lastIndexOf('c') = " + c.lastIndexOf('c'));




        /*
        for(int i=c.length()-1; i>=0; i--){
            b.concat(c.substring(i,i+1));
        }
    } */
    }
}
