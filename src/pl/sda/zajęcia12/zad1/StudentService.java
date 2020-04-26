package pl.sda.zajęcia12.zad1;

import java.util.List;
import java.util.Map;

public class StudentService {
    public double calculateAverage(List<Integer> grades){
        int suma = 0;
        for(int grade: grades){
            suma += grade;
        }
        return (double)suma/grades.size();
    }
    
    public  double calculateTotalAverage(Map<Student, List<Integer>> studentToGrades){

        double srednia = 0;
        for (List<Integer> grades : studentToGrades.values()) {
            srednia += calculateAverage(grades);
        }
        return  srednia/studentToGrades.size();
    }
    
    public Student findBestStudent(Map<Student, List<Integer>> studentToGrades){
        Student best = null;
        double bestAvg = 0;
        for (Map.Entry<Student, List<Integer>> entry: studentToGrades.entrySet()) {
            double currentAvg = calculateAverage(entry.getValue());
            if(currentAvg > bestAvg){
                bestAvg = currentAvg;
                best = entry.getKey();
            }
        }
        return best;
    }
    
}
