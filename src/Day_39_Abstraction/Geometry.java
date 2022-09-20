package Day_39_Abstraction;

public abstract class Geometry {

    String nameOfShape;

    public Geometry(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    abstract double area();
    abstract String info();

    String getNameOfShape() {
        return nameOfShape;
    }
}

class Circle extends Geometry {

    double radius;

    public Circle(String nameOfShape,double radius) {
        super(nameOfShape);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    String info() {
        return "Name of shape is " + nameOfShape+", Area is "+area();
    }
}

class Square extends Geometry {
    double length;

    public Square(String nameOfShape,double length) {
        super(nameOfShape);
        this.length=length;
    }

    @Override
    double area() {
        return Math.pow(length,2);
    }

    @Override
    String info() {
        return "Name of shape is " + nameOfShape+", Area is "+area();

    }
}
