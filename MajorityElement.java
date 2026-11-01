// 169. Majority Element
// LeetCode URL: https://leetcode.com/problems/majority-element/
// Difficulty: Easy (Top Interview 150)
// Language: Java

class MajorityElement {
    // Boyer-Moore Voting Algorithm
    // Time Complexity: O(n) -> 2 ms (Beats 83.05%)
    // Space Complexity: O(1)
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}
