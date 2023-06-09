package selectionSortAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,1,4,5,2,0,9,6,8};
       selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }


    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
         arr[last] = temp;
    }


    private static int getMaxIndex(int[] arr, int start, int end) {
         int max = start;
        for (int i = start; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }return max;
    }


}
