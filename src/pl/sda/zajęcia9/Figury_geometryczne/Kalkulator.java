package pl.sda.zajęcia9.Figury_geometryczne;

import java.util.Random;

public class Kalkulator {
    public static void main(String[] args) throws Rectangular_triangle{
        Random random = new Random();
        int n = 0;
        Shape[] shape = new Shape[20];

        for(int i = 0; i < 20; i++){
            n = random.nextInt(4);
            if(n == 0) {
                System.out.println("Rectangle:");
                shape[i] = new Rectangle(random.nextInt(9)+1, random.nextInt(9)+1);
            }

            if(n == 1){
                System.out.println("Triangle:");
                shape[i] = new Triangle(random.nextInt(9)+1,random.nextInt(9)+1,random.nextInt(9)+1,random.nextInt(9)+1);
            }

            if(n == 2){
                System.out.println("Square:");
                shape[i] = new Square(random.nextInt(9)+1);
            }

            if(n == 3){
                System.out.println("Circle:");
                shape[i] = new Circle(random.nextInt(9)+1);
            }

            System.out.print(i+ "\t");
            try {
                shape[i].getArea();
                shape[i].getPermiter();
                System.out.println(shape[i].toString());
            }
            catch (IllegalTriangle e){
                System.out.println("Wyjątkowa sytuacja. " + e.getMessage());
                random_again(i, shape);
            }
            finally {
                if(shape[i] instanceof Triangle)
                System.out.println("Przeszło.");
            }
        }
    }

    static void random_again(int i, Shape [] shape){
        Random random = new Random();
        shape[i] = new Triangle(random.nextInt(9)+1,random.nextInt(9)+1,random.nextInt(9)+1,random.nextInt(9)+1);
        try {
            shape[i].getArea();
        }
        catch (IllegalTriangle | Rectangular_triangle e){
            random_again(i, shape);   ////rekurencja
        }
        finally {
            System.out.println("Przeszło znowu.");
        }
    }

}
