package pl.sda.zajęcia12.zad1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof  Student)){
            return false;
        }

        Student theOther = (Student) o;
        if(theOther.mainLanguage.equals(mainLanguage) && theOther.lastname.equals(lastname) && theOther.firstname.equals(firstname));

        return  super.equals(o);
    }

    @Override
    public int hashCode() {
        return lastname.hashCode();
        //return Objects.hash(firstname, lastname, mainLanguage);
    }
}
