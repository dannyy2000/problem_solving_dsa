package leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 0; i < strs.length ; i++) {
            if(strs[i].startsWith(prefix,0)){

            }

            if(prefix.isEmpty()){
                return "";
            }

        }return "";
    }

    public static void main(String[] args) {
        String [] value = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(value));
    }
}
