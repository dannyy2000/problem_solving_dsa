package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySearchTest {

    @Test
   void testArraySearch(){
        int []arr = {2,3,5,9,14,16,18};
        int tar = 14;
       int find =  ArraySearch.binarySearch(arr,tar);
       assertEquals(5,find);
//        System.out.println(find);
    }

}