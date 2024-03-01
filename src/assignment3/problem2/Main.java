package assignment3.problem2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AgeCalculator ageCalculator = new AgeCalculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your first name: ");
        String fName = sc.next();
        System.out.println("Please, enter your last name: ");
        String lName = sc.next();
        HeartRates heartRates = new HeartRates(fName, lName, ageCalculator.getBirthday());

        heartRates.targetHeartRate();
        System.out.println("First Name: " + heartRates.firstName);
        System.out.println("Last Name: " + heartRates.lastName);
        System.out.println("Age: " + heartRates.getAge());
        System.out.println("Date of Birth: " + heartRates.dob.toString());
        System.out.println("Maximum Heart Rate: " + heartRates.maxHeartRate());
    }

}
