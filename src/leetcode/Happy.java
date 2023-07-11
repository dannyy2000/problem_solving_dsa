package leetcode;

public class Happy {
    public static boolean isHappy(int n) {

        while (true) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            if (sum == 1){
                return true;
            }
            n = sum;
        }

    }




    public static void main(String[] args) {
        int number = 19;
        System.out.println(isHappy(number));
    }
}
