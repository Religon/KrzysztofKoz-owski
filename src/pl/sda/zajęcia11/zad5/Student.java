package pl.sda.zajęcia11.zad5;

import java.util.*;

public class Student {
    private final String firstname;
    private final String lastname;
    private final String mainLanguage;

    public Student(String firstname, String lastname, String mainLanguage){
        this.firstname = firstname;
        this.lastname = lastname;
        this.mainLanguage = mainLanguage;
    }

    @Override
    public String toString() {
        return
                firstname + " " +
                lastname + " " +
                mainLanguage;
    }



}
