package pl.sda.zad_dom_na_11.przetwarzanie_tekstu.przetwarzanie_tekstu;

import java.util.Scanner;

public class DirectionMain {
    public static void main(String[] args) {
        Direction north = Direction.NORTH;
        Direction west = Direction.WEST;
        Direction east = Direction.EAST;
        Direction south = Direction.SOUTH;

        int[] end_position = new int[2];
        int[] position = {0, 0};
        int n = 0;

        Scanner cin = new Scanner(System.in);
        System.out.print("Podaj pozycję końcową:");
        end_position[0] = cin.nextInt();
        System.out.println(", ");
        end_position[1] = cin.nextInt();
        System.out.println("(" + end_position[0] + ", " + end_position[1] + ")");

        while(end_position[0] != position[0] || end_position[1] != position[1]){
            System.out.println("Podaj kierunek(north - 1, south - 2, east - 3, west - 4):");
            n = cin.nextInt();
            switch (n){
                case 1:
                    position[1] += north.getDirection();
                    break;
                case 2:
                    position[1] += south.getDirection();
                    break;
                case 3:
                    position[0] += east.getDirection();
                    break;
                case 4:
                    position[0] += west.getDirection();
                    break;
                default:
                    System.out.println("podano zły kierunek!");
                    break;
            }
            System.out.println("(" + position[0]+ ", " + position[1] + ")");
        }
        System.out.println("Sukces!!!");
    }
}
