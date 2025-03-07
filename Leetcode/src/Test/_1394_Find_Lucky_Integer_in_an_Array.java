package Test;

import java.util.HashMap;
import java.util.Map;

public class _1394_Find_Lucky_Integer_in_an_Array {
    static int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                if (max < entry.getKey()) {
                    max = entry.getKey();
                }
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        System.out.println(findLucky(arr));
    }
}
