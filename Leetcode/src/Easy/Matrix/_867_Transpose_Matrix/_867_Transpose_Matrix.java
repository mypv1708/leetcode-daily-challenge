package Easy.Matrix._867_Transpose_Matrix;

import java.util.Arrays;

public class _867_Transpose_Matrix {
    static int[][] transpose(int[][] matrixA) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        int[][] matrixB = new int[n][m];

        for (int j = 0; j < n; j++)
            for (int i = 0; i < m; i++)
                matrixB[j][i] = matrixA[i][j];

        return matrixB;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(a)));
    }
}
