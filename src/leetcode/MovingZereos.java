package leetcode;

import java.util.Arrays;

public class MovingZereos {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        int temp = 0;


        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != 0){
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;
                nonZeroIndex++;
            }

            }

        System.out.println(Arrays.toString(nums));


    }

    public static void main(String[] args) {
        int[] number = {1};
        moveZeroes(number);

    }
}
