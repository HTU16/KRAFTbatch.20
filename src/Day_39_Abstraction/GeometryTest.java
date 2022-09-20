package Day_39_Abstraction;

public class GeometryTest {
    public static void main(String[] args) {
        Circle circle = new Circle("Daire",3);
        System.out.println(circle.info());
        System.out.println(circle.getNameOfShape());
        Square square = new Square("Kare",4);
        System.out.println(square.info());
//        Geometry geometry = new Geometry("Ücgen",3);//error
    }
}
