package Easy.Array._169_Majority_Element;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        n /= 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void sout(int[] nums) {
        System.out.println("Mảng đầu vào: " + java.util.Arrays.toString(nums));
        System.out.println("Phần tử xuất hiện nhiều nhất (majority element): " + majorityElement(nums));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        int[] test1 = {3, 2, 3};
        int[] test2 = {2, 2, 1, 1, 1, 2, 2};
        sout(test1); // Output: 3
        sout(test2); // Output: 2
    }
}
