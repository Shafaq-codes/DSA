// 643. Maximum Average Subarray I
// LeetCode URL: https://leetcode.com/problems/maximum-average-subarray-i/
// Study Plan: LeetCode 75 (Problem 8)
// Language: Java

class MaximumAverageSubarrayI {
    // Sliding Window Technique
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        
        return maxSum / k;
    }
}
