package LinearSearch;

public class MaximumArray {


    public static int findMaximum(int[][] numbers) {
        int max = Integer.MIN_VALUE;

        for(int row = 0;row < numbers.length;row++){
            for(int column = 0;column < numbers[row].length;column++){
                if(numbers[row][column] > max){
                    max = numbers[row][column];
                }
            }
        }return max;
    }
}
