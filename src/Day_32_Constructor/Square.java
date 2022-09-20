package Day_32_Constructor;

public class Square {

    public int sideLenght;

    public Square(){

    }
    public Square(int sideLenght){
        this.sideLenght=sideLenght;
    }



    public int calculateArea(){ //alan hesaplama metodu
        return (int)Math.pow(this.sideLenght,2);
    }

    public static double calculateArea(int sideLenght){ //alan hesaplama metodu
        return Math.pow(sideLenght,2);
    }

    public int calculatePerimeter(){ //çevre hesaplama metodu
        return 4*this.sideLenght;
    }
    public static int calculatePerimeter(int sideLenght){ //çevre hesaplama metodu
        return 4*sideLenght;
    }

}
