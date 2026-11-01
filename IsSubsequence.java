// 392. Is Subsequence
// LeetCode URL: https://leetcode.com/problems/is-subsequence/
// Study Plan: LeetCode 75 (Problem 6)
// Language: Java

class IsSubsequence {
    // Two Pointer Technique
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        
        return i == s.length();
    }
}
