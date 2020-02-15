package pl.sda.zajecia3;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        // 1 	1 	2 	3 	5 	8 	13 	21 	34 	55 	89 	144 	233 	377 	610 	987 	1597 	2584 	4181

        Scanner cin = new Scanner(System.in);
        System.out.println("podaj n:");
        int n = cin.nextInt(), F = 0, fa = 0, fb = 1;

        if(n == 0)
            F = 0;
        else if(n == 1)
            F = 1;
        else if(n > 1) {
            for (int i = 2; i <= n; i++) {
                F = fa + fb; // pierwszy obieg to F3
                fa = fb;
                fb = F;
                System.out.println(F);
            }
        }
        System.out.println("dla n:" + n + " ciąg jest równy:" + F);
    }
}
