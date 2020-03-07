package pl.sda.zajęcia9.Figury_geometryczne;

public class Rectangle extends Polygon {
    private double a;
    private double b;

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPermiter() {
        return (2*a + 2*b);
    }

    ////////konstruktor
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
/////////////////
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
