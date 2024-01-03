package leetcode;

public class UniqueCharacter {

    public static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            char word = s.charAt(i);

            if(s.indexOf(word) == s.lastIndexOf(word)){
                return i;
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        String word = "loveleetcode";
        System.out.println(firstUniqChar(word));
    }
}
