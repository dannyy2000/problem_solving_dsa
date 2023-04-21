package LinearSearch;

public class EvenNumbers {

    public static int findEvenNumbers(int[] nums){
        int total = 0;
        int counter = 0;

        for(int index = 0;index < nums.length;index++){
            if(nums[index] % 2 == 0){
               total = counter++;

            }

        }

        return total;
    }
}
