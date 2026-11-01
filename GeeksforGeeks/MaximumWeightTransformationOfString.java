// Maximum Weight Transformation of String
// GFG POTD (27 October)
// URL: https://www.geeksforgeeks.org/problems/maximum-weight-transformation-of-a-given-string3551/1
// Difficulty: Medium
// Language: Java

class MaximumWeightTransformationOfString {
    // Dynamic Programming
    // Time Complexity: O(n) -> 0.15s (1125/1125 passed)
    // Space Complexity: O(n)
    public int getMaxweight(String s) {
        int n = s.length();
        if (n == 0) return 0;
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            // Option 1: Current character as single (weight +1)
            dp[i] = dp[i - 1] + 1;
            
            // Option 2: Pair with previous character
            if (s.charAt(i - 2) != s.charAt(i - 1)) {
                dp[i] = Math.max(dp[i], dp[i - 2] + 4);
            } else {
                dp[i] = Math.max(dp[i], dp[i - 2] + 3);
            }
        }
        
        return dp[n];
    }
}
