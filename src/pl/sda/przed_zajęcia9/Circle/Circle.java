package pl.sda.przed_zajęcia9.Circle;

public class Circle {
    ///Pola
    private double radius;
    private String color;

    ///konstruktor

    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    ///metody

    public double getArea(){
        return  2 * radius * Math.PI;
    }

    public double getCircumference(){
        return radius * Math.PI * Math.PI;
    }


    ////settery i gettery
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void  setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
