package Easy.HashTable._217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            if (set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }
}
