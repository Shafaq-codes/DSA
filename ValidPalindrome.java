// 125. Valid Palindrome
// LeetCode URL: https://leetcode.com/problems/valid-palindrome/
// Difficulty: Easy (Top Interview 150)
// Language: Java

class ValidPalindrome {
    // Two Pointer Technique
    // Memory Beats 98.60%
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
