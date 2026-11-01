// Problem: Maximum Subarray Sum with One Element Squared (GeeksforGeeks POTD - Nov 1)
// Link: https://www.geeksforgeeks.org/problems/maximum-sum-subarray--143510/1
// Approach: Kadane's Algorithm with State Tracking (noSq vs withSq)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maximumSubarray(int[] arr) {
        int n = arr.length;

        int noSq = arr[0];
        int withSq = arr[0] * arr[0];
        int ans = Math.max(noSq, withSq);

        for (int i = 1; i < n; i++) {
            int x = arr[i];
            int sq = x * x;

            int newWithSq = Math.max(sq, Math.max(noSq + sq, withSq + x));
            int newNoSq = Math.max(x, noSq + x);

            noSq = newNoSq;
            withSq = newWithSq;

            ans = Math.max(ans, Math.max(noSq, withSq));
        }

        return ans;
    }
}

