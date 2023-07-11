public class Palindrome {

    public static boolean palindrome (String word) {


        for (int i = 0, j = word.length() - 1; i < word.length(); i++,j--) {

            if(word.charAt(i) != word.charAt(j)){
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String text = "PAP";
        System.out.println(palindrome(text));
    }
}
