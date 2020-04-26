package pl.sda.zajęcia12.zad3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OpenSpace {

    public static void main(String[] args) {

        List<Developer> developers = new ArrayList<>();

        developers.add(new Developer("Kacper", 5));

        developers.add(new Developer("Jakub", 10));

        developers.add(new Developer("Michal", 20));

        developers.add(new Developer("Laura", 15));



        //FIXME: zasymuluj opoznienie uruchomienia

        for (Developer developer : developers) {
            new Thread(developer).start();
        }

        while (!developers.isEmpty()) {
            try {
                Thread.sleep(30 * 1000);
                releaseRandomDeveloper(developers);
            } catch (InterruptedException e) {
                System.err.println("interrupted");

            }

        }

    }

    private static void releaseRandomDeveloper(List<Developer> developers) {

        Developer dev = randomDeveloper(developers);
        dev.release();
        developers.remove(dev);

        for (Developer developer : developers) {
            developer.updateFrequency();
        }

    }



    private static Developer randomDeveloper(List<Developer> developers) {
        Random r = new Random();
        int toRelease = r.nextInt(developers.size());
        return developers.get(toRelease);
    }



}


