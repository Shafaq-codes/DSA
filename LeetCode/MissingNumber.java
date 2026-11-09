// Problem: 268. Missing Number (LeetCode - Easy)
// Link: https://leetcode.com/problems/missing-number/
// Approach: Bit Manipulation (XOR) or Gauss Sum Formula
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // Total expected sum using formula n * (n + 1) / 2
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}

