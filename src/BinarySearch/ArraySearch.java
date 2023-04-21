package BinarySearch;

public class ArraySearch {

    public static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;






      for(int index = 0;index < arr.length;index++){
          int mid = start + (end - start)/ 2;
          if(target < arr[mid]){
              end = mid -1;
          }  if (target > arr[mid]) {
              start = mid + 1;
          }
          else{
              return mid;
          }



      }return -1;
    }
}
