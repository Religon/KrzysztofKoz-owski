package pl.sda.zajęcia9.Figury_geometryczne;

public class Triangle extends Polygon {
    private double a;
    private double b;
    private double c;
    private double h;


    @Override
    public double getArea() throws IllegalTriangle, Rectangular_triangle{
        if((a+b)<c || (a+c)<b || (b+c)<a){
            throw new IllegalTriangle("Nie można zbudować trójkąta!");
        }

        double pitagoras = a*a + b*b;
        if(pitagoras == (c*c)){
            throw new Rectangular_triangle("To jest trójkąt prostokątny");
        }

        return (a * h)/2;
    }

    @Override
    public double getPermiter() throws IllegalTriangle{
        if((a+b)<c || (a+c)<b || (b+c)<a){
            throw new IllegalTriangle("Nie można zbudować trójkąta!");
        }
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
