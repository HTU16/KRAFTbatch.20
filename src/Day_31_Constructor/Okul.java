package Day_31_Constructor;

public class Okul {

    //Okul adında bir sınıf oluşturun
// fields: rengi; kapasite; sinifAdedi;
// methods: Kapasite>500 kapasite aşılmıştır ikazı versin.  min 3 adet constructors yazın..
    public String renk;
    public int kapasite;
    public int sinifAdeti;

    public Okul(){
        System.out.println("Parametresiz constructor çalışıyor");
    }

    public Okul(String renk){
        this();
        System.out.println("1 Parametreli constructor çalışıyor");
        this.renk=renk;
    }
    public  Okul(String renk,int kapasite){
        this();
        this.renk=renk;
        if(kapasite>500){
            System.err.println("Hatalı giriş kapasite 500 den büyük olamaz");
            this.kapasite=0;
        } else{
            this.kapasite=kapasite;
        }


    }


    public Okul(String renk,int kapasite,int sinifAdeti){
        this.renk=renk;
        this.kapasite=kapasite;
        this.sinifAdeti=sinifAdeti;
    }


    public void kontrolKapasite(){
        if(this.kapasite>500){
            System.out.println("kapasite aşılmıştır");
        }else {
            System.out.println("kapasite aşılmasına "+ (500-this.kapasite) +" kişi kalmıştır." );
        }
    }
}
