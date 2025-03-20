package Easy.Array._485_Max_Consecutive_Ones;

public class Solution {
    static int findMaxConsecutiveOnes(int[] nums) {
        int max =0, ones = 0, i;
        int length = nums.length;
        for (i = 0; i< length; i++) {
            if(nums[i] == 1) {
                ones++;
            } else {
                max =Math.max(ones, max);
                ones = 0;
            }
        }
        return Math.max(ones, max);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
