package assignment5.day1.problem2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptEmployee[] department = new DeptEmployee[5];
        Professor p1 = new Professor("Benefo", LocalDate.of(2023, 1, 1), 60000, 3);
        Professor p2 = new Professor("Bisho", LocalDate.of(2022, 2, 5), 70000, 8);
        Professor p3 = new Professor("Roshan", LocalDate.of(2021, 4, 7), 80000, 23);
        Secretary s1 = new Secretary("Gaurav", LocalDate.of(2024, 1, 8), 10000, 3);
        Secretary s2 = new Secretary("Saurab", LocalDate.of(2024, 3, 23), 8000, 2);
        department[0] = p1;
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see the salary of all the employees?");
        String input = sc.next();
        if (input.equals("Y") || input.equals("y")) {
            double sumOfSalaries = 0.0;
            for (DeptEmployee deptEmployee : department) {

                sumOfSalaries += deptEmployee.computeSalary();
            }
            System.out.println("The total salary of employees is: " + sumOfSalaries);

        }
    }
}
