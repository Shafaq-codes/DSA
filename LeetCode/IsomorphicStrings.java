// Problem: 205. Isomorphic Strings (LeetCode - Easy)
// Link: https://leetcode.com/problems/isomorphic-strings/
// Approach: Character Index Mapping (Two 256-size Arrays)
// Time Complexity: O(n)
// Space Complexity: O(1) (fixed 256 size)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If their last seen positions don't match, they aren't isomorphic
            if (mapS[c1] != mapT[c2]) {
                return false;
            }

            // Store current position (1-based to distinguish from unvisited 0)
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }

        return true;
    }
}
