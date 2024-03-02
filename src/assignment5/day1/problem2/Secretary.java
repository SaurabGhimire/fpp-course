package assignment5.day1.problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
    double overtimeHours;


    Secretary(String name, LocalDate hireDate, double salary, double overtimeHours) {
        super(name, hireDate, salary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    double computeSalary() {
        return super.computeSalary() + 12 * overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
