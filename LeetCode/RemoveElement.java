// 27. Remove Element
// LeetCode URL: https://leetcode.com/problems/remove-element/
// Difficulty: Easy (Top Interview 150)
// Language: Java

class RemoveElement {
    // 0 ms -> Beats 100.00% Runtime | Memory Beats 96.65%
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int num : nums) {
            if (num != val) {
                nums[k++] = num;
            }
        }
        return k;
    }
}
