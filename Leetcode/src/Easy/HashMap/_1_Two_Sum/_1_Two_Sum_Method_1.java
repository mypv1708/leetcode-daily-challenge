package Easy.HashMap._1_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum_Method_1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(x, i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 2, 3, 2, 23, 23, 12, 43, 21, 32, 43, 54, 54, 5, 65, 4, 6, 6, 5};
        System.out.println(Arrays.toString(twoSum(arr, 12)));
    }
}
