package Easy.Matrix._1572_Matrix_Diagonal_Sum;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - i - 1];
        }

        if (n % 2 != 0)
            return sum -= mat[n / 2][n / 2];

        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Solution sol = new Solution();
        int result = sol.diagonalSum(mat);
        System.out.println("Tổng đường chéo là: " + result);
    }
}
