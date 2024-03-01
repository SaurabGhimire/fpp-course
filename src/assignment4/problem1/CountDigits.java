package assignment4.problem1;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        int res;
        if (num == 0) {
            res = 1;
        } else {
            res = countDigits(num);
        }
        System.out.println("The count of digits in " + num + " is: " + res);
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }
}
