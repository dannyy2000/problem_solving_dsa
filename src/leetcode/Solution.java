package leetcode;

import java.util.Arrays;

public class Solution {
        public static int[] plusOne(int[] digits) {
            for(int i =0; i < digits.length; i++) {
                if (i == digits.length - 1) {
                    digits[i] += 1;
                    if(digits[i] == 10){
                        int [] newArray = {1,0};
                        return newArray;
                    }
                }
            }
            return digits;

        }

    public static void main(String[] args) {
        int [] nums = {10};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    }

