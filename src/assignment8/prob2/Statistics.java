package assignment8.prob2;

import java.util.*;

public class Statistics {
    /**
     * Polymorphically computes and returns the sum
     * of all the salaries of all the staff/teachers in the list.
     */
    public static double computeSumOfSalaries(List<EmployeeData> aList) {
        double salary = 0.0;
        for (EmployeeData e : aList) {
            salary += e.getSalary();
        }
        return salary;
    }
}
