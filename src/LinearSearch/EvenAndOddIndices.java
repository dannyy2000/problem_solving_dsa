package LinearSearch;

import java.util.Arrays;

public class EvenAndOddIndices {

    public static int[] evenIndices(int[] number){
        int sum = 0;
        for(int index = 0;index < number.length;index++){
            if(index % 2 == 0){
                sum += number[index];
            }
        }
        return new int[]{sum};
    }

    public static int [] oddIndices(int[] number){
        int sum = 0;
        for(int index = 0;index < number.length;index++){
            if(index % 2 != 0){
                sum += number[index];
            }
        }
        return new int[]{sum};
    }

    public static void checkEquality(int[]numbers){
        if(Arrays.equals(evenIndices(numbers), oddIndices(numbers))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }


}
