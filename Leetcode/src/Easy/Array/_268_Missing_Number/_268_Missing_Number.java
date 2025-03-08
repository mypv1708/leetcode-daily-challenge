package Easy.Array._268_Missing_Number;

public class _268_Missing_Number {
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += i;
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        System.out.println(missingNumber(nums));
    }
}
