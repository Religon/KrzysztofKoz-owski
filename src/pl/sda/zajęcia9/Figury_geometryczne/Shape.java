package pl.sda.zajęcia9.Figury_geometryczne;

public abstract class Shape {
    private double permiter;
    private double area;
    private double sides;

    public abstract double getArea();

    public abstract double getPermiter();

    public String toString(){
        return getArea() + " " + getPermiter();
    }
}
