// Problem: Maximum Packages within Time (GeeksforGeeks POTD - Oct 31)
// Link: https://www.geeksforgeeks.org/problems/bird-and-maximum-fruit-gathering0509/1
// Approach: Fixed-Size Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxPackages(int[] arr, int totalTime) {
        int n = arr.length;
        if (n == 0 || totalTime <= 0) return 0;

        int k = Math.min(n, totalTime);

        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;
        for (int i = k; i < n; i++) {
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

