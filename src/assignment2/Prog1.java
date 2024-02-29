package assignment2;
import java.util.*;
public class Prog1 {
    public static void main(String[] args) {
        int randomInt = RandomNumbers.getRandomInt(1, 9);
        double res = computePower(Math.PI, randomInt);
        System.out.println("PI ^ " + randomInt + ": "+ res);

        randomInt = RandomNumbers.getRandomInt(3, 14);
        res = computePower(randomInt, Math.PI);
        System.out.println(randomInt  + "^ PI: " + res);
    }

    static double computePower(double base, double power){
        return  Math.pow(base, power);
    }
}
