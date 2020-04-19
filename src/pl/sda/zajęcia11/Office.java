package pl.sda.zajęcia11;

public class Office {
    public Office(){
        Employee[]  employees = new Employee[2];
        employees[1] = new Employee(25);

        Employee[] employeesNew = new Employee[3];
        employeesNew[0] = employees[0];
        employeesNew[1] = employees[1];
        employeesNew[2] = new Employee(30);

    }
}
