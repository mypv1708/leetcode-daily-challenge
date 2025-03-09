package Easy.HashTable._2215_Find_the_Difference_of_Two_Arrays;

import java.util.*;

public class _2215_Find_the_Difference_of_Two_Arrays {
    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num1 : nums1) set1.add(num1);
        for (int num2 : nums2) set2.add(num2);

        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>());
        resultList.add(new ArrayList<>());

        for (int num : set1) {
            if (!set2.contains(num)) resultList.get(0).add(num);
        }
        for (int num : set2){
            if (!set1.contains(num)) resultList.get(1).add(num);
        }
        return resultList;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {3, 4, 5, 6};
        System.out.println(findDifference(nums1, nums2));
    }
}
