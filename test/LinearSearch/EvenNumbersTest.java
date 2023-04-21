package LinearSearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumbersTest {


 @Test
    public void testThatYouCanFindEvenNumbers(){
     int[] array = {12,345,3,6,7896};

    int find = EvenNumbers.findEvenNumbers(array);

    assertEquals(2,find);
 }

}