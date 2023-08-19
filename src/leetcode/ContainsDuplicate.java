package leetcode;

import java.util.Arrays;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }


        return false;
    }


//        for (int i = 0; i < nums.length - 1; i++) {
//            for(int j = i + 1; j < nums.length ;j++){
//                if(nums[i] == nums[j]){
//                    return true;
//                }
//            }
//
//
//        }
//        return false;
//    }

    public static void main(String[] args) {

        int [] number = {1,2,3,4};
        System.out.println(containsDuplicate(number));
    }
}
