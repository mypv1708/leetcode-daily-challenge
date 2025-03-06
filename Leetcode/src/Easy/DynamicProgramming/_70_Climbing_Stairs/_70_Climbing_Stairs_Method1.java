package Easy.DynamicProgramming._70_Climbing_Stairs;

public class _70_Climbing_Stairs_Method1 {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        // Một số trường hợp test
        int[] testCases = {0, 1, 2, 3, 4, 5, 10};

        // Duyệt qua các trường hợp và in kết quả
        for (int n : testCases) {
            int ways = climbStairs(n);
            System.out.println("Với n = " + n + ": Số cách leo cầu thang = " + ways);
        }
    }
}
