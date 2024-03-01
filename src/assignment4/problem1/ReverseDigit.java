package assignment4.problem1;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueSelected = "y"; // Eg: 1234
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

    /*
        RunTime Stack
        LineNo.     Stack               Result
                    reverse(0)
        22          reverse(1)          1
        22          reverse(12)         2
        22          reverse(123)        3
        22          reverse(1234)       4
        11          main()
     */
}
