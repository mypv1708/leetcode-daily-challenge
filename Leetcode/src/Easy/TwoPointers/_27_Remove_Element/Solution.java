package Easy.TwoPointers._27_Remove_Element;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr2 = {2, 3, 4, 5, 2};
        System.out.println(removeElement(arr2, 2));
    }
}
