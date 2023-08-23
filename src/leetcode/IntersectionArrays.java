package leetcode;

import java.util.Arrays;

public class IntersectionArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        int maxSize = Math.max(nums1.length,nums2.length);
        int count = 0;
        int[] tempNums = new int[maxSize];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if(nums1[i] == nums2[j]) {
                    tempNums[count] = nums1[i];
                    count++;
                    break;
                }

            }
        }

        int [] intersect = new int[count];
        int duplicate = 0;

        for(int num: intersect){
            if(intersect[0] == intersect[1]){
                duplicate = intersect[1];
                return new int[]{duplicate};
            }
        }
        System.arraycopy(tempNums,0,intersect,0,count);

        return intersect;

    }

    public static void main(String[] args) {
        int [] number1  = {1,2,2,1};
        int [] number2 = {2,2};
        System.out.println(Arrays.toString(intersection(number1, number2)));
    }
}
