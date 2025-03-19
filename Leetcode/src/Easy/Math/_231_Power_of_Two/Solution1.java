package Easy.Math._231_Power_of_Two;

public class Solution1 {
    static boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
