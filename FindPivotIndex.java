// 724. Find Pivot Index
// LeetCode URL: https://leetcode.com/problems/find-pivot-index/
// Study Plan: LeetCode 75
// Language: Java

class FindPivotIndex {
    // 1 ms -> Beats 95.79% Runtime
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
