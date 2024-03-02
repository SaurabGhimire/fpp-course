package assignment5.day1.problem2;

import java.time.LocalDate;

public class DeptEmployee {
    private String name;
    private LocalDate hireDate;
    final private double salary;

    DeptEmployee(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    double computeSalary() {
        return salary;
    }


}
