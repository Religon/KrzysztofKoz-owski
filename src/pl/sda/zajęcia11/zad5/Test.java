package pl.sda.zajęcia11.zad5;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Student, List<Integer>> students = new HashMap<>();

        students.put(new Student("Krzysztof", "Kozłowski", "PL"), lista(new ArrayList<>(5)));
        students.put(new Student("Karolina", "Ratajczak", "ENG"),lista(new ArrayList<>(5)));
        students.put(new Student("Bartosz", "Gorzelewski", "PL"),lista(new ArrayList<>(5)));
        students.put(new Student("Adam", "Małysz", "PL"),lista(new ArrayList<>(5)));

        for (Map.Entry<Student, List<Integer>> entry: students.entrySet()) { ////jednocześnie i klucz i wartość drukuje
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static List<Integer> lista(List<Integer> list){
        Random random = new Random();

        for (int i = 0; i < random.nextInt(4)+1; i++) {
            int number = random.nextInt(5)+1;
            list.add(number);
        }
        return list;
    }
}
