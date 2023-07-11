package codewars;

public class SquareEveryDigit {
    public static int squareDigits(int n) {
        int concatenatedResult = 0;
        int multiplier = 1;

            while(n > 0){
                int digits = n % 10;
                int square = digits * digits;
                concatenatedResult = square * multiplier + concatenatedResult;
                multiplier *=100;
                n/=10;

            }

        return concatenatedResult;
    }

    public static void main(String[] args) {
        int number = 765;
        System.out.println(squareDigits(number));
    }
    }

