// 136. Single Number
// LeetCode URL: https://leetcode.com/problems/single-number/
// Language: Java

class SingleNumber {
    // 1 ms -> Beats 99.95% Runtime
    // XOR properties: a ^ a = 0, a ^ 0 = a
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
