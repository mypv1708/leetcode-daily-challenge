package Easy.Array._414_Third_Maximum_Number;

import java.util.TreeSet;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
            if (treeSet.size() > 3) {
                treeSet.pollFirst();
            }
        }
        return treeSet.size() == 3 ? treeSet.first() : treeSet.last();
    }

    public static void main(String[] args) {
            int[] nums = {2, 3, 4, 5, 6};
            System.out.println(thirdMax(nums));
    }
}
