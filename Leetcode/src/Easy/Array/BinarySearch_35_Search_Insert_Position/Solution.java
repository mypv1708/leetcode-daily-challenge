package Easy.Array.BinarySearch_35_Search_Insert_Position;

public class Solution {
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 7, 8, 9};
        System.out.println("Test 1 (target=2): " + searchInsert(nums1, 2));
    }
}
