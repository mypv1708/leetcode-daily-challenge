package Easy.String._2000_Reverse_Prefix_of_Word;

public class _2000_Reverse_Prefix_of_Word_Method_2_Best {
    static String reversePrefix(String word, char ch) {
        int indexChar = word.indexOf(ch);
        if (indexChar == -1) return word;

        StringBuilder sb = new StringBuilder(word.length());
        sb.append(word, 0, indexChar + 1).reverse().append(word.substring(indexChar + 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "xyxzxe";
        char ch = 'z';
        System.out.println(reversePrefix(word, ch));
    }
}
