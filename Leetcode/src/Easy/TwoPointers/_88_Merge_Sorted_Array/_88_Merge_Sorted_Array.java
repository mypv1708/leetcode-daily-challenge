package Easy.TwoPointers._88_Merge_Sorted_Array;

import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int midx = m - 1;
        int nidx = n - 1;
        int right = m + n - 1;

        while (nidx >= 0) {
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }
            System.out.println(Arrays.toString(nums1));
    }


    public static void main(String[] args) {
        int[] arr1 = new int[1];
        int[] arr2 = {1};
        merge(arr1,0,arr2,1);
    }
}
