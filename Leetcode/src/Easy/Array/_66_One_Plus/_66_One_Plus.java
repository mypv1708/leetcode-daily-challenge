package Easy.Array._66_One_Plus;

import java.util.Arrays;

public class _66_One_Plus {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 9, 9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
