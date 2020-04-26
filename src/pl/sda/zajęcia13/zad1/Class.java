package pl.sda.zajęcia13.zad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Class {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Adam", 20));
        list.add(new Person("Ania", 22));
        list.add(new Person("Krzysztof", 23));
        list.add(new Person("Bartosz", 21));
        list.add(new Person("Ewa", 28));
        list.add(new Person("Aleksandra", 25));

        SdaLinkedList<Person> list2 = new SdaLinkedList<Person>();
        list2.add(new Person("Adam", 20));
        list2.add(new Person("Ania", 22));
        list2.add(new Person("Krzysztof", 23));
        list2.add(new Person("Bartosz", 21));
        list2.add(new Person("Ewa", 28));
        list2.add(new Person("Aleksandra", 25));

        System.out.println(list.toString());
        Collections.sort(list);//in situ //sortowanie według wieku
        System.out.println(list.toString());

        list.sort(new PersonComparator()); //sortowanie według imienia
        System.out.println(list.toString());

        //lub zrobić tak
        list.sort(new Comparator<Person>() {  //metoda anonimowa
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
    }
}
