package leetcode;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int remainingElement = 0;


        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != val){
                nums[remainingElement] = nums[i];
                remainingElement++;
            }
        }

        return remainingElement;

    }

    public static void main(String[] args) {
        int [] num = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(num, val));
    }


}
