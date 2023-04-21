package LinearSearch;

public class EmployeeRating {

    public static int rating(int[] rating) {
        int count = 0;
        int temp = 0;
         for (int index1 = 0; index1 < rating.length; index1++) {
                if ( rating[index1] > 6 ) {
                    count++;
                }
                if(temp < count){
                    temp = count;
            }
                if(rating[index1] < 6){
                    count = 0;
                }
        }
         return temp;
    }

}
