package pl.sda.przed_zajęcia9.Circle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(4.0, "blue");
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        c.setRadius(5.0);
        c.setColor("green");

        System.out.println(c.getRadius() + " - " + c.getColor());
    }
}
