package Easy.HashTable._268_Missing_Number;

import java.util.HashSet;
import java.util.Set;

public class _268_Missing_Number {
    static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
}
