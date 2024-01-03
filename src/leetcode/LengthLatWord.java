package leetcode;

public class LengthLatWord {

    public static int lengthOfLastWord(String s) {

        String [] word = s.split("\\s+");

        for (int i = 0; i < word.length ; i++) {
            return word[word.length - 1].length();
        }
        return 0;
    }

    public static void main(String[] args) {
        String wo ="luffy is still joyboy";
        System.out.println(lengthOfLastWord(wo));

    }
}
