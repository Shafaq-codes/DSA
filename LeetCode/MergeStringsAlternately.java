// 1768. Merge Strings Alternately
// LeetCode URL: https://leetcode.com/problems/merge-strings-alternately/
// Study Plan: LeetCode 75 (Problem 1)
// Language: Java

class MergeStringsAlternately {
    // Time Complexity: O(n + m)  --> 1 ms (Beats 95.94%)
    // Space Complexity: O(n + m) --> Memory Beats 96.91%
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        
        return result.toString();
    }
}
