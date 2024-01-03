package leetcode;

public class PowerOfThree {
    public  static boolean isPowerOfThree(int n) {

        if(n <= 0){
            return false;
        }
        while(n % 3 == 0){
            n/=3;
        }
     return n == 1;
    }

    public static void main(String[] args) {
        int number = 27;
        System.out.println(isPowerOfThree(number));
    }
}
