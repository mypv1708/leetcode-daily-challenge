package Easy.HashTable._349_Intersection_of_Two_Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }

        int[] result = new int[intersect.size()];
        int counter = 0;
        for (Integer num : intersect) {
            result[counter++] = num;
        }
        return result;
    }

    public static void sout(int[] nums1, int[] nums2) {
        System.out.println("Mảng 1: " + Arrays.toString(nums1));
        System.out.println("Mảng 2: " + Arrays.toString(nums2));
        System.out.println("Giao của hai mảng: " + Arrays.toString(intersection(nums1, nums2)));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        sout(nums1, nums2);

        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        sout(nums3, nums4);
    }
}
