package Easy.String._171_Excel_Sheet_Column_Number;

public class Solution {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));    // 1
        System.out.println(titleToNumber("AB"));   // 28
    }
}
