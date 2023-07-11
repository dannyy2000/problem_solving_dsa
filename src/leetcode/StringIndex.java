package leetcode;

public class StringIndex {

    public static int str(String  haystack, String needle){

        for (int i = 0; i < haystack.length() ; i++) {

            int index = haystack.indexOf(needle);

            if(haystack.contains(needle)){
                return index;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        String input1 = "hello";
        String input2 = "ll";
        System.out.println(str(input1,input2));
    }

}
