package LinearSearch;

import java.util.Arrays;

public class EvenNoOfDigits {


     static int findNoOfEvenDigits(int[] numbers) {
        int count = 0;
        for(int index = 0;index < numbers.length;index++){
            if(even(numbers[index])){
              count++;
            }
        }
        return count++;
    }

     static boolean even(int number){
        int noOfDigits = digits(number);
        return noOfDigits % 2 == 0;

    }

     static int digits(int number){
        int count = 0;
     while (number > 0){
         count++;
          number = number / 10;
     }
     return count++;
    }
}
