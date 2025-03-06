package Easy.String._28_Find_the_Index_of_the_First_Occurrence_in_a_String;

public class _28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    static int strStr(String haystack, String needle) {
        int nLength = needle.length();

        for (int i = 0; i <= haystack.length() - nLength; i++) {
            String prefix = haystack.substring(i, i + nLength);
            if (prefix.equals(needle)) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leetc";
        System.out.println(strStr(haystack, needle));
    }
}
