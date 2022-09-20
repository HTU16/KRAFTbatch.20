package Day_34_Static.staticVariable;

public class Birthday {

    static int cakeSlice = 28;

    public void takeASlice(){
        cakeSlice--;
    }
    public void takeAslice(int count){
        cakeSlice-=count;
    }
}
class main2{
    public static void main(String[] args) {
        Birthday zafer = new Birthday();
        Birthday enes = new Birthday();
        Birthday ilyas = new Birthday();
        Birthday rıdvan = new Birthday();
        Birthday talip = new Birthday();
        Birthday ramazan = new Birthday();
        Birthday talha = new Birthday();

        zafer.takeASlice();
        enes.takeASlice();
        ilyas.takeASlice();
        rıdvan.takeASlice();
        talip.takeASlice();
        ramazan.takeASlice();
        talha.takeASlice();
        zafer.takeAslice(2);
        ilyas.takeASlice();



        System.out.println(Birthday.cakeSlice);
    }
}
