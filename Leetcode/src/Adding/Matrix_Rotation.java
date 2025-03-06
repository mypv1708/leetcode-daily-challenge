package Adding;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Rotation {
    static void rotateMatrix(String[][] matrix) {
        int length = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[j].length; j++) {
                matrix[i][j] = matrix[length - 1][j];
            }
            length--;
        }
        System.out.println(Arrays.toString(matrix));
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String input;
        Integer line = 0;
        Integer total = 0;

        total = Integer.valueOf(myObj.nextLine());
        String[][] newMatrix = new String[total][total];

        for (int i = 0; i < total; i++) {
            input = myObj.nextLine();
            newMatrix[i] = input.split(" ");
        }

        rotateMatrix(newMatrix);
    }
}
