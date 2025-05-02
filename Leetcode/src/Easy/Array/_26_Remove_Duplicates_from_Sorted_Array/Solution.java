package Easy.Array._26_Remove_Duplicates_from_Sorted_Array;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 5, 5};
        System.out.println(removeDuplicates(arr));
    }
}
