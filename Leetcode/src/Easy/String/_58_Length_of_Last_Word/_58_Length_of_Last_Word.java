package Easy.String._58_Length_of_Last_Word;

public class _58_Length_of_Last_Word {
    static int lengthOfLastWord(String s) {
        s = s.trim();
        int counter = 0;
        for (int i = s.length() -1; i >= 0; i--) {
            if (!Character.isLetterOrDigit(s.charAt(i))){
                return counter;
            }
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
