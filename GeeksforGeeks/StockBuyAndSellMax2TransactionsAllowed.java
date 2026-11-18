// Problem: Stock Buy and Sell – Max 2 Transactions Allowed (GeeksforGeeks POTD - Nov 17)
// Link: https://www.geeksforgeeks.org/problems/buy-stock-2-times2004/1
// Approach: State Tracking DP (buy1, profit1, buy2, profit2)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public static int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE, profit1 = 0;
        int buy2 = Integer.MIN_VALUE, profit2 = 0;

        for (int price : prices) {
            buy1 = Math.max(buy1, -price);
            profit1 = Math.max(profit1, buy1 + price);
            buy2 = Math.max(buy2, profit1 - price);
            profit2 = Math.max(profit2, buy2 + price);
        }

        return profit2;
    }
}

