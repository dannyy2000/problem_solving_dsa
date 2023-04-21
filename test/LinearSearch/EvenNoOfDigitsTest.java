package LinearSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNoOfDigitsTest {

    @Test
    void testEvenDigits(){

        int[] array = {12,345,2,6,789};
       int find = EvenNoOfDigits.findNoOfEvenDigits(array);
        assertEquals(1,find);
    }

}