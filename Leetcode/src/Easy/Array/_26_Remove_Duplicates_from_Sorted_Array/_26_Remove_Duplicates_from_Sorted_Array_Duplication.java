package Easy.Array._26_Remove_Duplicates_from_Sorted_Array;

public class _26_Remove_Duplicates_from_Sorted_Array_Duplication {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6};
        System.out.println(removeDuplicates(arr));
    }
}
