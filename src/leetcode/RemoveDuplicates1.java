package leetcode;

public class RemoveDuplicates1 {
        public static int removeDuplicates(int[] nums) {
            int temp = 0;
            int[] tempArray = new int[nums.length];
            for(int i = 0;i < nums.length - 1;i++){
                for(int j = i + 1;j <nums.length - 1;j++){
                    if(nums[j] != nums[j + 1]){
                        tempArray[temp] = nums[j];
                        temp++;
                    }

                }

            }return tempArray.length;

        }

    public static void main(String[] args) {
        int [] number = {1,1,2};
        System.out.println(removeDuplicates(number));
    }


    }

