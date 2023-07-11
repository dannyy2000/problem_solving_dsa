package leetcode;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int currentsum = 0;
        int length = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            currentsum += nums[i];
        }
        int expected = (length + 1) * (length + 2) / 2;
        int missing = expected - currentsum ;
        return missing;

    }

    public static void main(String[] args) {
        int []number = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(number));
    }
}


