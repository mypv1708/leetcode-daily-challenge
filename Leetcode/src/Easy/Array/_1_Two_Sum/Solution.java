package Easy.Array._1_Two_Sum;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[]{j, j - i};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 2, 3, 2, 23, 23, 12, 43, 21, 32, 43, 54, 54, 5, 65, 4, 6, 6, 5};
        System.out.println(Arrays.toString(twoSum(arr, 12)));
    }
}
