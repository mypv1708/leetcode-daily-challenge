package Easy.Matrix._1672_Richest_Customer_Wealth;

public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (max < sum) max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maxWealth = maximumWealth(accounts);
        System.out.println("Maximum Wealth: " + maxWealth);
    }
}
