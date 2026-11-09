// Problem: 35. Search Insert Position (LeetCode - Easy)
// Link: https://leetcode.com/problems/search-insert-position/
// Approach: Binary Search (O(log n))
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        // If target is not found, 'left' is the exact index where it should be inserted
        return left;
    }
}

