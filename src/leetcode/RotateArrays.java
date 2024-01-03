package leetcode;

import java.util.Arrays;

public class RotateArrays {
        public static void rotate(int[] nums, int k) {


            for (int i = nums.length - 1;  i < k; i--) {

                nums[0] = nums[i];
            }
            System.out.println(Arrays.toString(nums));

        }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }
    }

