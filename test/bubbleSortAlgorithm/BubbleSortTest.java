package bubbleSortAlgorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void testBubbleSort(){
        int []arr = {3,1,5,4,2};

        BubbleSort.bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

}