package Day_45_OOP_Review_Cont_Hiding.abstraction;

public class D3PrintTest {
    public static void main(String[] args) {

        Mod1 mod1=new Mod1("toys", "OBJ");
        System.out.println("--------------");
//mod1.extrude();
//mod1.polish();
//        mod1.fileFormatCheck();

        Mod1 mod2=new Mod1("toyCAR","STL");
        System.out.println("-------------");
        Mod1 mod3=new Mod1("toyBaby","ABC");
        System.out.println("----------");
        Mod1 mod4=new Mod1("toyMonkey","DBJ");
    }
}
