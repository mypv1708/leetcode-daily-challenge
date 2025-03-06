package Adding;

public class Find_Max_Array {
    public static int findMaxArray(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4};

        System.out.println(findMaxArray(arr));
    }
}
