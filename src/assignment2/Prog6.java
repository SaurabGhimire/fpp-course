package assignment2;

public class Prog6 {
    public static void main(String[] args) {
        int[] a = {2,-21,3,45,0,12,18,6,3,1,0,-22};
        System.out.println(min(a));
    }

    static  int min(int[] arrayOfInts){
        if(arrayOfInts == null || arrayOfInts.length == 0) return 0;
        if(arrayOfInts.length == 1) return  arrayOfInts[0];
        int min = arrayOfInts[0];
        for(int item: arrayOfInts){
            if(item<min){
                min = item;
            }
        }
        return  min;
    }
}
