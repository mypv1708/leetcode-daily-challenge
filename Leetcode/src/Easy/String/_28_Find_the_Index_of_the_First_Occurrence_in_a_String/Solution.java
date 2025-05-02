package Easy.String._28_Find_the_Index_of_the_First_Occurrence_in_a_String;

public class Solution {
    // Sliding Window
    static int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            String window = haystack.substring(i, i + needleLength);
            if(needle.equals(window)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leetc";
        System.out.println(strStr(haystack, needle));
    }
}
