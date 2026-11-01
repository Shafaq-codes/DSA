// 283. Move Zeroes
// LeetCode URL: https://leetcode.com/problems/move-zeroes/
// Study Plan: LeetCode 75 (Problem 5)
// Language: Java

class MoveZeroes {
    // Two Pointer In-Place
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public void moveZeroes(int[] nums) {
        int pos = 0;
        
        for (int num : nums) {
            if (num != 0) {
                nums[pos++] = num;
            }
        }
        
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }
}
