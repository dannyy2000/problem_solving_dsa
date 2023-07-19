package leetcode;

public class Fascinating {
    public static boolean isFascinating(int n) {


        int result = Integer.parseInt(String.valueOf(n)+String.valueOf(2*n) + String.valueOf(3*n));

        String compareNo = String.valueOf(result);
        System.out.println(compareNo);

        for (int i = 1; i < 10; i++) {
            if (!compareNo.contains(String.valueOf(i))) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int no = 334;
        System.out.println(isFascinating(no));
    }
}
