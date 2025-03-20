package Easy.HashTable._350_Intersection_of_Two_Arrays_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.get(i) != null && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] intersection = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intersection[i] = list.get(i);
        }
        return intersection;
    }

    public static void sout(int[] nums1, int[] nums2) {
        System.out.println("Mảng 1: " + Arrays.toString(nums1));
        System.out.println("Mảng 2: " + Arrays.toString(nums2));
        System.out.println("Giao của hai mảng: " + Arrays.toString(intersect(nums1, nums2)));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        sout(nums1, nums2);

        int[] nums3 = {4, 4, 9, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        sout(nums3, nums4);
    }
}
