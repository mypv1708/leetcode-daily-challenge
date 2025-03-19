package Easy.HashTable._3483_Unique_3Digit_Even_Numbers;

import java.util.HashSet;

public class Solution {
    static int totalNumbers(int[] digits) {
        HashSet<Integer> hashSet = new HashSet<>();
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && i != k && j != k) {
                        if (digits[i] != 0) {
                            if (digits[k] % 2 == 0) {
                                int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                                hashSet.add(number);
                            }
                        }
                    }
                }
            }
        }
        return hashSet.size();
    }

    public static void main(String[] args) {
        int[] digits = {2, 4, 6, 6};
        System.out.println(totalNumbers(digits));
    }
}
