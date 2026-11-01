// 217. Contains Duplicate
// LeetCode URL: https://leetcode.com/problems/contains-duplicate/
// Language: Java
// Difficulty: Easy

import java.util.Arrays;
import java.util.HashSet;

class ContainsDuplicate {
    // Approach 1: HashSet (Optimal)
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        
        return false;
    }

    // Approach 2: Sorting
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    public boolean containsDuplicateSorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
