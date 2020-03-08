package pl.sda.zajęcia9.Figury_geometryczne;

public abstract class Shape {
    private double permiter;
    private double area;
    private double sides;

    public abstract double getArea() throws Rectangular_triangle;

    public abstract double getPermiter();

    public String toString(){
        try {
            return getArea() + " " + getPermiter();
        } catch (Rectangular_triangle rectangular_triangle) {
            rectangular_triangle.printStackTrace();
        }
        return null;
    }
}
