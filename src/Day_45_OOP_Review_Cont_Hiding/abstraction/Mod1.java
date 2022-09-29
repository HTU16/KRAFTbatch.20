package Day_45_OOP_Review_Cont_Hiding.abstraction;

public class Mod1 extends  D3Print{

    public Mod1(String model, String fileFormat) {
        super(model, fileFormat);
        extrude();
        if (fileFormat.equals("DBJ")){
            polish();
        }else {
            fileFormatCheck();
        }
    }

    @Override
    public void extrude() {
        System.out.println(model+" "+ fileFormat);
    }

    @Override
    public void polish() {
        System.out.println(model+" "+fileFormat);
    }
}
