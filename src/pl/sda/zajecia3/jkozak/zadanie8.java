package pl.sda.zajecia3.jkozak;

import java.util.Scanner;
public class zadanie8 {
    public static void main(String[] args) {
        /*
        8. Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
        Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą wysokość choinki (liczbę wierszy).

        Przykład: dla n = 5 wynik powinien wyglądać następująco:
                    *
                   ***
                  *****
                 *******
                *********
         */

        Scanner cin = new Scanner(System.in);

        System.out.println("podaj liczbę całkowitą: ");
        int n = cin.nextInt();
        if(n > 0){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < 2*n; j++){

                }
            }
        }
    }
}
