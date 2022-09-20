package Day_17_Class_And_Object;

public class Math2 {

    public static int pow(int taban,int us){
        int sonuc=1;
        for(int i=0; i<us; i++ ){
            sonuc*=taban;
        }
        return sonuc;
    }
}
