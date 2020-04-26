package pl.sda.zajęcia13.zad1;

import pl.sda.zajęcia13.zad1.Person;

import java.util.Comparator;


public class PersonComparator implements Comparator {///nasz sędzia/mediator

    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        return p1.getName().compareTo(p2.getName());
    }


}
