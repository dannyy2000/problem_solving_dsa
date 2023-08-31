package leetcode;

public class ReverseStrings {

    public static void reverseString(char[] s) {

        char [] word = new char[s.length];

        for (int i = 0,j = s.length - 1; i < s.length; i++,j--) {

            word[j] = s[i];
        }
        System.out.println(word);
    }

    public static void main(String[] args) {
       char [] word = {'H','a','n','n','a','h'};
       reverseString(word);

    }
}
