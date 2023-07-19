package leetcode;

public class ReverseVowels {
    public static String reverseVowels(String s) {

        String vowels = "aeiou";

        StringBuilder words = new StringBuilder(s);


        for (int i = s.length() - 1; i >= 0 ; i--) {
            char w = words.charAt(i);

            if(vowels.contains(String.valueOf(w))){
                words.append(w);
                words.deleteCharAt(i);

            }
        }
        return words.toString();
    }

    public static void main(String[] args) {
        String wor = "hello";
        System.out.println(reverseVowels(wor));
    }
}
