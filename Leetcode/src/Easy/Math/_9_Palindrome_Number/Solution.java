package Easy.Math._9_Palindrome_Number;

public class Solution {
    public static boolean isPalindrome(int x) {
        int revert = 0;
        int temp = x;
        while (temp > 0) {
            revert = revert * 10 + temp % 10;
            temp /= 10;
        }
        return x == revert;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(111));
    }
}
