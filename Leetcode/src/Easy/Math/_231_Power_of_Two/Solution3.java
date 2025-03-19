package Easy.Math._231_Power_of_Two;

public class Solution3 {
    static boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
//        return (n > 0) && ((n & (n - 1)) == 0);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(64));
    }
}
