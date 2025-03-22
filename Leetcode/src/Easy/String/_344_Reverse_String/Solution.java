package Easy.String._344_Reverse_String;

import java.util.Arrays;

public class Solution {
    static void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println("Sau khi đảo ngược: " + Arrays.toString(s));
    }
}
