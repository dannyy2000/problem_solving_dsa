package LinearSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class sumArrayTest {

    @Test
    void findArraySum(){
        int[][] account = {{1,2,3},{3,2,1}};
        int sum = sumArray.findArraySum(account);
        assertEquals(6,sum);
    }

}