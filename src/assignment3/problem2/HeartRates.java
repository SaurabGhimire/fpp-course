package assignment3.problem2;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HeartRates {
    String firstName, lastName;
    LocalDate dob;

    static final int RHR = 70;
    static final double LB = 0.5;
    static final double UB = 0.85;


    HeartRates(String fName, String lName, LocalDate dob) {
        firstName = fName;
        lastName = lName;
        this.dob = dob;
    }

    public int getAge() {
        AgeCalculator ageCalculator = new AgeCalculator();
        return ageCalculator.calculateAge(dob).getYears();
    }

    public int maxHeartRate() {
        return 220 - getAge();
    }

    public void targetHeartRate() {
        int AHR = maxHeartRate() - RHR;
        double LBTHR = AHR * LB + RHR;
        double UBTHR = AHR * UB + RHR;
        System.out.println("The Target Heart Rate Range is between " + LBTHR + " and " + UBTHR);
    }


    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
