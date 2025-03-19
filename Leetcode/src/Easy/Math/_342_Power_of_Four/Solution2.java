package Easy.Math._342_Power_of_Four;

public class Solution2 {
    static boolean isPowerOfFour(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        }
        return n % 4 == 0 && isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(64));
    }
}
