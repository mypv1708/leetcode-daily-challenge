package Easy.String._3174_Clear_Digits;

public class _3174_Clear_Digits {
    static String clearDigits(String s) {
        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else stack.append(c);
        }
        return stack.toString();
    }


    public static void main(String[] args) {
        System.out.println(clearDigits("cb34"));
    }
}
