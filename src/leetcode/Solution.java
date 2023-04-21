package leetcode;

import java.util.Arrays;

public class Solution {
        public static int[] plusOne(int[] digits) {

            for(int i=0;i< digits.length;i++){
                if(i==digits.length-1){
                    digits[i] += 1;
                }

            }
            return digits;

        }

    public static void main(String[] args) {
        int [] nums = {9};
        plusOne(nums);
        System.out.println(Arrays.toString(nums));
    }

    }

