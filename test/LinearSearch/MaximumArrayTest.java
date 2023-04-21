package LinearSearch;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MaximumArrayTest {

@Test
        void MaximumNumberTest(){
    int[][] numbers = {{1,2,3},{9,18,5},{6,7,14}};

    int find = MaximumArray.findMaximum(numbers);
    assertEquals(18,find);

}




}