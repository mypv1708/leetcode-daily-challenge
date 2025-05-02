package Easy.String._168_Excel_Sheet_Column_Title;

public class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            result.insert(0, (char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));   // Output: A
        System.out.println(convertToTitle(28));  // Output: AB
    }
}
