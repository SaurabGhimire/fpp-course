package assignment2;

import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] a = {5,6,-4,3,1};
        int[] b = {3,8,9,11};
        int[] res = combine(a, b);
        System.out.println(Arrays.toString(res));
    }

    static public int[] combine(int[] a, int[] b){
        int[] res = new int[a.length + b.length];
        System.arraycopy(a, 0, res, 0, a.length);
        System.arraycopy(b, 0, res, a.length, b.length);
        return  res;
    }
}
