// 1672. Richest Customer Wealth
// LeetCode URL: https://leetcode.com/problems/richest-customer-wealth/
// Language: Java

class RichestCustomerWealth {
    // 0 ms -> Beats 100.00% Runtime | Memory Beats 98.98%
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int bank : customer) {
                currentWealth += bank;
            }
            if (currentWealth > maxWealth) {
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
    }
}
