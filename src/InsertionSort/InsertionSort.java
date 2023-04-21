package InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void insert(int[] array){
        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(array[j] < array[j - 1]){
                    swap(array,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] array, int second, int first) {
        int temp = array[second];
        array[second] = array[first];
        array[first] = temp;

    }

    public static void main(String[] args) {
        int[] array = {3,1,5,9,0};
       insert(array);
         System.out.println(Arrays.toString(array));
    }
}
