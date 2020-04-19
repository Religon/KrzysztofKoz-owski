package pl.sda.zajęcia11.zad5;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String firstname;
    private String lastname;
    private String mainLanguage;

    public Student(String firstname, String lastname, String mainLanguage){
        this.firstname = firstname;
        this.lastname = lastname;
        this.mainLanguage = mainLanguage;
    }



    public static void main(String[] args) {
        Map<Student, Integer> students = new HashMap<>();

    }
}
