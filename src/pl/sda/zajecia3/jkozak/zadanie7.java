package pl.sda.zajecia3.jkozak;

import java.util.Scanner;
public class zadanie7 {
    public static void main(String[] args) {
        /*
        7. Napisać program działający w trybie konsolowym (tekstowym) i rysujący na ekranie prostokąt.
        Użytkownik podaje znak wypełnienia prostokąta, pozycję lewego górnego rogu prostokąta (x,y)
        oraz długości boków prostokąta (ab). Przyjmujemy, że lewy górny narożnik konsoli ma współrzędne (x,y) = (1,1).
        Przykład: x=6, y=3, a=4, b=6, zn=’x’
        >
        >
        > _____xxxxxx
        > _____xxxxxx
        > _____xxxxxx
        > _____xxxxxx
        ozn.
        > - nowa linia,
        _ - znak spacji.
         */
        Scanner cin = new Scanner(System.in);

        System.out.println("znak wypełnienia prostokąta:");
        String znak = cin.next();
        System.out.println("podaj pozycję lewego górnego prostokąta: x=");
        int x = cin.nextInt();
        System.out.println("y =");
        int y = cin.nextInt();
        System.out.println("podaj długość boku prostokąta: a =");
        int a = cin.nextInt();
        System.out.println("b = ");
        int b = cin.nextInt();

        for(int i = 0; i < x; i++){
            System.out.print("> ");
            if(i >= (x-a)) {
                for (int j = 0; j < (x + b); j++) {
                    if (j >= x)
                        System.out.print(znak);
                    else
                        System.out.print("_");
                }
            }
            System.out.println();
            }
        }

    }

