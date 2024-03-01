package assignment4.problem1;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueSelected = "y";
        System.out.println("Please, enter a number: ");
        int num = sc.nextInt();
        reverse(num);
        sc.close();
    }

    public static void reverse(int num) {
        if (num == 0) {
            return;
        }
        int digit = num % 10;
        System.out.println(digit);
        int nextNum = num / 10;
        reverse(nextNum);
    }


}
