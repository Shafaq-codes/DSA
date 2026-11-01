// Problem: 13. Roman to Integer (LeetCode - Easy)
// Link: https://leetcode.com/problems/roman-to-integer/
// Approach: Right-to-Left Traversal (Subtract if smaller than next, else Add)
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int prev = 0;

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = value(s.charAt(i));

            // If current value is less than the previous value to its right (e.g., IV: 1 < 5), subtract
            if (curr < prev) {
                ans -= curr;
            } else {
                ans += curr;
            }
            prev = curr;
        }

        return ans;
    }

    private int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}

