package pl.sda.zajęcia9.Figury_geometryczne;

public class Triangle extends Polygon {
    private double a;
    private double b;
    private double c;
    private double h;


    @Override
    public double getArea() {
        return (a * h)/2;
    }

    @Override
    public double getPermiter() {
        return a+b+c;
    }

    ////////konstruktor
    public Triangle(double a, double b, double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

}
