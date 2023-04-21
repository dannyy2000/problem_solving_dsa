package LinearSearch;

public class sumArray {


    public static int findArraySum(int[][] account) {
        int max = Integer.MIN_VALUE;

        for(int row = 0;row < account.length;row++){
            int sum = 0;
            for(int column = 0;column<account[row].length;column++){
                sum += account[row][column];

            }
            if(sum > max){
                max = sum;
            }
        }

        return max;


    }



}
