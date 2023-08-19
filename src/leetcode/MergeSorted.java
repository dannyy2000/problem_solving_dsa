package leetcode;

import java.util.Arrays;

public class MergeSorted {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int tempNums1 = 0;

        int[] tempArray = new int[m];
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0) {
                tempArray[tempNums1] = nums1[i];
                tempNums1++;
            }
        }

        int [] merged = new int[tempNums1 + n];

        for (int i = 0; i < tempNums1; i++) {

            merged[i] = tempArray[i];


        }

        for (int i = 0; i < n; i++) {
            merged[tempNums1+i] = nums2[i];
        }

        for (int i = 0; i < merged.length; i++) {
            nums1[i] = merged[i];
        }

         Arrays.sort(nums1);

        for (int value : nums1) {
            System.out.print(value + " ");
        }
    }


    public static void main(String[] args) {
        int[] number1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] number2 = {2, 5, 6};
        int n = 3;
        merge(number1, m, number2, n);
    }
}
