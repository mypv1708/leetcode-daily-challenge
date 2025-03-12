package Easy.Array._2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer;

public class Solution {
    static int maximumCount(int[] nums) {
        int countPos = 0;
        int countNav = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                countPos++;
            } else if (nums[i] < 0) {
                countNav++;
            }
        }
        return Math.max(countPos, countNav);
    }

    public static void main(String[] args) {
        int[] arr = {5,20,66,1314};
        System.out.println(maximumCount(arr));
    }
}
