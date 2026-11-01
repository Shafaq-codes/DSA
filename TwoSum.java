// 1. Two Sum
// LeetCode URL: https://leetcode.com/problems/two-sum/
// Language: Java

class TwoSum {
    // Approach: Nested Loops (Brute Force)
    // Time Complexity: O(n^2), Space Complexity: O(1)
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        
        return new int[]{}; // Return empty array if not found
    }
}
