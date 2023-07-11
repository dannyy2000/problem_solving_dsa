package leetcode;

public class MaximumNorMinimum {

    public static int findNonMinOrMax(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int num : nums) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != min && nums[i] != max){
                return nums[i];
            }


        }
        return -1;

    }

    public static void main(String[] args) {
        int [] numbers = {1,2};
        System.out.println(findNonMinOrMax(numbers));

     }
}
