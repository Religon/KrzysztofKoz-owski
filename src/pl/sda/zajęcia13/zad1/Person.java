package pl.sda.zajęcia13.zad1;

public class Person implements Comparable<Person>{
    private int age;
    private final String name;

    public  Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "[" + age + "]";
    }

    @Override
    public int compareTo(Person theOther) {
        return this.age - theOther.age;
    }
}
