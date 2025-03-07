package Easy.DynamicProgramming._509_Fibonacci_Number;

public class _509_Fibonacci_Number {
    static int fib(int n) {
        if (n <= 1) return n;

        int curr = 1;
        int prev = 0;

        for (int i = 1; i < n; i++) {
            int temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        // Một số trường hợp test
        int[] testCases = {0, 1, 2, 3, 4, 5, 10};

        // Duyệt qua các trường hợp và in kết quả
        for (int n : testCases) {
            int ways = fib(n);
            System.out.println("Với n = " + n + ": Kết quả = " + ways);
        }
    }
}
