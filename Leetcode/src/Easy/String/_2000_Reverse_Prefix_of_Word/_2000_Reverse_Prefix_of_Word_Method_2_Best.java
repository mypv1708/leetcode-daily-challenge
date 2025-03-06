package Easy.String._2000_Reverse_Prefix_of_Word;

public class _2000_Reverse_Prefix_of_Word_Method_2_Best {
    static String reversePrefix(String word, char ch) {
        int indexChar = word.indexOf(ch);

        if (indexChar != -1) {
            return new StringBuilder(
                        word.substring(0, indexChar + 1)).reverse().toString()
                      + word.substring(indexChar + 1);
        }
        return word;
    }

    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'z';
        System.out.println(reversePrefix(word, ch));
    }
}
