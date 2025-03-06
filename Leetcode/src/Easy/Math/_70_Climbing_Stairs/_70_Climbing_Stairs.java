package Easy.Math._70_Climbing_Stairs;

public class _70_Climbing_Stairs {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int curr = 2;
        int prev = 1;
        for (int i = 3; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
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
