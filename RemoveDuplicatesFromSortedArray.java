// 26. Remove Duplicates from Sorted Array
// LeetCode URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy (Top Interview 150)
// Language: Java

class RemoveDuplicatesFromSortedArray {
    // Two Pointer In-Place
    // Time Complexity: O(n) -> 0-1 ms runtime
    // Space Complexity: O(1)
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
