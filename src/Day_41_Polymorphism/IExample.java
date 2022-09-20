package Day_41_Polymorphism;

public interface IExample {

    default  void baslat(){
        mesaj();
    }
    private  void  mesaj(){
        System.out.println("merhaba dunya");
    }
}
class Main implements  IExample{
    public static void main(String[] args) {
        Main main=new Main();
        main.baslat();
        System.out.println(sum(2,5));
    }

    public static  int sum (int a,int b){
        return  a+b;
    }
}
