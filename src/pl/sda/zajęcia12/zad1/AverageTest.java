package pl.sda.zajęcia12.zad1;

import org.omg.PortableInterceptor.INACTIVE;
import pl.sda.zajęcia11.zad5.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageTest {
    public static void main(String[] args) {
        Map<Student, List<Integer>> grades = new HashMap<>();

        Student student1 = new Student("Krzysztof", "Kozłowski", "PL");
        Student student2 = new Student("Karolina", "Ratajczak", "ENG");
        Student student3 = new Student("Bartosz", "Gorzelewski", "PL");

        List<Integer> grades1 = Arrays.asList(1, 2, 5, 4, 3);
        List<Integer> grades2 = Arrays.asList(4, 5, 5, 4, 3);
        List<Integer> grades3 = Arrays.asList(3, 2, 3, 3, 3);

        grades.put(student1,grades1);
        grades.put(student2,grades2);
        grades.put(student3, grades3);

        StudentService srv = new StudentService();
        List<Integer> result = grades.get(student1);
        Student test = new Student("Krzysztof", "Kozłowski", "PL");
        List<Integer> gradesTest = grades.get(test);
        System.out.println(srv.calculateAverage(result));


    }
}
