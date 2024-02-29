package assignment2;

import java.util.Arrays;

public class RemoveDups {
    public static void main(String[] args) {
        String[] arr = {
                "horse",
                "dog",
                "horse",
                "monkey",
                "cat",
                "horse",
                "dog"
        };
        String[] solution = new String[arr.length];
        int solutionIndex = 0;
        for(String arrItem: arr){
            boolean isArrItemAlreadyPresent = false;
            for(String solutionItem: solution){
                if(arrItem.equals(solutionItem)){
                    isArrItemAlreadyPresent = true;
                    break;
                }
            }
            if(!isArrItemAlreadyPresent){
                solution[solutionIndex++] = arrItem;
            }
        }
        String[] resultArr = new String[solutionIndex];
        System.arraycopy(solution, 0, resultArr, 0, solutionIndex);
        System.out.println(Arrays.toString(resultArr));
    }
}
