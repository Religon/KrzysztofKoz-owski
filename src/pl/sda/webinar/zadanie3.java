package pl.sda.webinar;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        /*
        3. Napisać program, który oblicza wartość współczynnika BMI (ang. body mass index) wg.
         wzoru: waga / (wzrost)^2 . Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje ”waga prawidłowa”,
         jeżeli poniżej to ”niedowaga”, jeżeli powyżej ”nadwaga”.
         */
        Scanner cin = new Scanner(System.in);

        double BMI, waga, wzrost;

        System.out.println("podaj wagę: ");
        waga = cin.nextDouble();
        System.out.println("podaj wzrost: ");
        wzrost = cin.nextDouble();

        BMI = waga / (wzrost * wzrost);
        System.out.println("BMI = " + BMI);

        if(BMI < 18.5)
            System.out.println("niedowaga");
        else if(BMI > 24.9)
            System.out.println("nadwaga");
        else
        System.out.println("waga prawidłowa");
    }
}
