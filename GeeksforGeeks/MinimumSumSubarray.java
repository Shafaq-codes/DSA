// Minimum Sum Subarray
// GFG POTD (21 October)
// URL: https://www.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1
// Difficulty: Medium
// Language: Java

class MinimumSumSubarray {
    // Kadane's Algorithm for Minimum Subarray Sum
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int minSubarraySum(int[] arr) {
        int currSum = arr[0];
        int minSum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.min(arr[i], currSum + arr[i]);
            minSum = Math.min(minSum, currSum);
        }
        
        return minSum;
    }
}
