package Easy.Math._231_Power_of_Two;

public class Solution2 {
    static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        }
        return n % 2 == 0 && isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(64));
    }
}
