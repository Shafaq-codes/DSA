// Problem: Balanced Binary Tree Counter (GeeksforGeeks POTD - Nov 6)
// Link: https://www.geeksforgeeks.org/problems/bbt-counter4914/1
// Approach: Dynamic Programming / Space Optimization
// Time Complexity: O(h)
// Space Complexity: O(1)

class Solution {
    public int countBT(int h) {
        if (h <= 1) {
            return 1;
        }

        long MOD = 1000000007L;
        long prev2 = 1; // count(0) - empty tree
        long prev1 = 1; // count(1) - single node

        for (int i = 2; i <= h; i++) {
            // count(h) = count(h - 1) * (count(h - 1) + 2 * count(h - 2))
            long curr = (prev1 * (prev1 + 2 * prev2)) % MOD;
            prev2 = prev1;
            prev1 = curr;
        }

        return (int) prev1;
    }
}
