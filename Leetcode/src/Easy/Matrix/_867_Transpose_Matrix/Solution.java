package Easy.Matrix._867_Transpose_Matrix;

import java.util.Arrays;

public class Solution {
    static int[][] transpose(int[][] matrixA) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        int[][] matrixB = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrixB[i][j] = matrixA[j][i];

        return matrixB;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(a)));
    }
}
