package Easy.HashTable._387_First_Unique_Character_in_a_String;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int firstUniqChar(String s) {
        Map<Character, Integer> freqMap  = new HashMap<>();
        for (char c : s.toCharArray()){
            freqMap .put(c, freqMap .getOrDefault(c,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (freqMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
}
