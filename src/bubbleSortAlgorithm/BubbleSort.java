package bubbleSortAlgorithm;

public class BubbleSort {

  public static void bubble(int[] arr){
      boolean swapped ;
      for(int index = 0;index < arr.length;index++){
          swapped = false;

          for(int index2 = 1;index2 < arr.length - index;index2++){

              if(arr[index2] < arr[index2 - 1]){
                  int temp = arr[index2];
                  arr[index2] = arr[index2 - 1];
                  arr[index2 - 1] = temp;
                  swapped = true;

              }
          }
          if(!swapped){
              break;
          }
      }

  }

}