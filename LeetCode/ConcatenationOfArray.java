// 1929. Concatenation of Array
// LeetCode URL: https://leetcode.com/problems/concatenation-of-array/
// Language: Java
// Difficulty: Easy

class ConcatenationOfArray {
    // Time Complexity: O(n)  --> Runtime: 1 ms (Beats 97.5%)
    // Space Complexity: O(n) --> Memory: Beats 99.6%
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        
        return ans;
    }
}
