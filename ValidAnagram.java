// 242. Valid Anagram
// LeetCode URL: https://leetcode.com/problems/valid-anagram/
// Language: Java
// Difficulty: Easy

import java.util.Arrays;

class ValidAnagram {
    // Approach: Sorting
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        return Arrays.equals(sArr, tArr);
    }
}
