package Easy.HashTable._448_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.*;

public class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums) {
            set.add(val);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void sout(int[] nums) {
        System.out.println("Kết quả: " + findDisappearedNumbers(nums));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        sout(nums);
    }
}
