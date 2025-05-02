package Easy.Array.Greedy_121_Best_Time_to_Buy_and_Sell_Stock;

public class Solution {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices){
            minPrice = Integer.min(minPrice, price);
            maxProfit = Integer.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,2,5,1,6,0,2};
        System.out.println(maxProfit(prices));
    }
}
