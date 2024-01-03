package leetcode;

import java.util.Arrays;

public class IntersectionArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        int maxSize = Math.max(nums1.length, nums2.length);
        int count = 0;
        int[] tempNums = new int[maxSize];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    tempNums[count] = nums1[i];
                    count++;
                    break;
                }

            }
        }



        int count2 = 0;
        int [] intersect = new int[count2];
        int[] gel = new int[tempNums.length];

        for (int i = 0; i < tempNums.length; i++) {
            for (int j = i; j < tempNums.length; j++) {

                if(tempNums[i] == tempNums[j] && tempNums[i] != 0) {
                     gel[count2] = tempNums[i];
                     count2++;
                     break;

                }

            }


        }

        System.arraycopy(gel,0,intersect,0,count2);

        return intersect;

    }

    public static void main(String[] args) {
        int [] number1  = {1,2,2,1};
        int [] number2 = {1,2};
        System.out.println(Arrays.toString(intersection(number1, number2)));
    }
}
