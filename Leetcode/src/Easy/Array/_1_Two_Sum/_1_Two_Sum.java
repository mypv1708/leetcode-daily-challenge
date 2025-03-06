package Easy.Array._1_Two_Sum;

import java.util.Arrays;

public class _1_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 2, 3, 2, 23, 23, 12, 43, 21, 32, 43, 54, 54, 5, 65, 4, 6, 6, 5};
        System.out.println(Arrays.toString(twoSum(arr, 12)));
    }
}
