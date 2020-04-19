package pl.sda.zajęcia11.zad1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayingWithCollections {
    public static void main(String[] args) {

        List<Integer> numbers  = new ArrayList<Integer>(20);
        Random random = new Random(5);
        for( int i = 0; i < 20; i++){
            int number = random.nextInt(11);
            numbers.add(number);
        }

        for (int number: numbers) {
            System.out.print(number + " ");
        }


        for (int i = 0; i < numbers.size(); i++){
            int number = numbers.get(i);
            if (number % 2 == 0){///usuwanie parzystych
                numbers.remove(i);
                i--;
            }
        }

        System.out.println();
        for (int number: numbers) {
            System.out.print(number + " ");
        }

    }


}
