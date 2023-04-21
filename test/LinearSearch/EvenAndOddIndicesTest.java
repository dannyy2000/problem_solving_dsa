package LinearSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddIndicesTest {

    @Test
    void equalArrayTest(){
        int[] numbers = {-10,7,9,-3};

        EvenAndOddIndices.checkEquality(numbers);
    }

}