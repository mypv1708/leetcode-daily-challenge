package Easy.String._383_Ransom_Note;

import java.util.HashMap;
import java.util.Map;

public class _383_Ransom_Note {
    static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : ransomNote.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        while(!map.isEmpty()){
            for(char c: magazine.toCharArray()){
                var value = map.get(c);
                if(value != null && value > 1 ){
                    map.put(c, value-1);
                }else if(value != null && value == 1){
                    map.remove(c);
                }
            }
            break;
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        String ransomNote = "bg", magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
