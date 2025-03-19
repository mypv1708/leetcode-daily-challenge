package Easy.Math._342_Power_of_Four;

public class Solution1 {
    static boolean isPowerOfFour(int n) {
        return (n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
