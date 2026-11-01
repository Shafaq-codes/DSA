// 345. Reverse Vowels of a String
// LeetCode URL: https://leetcode.com/problems/reverse-vowels-of-a-string/
// Study Plan: LeetCode 75 (Problem 4)
// Language: Java

class ReverseVowelsOfString {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            while (left < right && vowels.indexOf(arr[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(arr[right]) == -1) {
                right--;
            }
            
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        return new String(arr);
    }
}
