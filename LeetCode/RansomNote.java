// Problem: 383. Ransom Note (LeetCode - Easy)
// Link: https://leetcode.com/problems/ransom-note/
// Approach: Character Frequency Array (HashMap Optimization)
// Time Complexity: O(n + m)
// Space Complexity: O(1) (fixed size 26 array)

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] count = new int[26];

        // Count availability of each character in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Verify each character needed for ransomNote is available
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }

        return true;
    }
}

