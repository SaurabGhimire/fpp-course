package assignment4.problem2;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt(); // Eg: 5387
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

    /*
        RunTime Stack
        LineNo.     Stack               Result
                    countDigits(0)          0
        23          countDigits(5)          1 + 0 = 1
        23          countDigits(53)         1 + 1 = 2
        23          countDigits(538)        1 + 2 = 3
        23          countDigits(5387)       1 + 3 = 4
        14          main()
     */
}
