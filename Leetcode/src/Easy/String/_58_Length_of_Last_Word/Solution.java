package Easy.String._58_Length_of_Last_Word;

public class Solution {
    static int lengthOfLastWord(String s) {
        s = s.trim();
        int counter = 0;

        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                counter++;
            }else {
                break;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
