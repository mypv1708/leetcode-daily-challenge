package Easy.Memorization._70_Climbing_Stairs;

import java.util.HashMap;
import java.util.Map;

public class _70_Climbing_Stairs_Method1 {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int climbStairs(int n) {
        if (n <= 2) return n;
        if (memo.containsKey(n)) return memo.get(n);

        int result = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, result);
        return result;
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
