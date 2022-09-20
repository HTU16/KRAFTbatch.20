package Day_32_Constructor;

public class Main_Day_32 {

    public static void main(String[] args) {
        //Square square_1=new Square();
        //square_1.sideLenght=5;
        //System.out.println(square_1.calculateArea());
        // System.out.println(square_1.calculatePerimeter());
        //Square square_2=new Square(8);
        //System.out.println(square_2.calculatePerimeter());
        // System.out.println(square_2.calculateArea());


        //System.out.println(Square.calculateArea(5));

      /*  Pencil benimKalemim=new Pencil("sari",7,false);
        System.out.println(benimKalemim.lenght);
        System.out.println(benimKalemim.haveEraser);
        System.out.println(benimKalemim.color);
        benimKalemim.write();
        benimKalemim.delete();
        Cat efe=new Cat("yeşil","Sokak Kedisi",true,false);
        Cat minnos=new Cat("yeşil","Sokak kedisi",false,true);
        Cat pamuk=new Cat("mavi","van Kedisi",false,true);
        System.out.println(pamuk.eyeColor);
        System.out.println(pamuk.food());
        System.out.println(minnos.food()); */

        KrafBankCustomer enes=new KrafBankCustomer(152324525,"Enes Yaman",true);
        // changeFullName(enes,"Mehmet yılmaz");
        System.out.println(enes.getCustomerToken());
        enes.addMoney(500);
        enes.addMoney(3500);
        enes.addMoney(4500);
        System.out.println(enes.getCustomerAccount());
        enes.setCustomerAccount(8000);
        System.out.println(enes.getCustomerAccount());
    }

    public static String changeFullName(KrafBankCustomer krafBankCustomer,String fullName){
        krafBankCustomer.customerFullName=fullName;
        return fullName;
    }
}
