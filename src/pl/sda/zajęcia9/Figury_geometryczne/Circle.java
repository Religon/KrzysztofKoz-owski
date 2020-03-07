package pl.sda.zajęcia9.Figury_geometryczne;

public class Circle extends Shape {
    private double radius;
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPermiter() {
        return 2*Math.PI*radius;
    }

    ////////konstruktor
    public Circle(double radius){
        this.radius = radius;
    }
}
