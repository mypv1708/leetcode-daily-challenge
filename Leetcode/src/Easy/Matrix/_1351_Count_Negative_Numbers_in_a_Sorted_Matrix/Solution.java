package Easy.Matrix._1351_Count_Negative_Numbers_in_a_Sorted_Matrix;

public class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
