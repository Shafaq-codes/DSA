// Minimize Max Min Diff with Subarray Removal
// GFG POTD (26 October)
// URL: https://www.geeksforgeeks.org/problems/minimize-the-difference/1
// Difficulty: Medium
// Language: Java

class MinimizeMaxMinDiffWithSubarrayRemoval {
    // Prefix and Suffix Max/Min Technique
    // Time Complexity: O(n) -> 1121/1121 test cases passed
    // Space Complexity: O(n)
    public int minDiff(int k, int[] arr) {
        int n = arr.length;
        
        if (k >= n - 1) return 0;
        
        int[] postMax = new int[n];
        int[] postMin = new int[n];
        
        postMax[n - 1] = arr[n - 1];
        postMin[n - 1] = arr[n - 1];
        
        for (int i = n - 2; i >= 0; i--) {
            postMax[i] = Math.max(arr[i], postMax[i + 1]);
            postMin[i] = Math.min(arr[i], postMin[i + 1]);
        }
        
        if (k == 0) {
            return postMax[0] - postMin[0];
        }
        
        int minDifference = postMax[k] - postMin[k];
        
        int preMax = arr[0];
        int preMin = arr[0];
        
        for (int i = 1; i <= n - k; i++) {
            int currentMax, currentMin;
            
            if (i + k < n) {
                currentMax = Math.max(preMax, postMax[i + k]);
                currentMin = Math.min(preMin, postMin[i + k]);
            } else {
                currentMax = preMax;
                currentMin = preMin;
            }
            
            minDifference = Math.min(minDifference, currentMax - currentMin);
            
            if (i < n) {
                preMax = Math.max(preMax, arr[i]);
                preMin = Math.min(preMin, arr[i]);
            }
        }
        
        return minDifference;
    }
}
