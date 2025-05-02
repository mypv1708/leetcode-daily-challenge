package Easy.Stack._20_Valid_Parentheses_Duplication;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '[') {
                characterStack.push(']');
            } else if (c == '{') {
                characterStack.push('}');
            } else if (c == '(') {
                characterStack.push(')');
            } else if (characterStack.isEmpty() || characterStack.pop() != c) {
                return false;
            }
        }
        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()]")); // false
        System.out.println(isValid("{(){}[]}")); // true
        System.out.println(isValid("{(){}[]")); // false
    }
}
