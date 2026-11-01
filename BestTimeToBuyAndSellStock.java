// 121. Best Time to Buy and Sell Stock
// LeetCode URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Language: Java

class BestTimeToBuyAndSellStock {
    // Approach: One Pass (Greedy / Tracking Minimum)
    // Time Complexity: O(n), Space Complexity: O(1)
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}
