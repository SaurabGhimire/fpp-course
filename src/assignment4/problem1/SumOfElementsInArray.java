package assignment4.problem1;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int res = sum(arr);
        System.out.println("The sum of elements is: " + res);
    }

    public static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 1, newArray, 0, arr.length - 1);
        return arr[0] + sum(newArray);
    }

    /*
        RunTime Stack
        LineNo.     Stack               Result
                    sum({})
        16          sum({4})            4+0 = 4
        16          sum({3,4})          3+4 = 7
        16          sum({2,3,4})        2+7 = 9
        16          sum({1,2,3,4})      1+0 = 10
        6           main()
     */
}
