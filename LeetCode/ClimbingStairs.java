// Problem: 70. Climbing Stairs (LeetCode - Easy)
// Link: https://leetcode.com/problems/climbing-stairs/
// Approach: Dynamic Programming / Fibonacci Space Optimization
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int prev2 = 1; // Ways to reach step 1
        int prev1 = 2; // Ways to reach step 2

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}

