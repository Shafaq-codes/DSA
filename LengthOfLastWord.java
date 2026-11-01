// 58. Length of Last Word
// LeetCode URL: https://leetcode.com/problems/length-of-last-word/
// Difficulty: Easy (Top Interview 150)
// Language: Java

class LengthOfLastWord {
    // 0 ms -> Beats 100.00% Runtime | Memory Beats 97.64%
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') break;
            length++;
        }
        
        return length;
    }
}
