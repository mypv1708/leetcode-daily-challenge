package Easy.Matrix._566_Reshape_the_Matrix;

import java.util.Arrays;

public class _566_Reshape_the_Matrix {

    static int[][] matrixReshape(int[][] matrixA, int r, int c) {
        int m = matrixA.length;
        int n = matrixA[0].length;
        if (r * c != n * m) return matrixA;

        int[][] matrixB = new int[r][c];

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixB[count / c][count % c] = matrixA[i][j];
                count++;
            }
        }

////      Method 2
//        for (int i = 0; i < r * c; i++)
//            matrixB[i/c][i%c] = matrixA[i/n][i%n];

        return matrixB;
    }

    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrixReshape(matrixA, 1, 4)));
    }
}
