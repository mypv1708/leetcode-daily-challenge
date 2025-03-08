package Easy.HashTable._645_Set_Mismatch;

import scala.Int;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _645_Set_Mismatch {
    static int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.getOrDefault(num, 0) == 2) {
                arr[0] = num;
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                arr[1] = i;
                return arr;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
