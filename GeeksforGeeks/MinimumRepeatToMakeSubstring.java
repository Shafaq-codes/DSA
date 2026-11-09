// Problem: Minimum Repeat to Make Substring (GeeksforGeeks POTD - Nov 8)
// Link: https://www.geeksforgeeks.org/problems/minimum-repeat-to-make-substring--141631/1
// Approach: StringBuilder Expansion + Substring Matching
// Time Complexity: O(N * M)
// Space Complexity: O(N + M)

class Solution {
    static int minRepeats(String s1, String s2) {
        int repeat = 1;
        StringBuilder repeatedStr = new StringBuilder(s1);

        // Repeat s1 until its length is at least the length of s2
        while (repeatedStr.length() < s2.length()) {
            repeatedStr.append(s1);
            repeat++;
        }

        // Check if s2 is a substring
        if (repeatedStr.toString().contains(s2)) {
            return repeat;
        }

        // Try one more repetition to account for cross-boundary alignments
        repeatedStr.append(s1);
        repeat++;
        if (repeatedStr.toString().contains(s2)) {
            return repeat;
        }

        return -1;
    }
}

