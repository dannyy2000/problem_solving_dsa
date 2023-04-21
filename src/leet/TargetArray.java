package leet;

public class TargetArray {

    public static void main(String[] args) {
        int []array = {1,3,5,6};
        int target = 2;
        int ans = searchInsert(array,target);
        System.out.println(ans);
    }

    public static int searchInsert(int[] array,int target){

        for (int i = 0; i < array.length ; i++) {
            if(array[i] == target){
                return i;
            }
                if(i < array.length - 1) {
                    if (target > array[i] && target < array[i + 1]) {
                        return i + 1;

                    }
                }
                if(target < array[i]){
                    return 0;
                }
        }return array.length;
    }
}
