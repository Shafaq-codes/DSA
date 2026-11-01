// 1920. Build Array from Permutation
// LeetCode URL: https://leetcode.com/problems/build-array-from-permutation/
// Language: Java
// Difficulty: Easy

class BuildArrayFromPermutation {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }
}
