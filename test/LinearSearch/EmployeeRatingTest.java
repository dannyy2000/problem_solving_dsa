package LinearSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRatingTest {

    @Test
    void testEmployeeRating(){
        int[] rating = {7,8,12,4,9,8};

         int find = EmployeeRating.rating(rating);

        assertEquals(3,find);

    }

}