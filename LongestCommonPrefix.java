// Problem: 14. Longest Common Prefix (LeetCode - Easy)
// Link: https://leetcode.com/problems/longest-common-prefix/
// Approach: Horizontal Scanning (compare prefix with each string and trim)
// Time Complexity: O(S) where S is the sum of all characters in all strings
// Space Complexity: O(1) auxiliary space

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}

