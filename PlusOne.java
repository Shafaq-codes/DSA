// 66. Plus One
// LeetCode URL: https://leetcode.com/problems/plus-one/
// Difficulty: Easy (Top Interview 150)
// Language: Java

class PlusOne {
    // 0 ms -> Beats 100.00% Runtime | Memory Beats 97.95%
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
