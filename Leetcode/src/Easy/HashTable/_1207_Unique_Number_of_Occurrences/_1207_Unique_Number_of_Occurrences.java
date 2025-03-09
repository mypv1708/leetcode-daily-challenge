package Easy.HashTable._1207_Unique_Number_of_Occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1207_Unique_Number_of_Occurrences {
    static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> bucket = new HashMap<>();
        for(int num : arr) {
            bucket.put(num, bucket.getOrDefault(num, 0)+1);
        }
        return hasDuplicateValues(bucket);
    }
     static <K, V> boolean hasDuplicateValues(Map<K, V> map) {
        Set<V> valueSet = new HashSet<>();
        for (V value : map.values()) {
            if (!valueSet.add(value)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
}
