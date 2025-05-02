package Easy.String._242_Valid_Anagram;

import java.util.Arrays;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] ar = new int[26];
        for (char c : s.toCharArray()) {
            ar[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            ar[c - 'a'] -= 1;

        }
        for (int i = 0; i < 26; i++) {
            if (ar[i] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("agg", "gag"));    // true
    }
}
