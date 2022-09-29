package Day_45_OOP_Review_Cont_Hiding.abstraction;

public  abstract class D3Print {

    String model;
    String fileFormat;


    public D3Print(String model, String fileFormat) {
        this.model = model;
        this.fileFormat=fileFormat;

    }




    public  abstract  void  extrude();
    public  abstract  void  polish();

    public  String fileFormatCheck(){
        if (fileFormat.equals("OBJ")){
          return "modeli boyatmak uygundur";
      }else{
            return " modeli boyatmak için uygun değildir";
        }

    }
}
