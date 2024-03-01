package assignment4.problem1;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
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
}
