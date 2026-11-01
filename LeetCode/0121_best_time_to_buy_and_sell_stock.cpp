// 121. Best Time to Buy and Sell Stock
// LeetCode URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Topic: Array, Dynamic Programming / Greedy

#include <vector>
#include <algorithm>
using namespace std;

// Optimal Approach: One Pass (Greedy / Min-Tracking)
// Time Complexity: O(n)  --> Runtime: 0 ms (Beats 100%)
// Space Complexity: O(1)
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 0; i < prices.size(); i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
};
