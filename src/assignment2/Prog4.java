package assignment2;

public class Prog4 {
    public static void main(String[] args) {
        float num1 = 1.27f;
        float num2 = 3.881f;
        float num3 = 9.6f;

        int sum = (int) (num1+num2+num3);
        System.out.println(sum);

        int roundedSum = (int) Math.round(num1+num2+num3);
        System.out.println(roundedSum);
    }
}
