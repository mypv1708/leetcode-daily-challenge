package Easy.String._2000_Reverse_Prefix_of_Word;

public class _2000_Reverse_Prefix_of_Word_Method1 {
    static public String reversePrefix(String word, char ch) {
        StringBuilder stack = new StringBuilder();
        StringBuilder lastString = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch){
                stack.append(word.charAt(i));
                stack.reverse();
                lastString.append(word.substring(i+1));
                stack.append(lastString);
                return stack.toString();
            }
            stack.append(word.charAt(i));
        }
        return stack.toString();
    }


    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'z';
        System.out.println(reversePrefix(word,ch));
    }
}
