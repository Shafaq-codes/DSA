// Palindrome with Replacement (Palindrome with Minimum Sum)
// GFG POTD (22 October)
// URL: https://www.geeksforgeeks.org/problems/palindrome-with-minimum-sum-170648/1
// Difficulty: Medium
// Language: Java

class PalindromeWithReplacement {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int minimumSum(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int l = 0, r = n - 1;
        
        // Step 1: Form palindrome and check for mismatches
        while (l <= r) {
            if (arr[l] != '?' && arr[r] != '?') {
                if (arr[l] != arr[r]) {
                    return -1;
                }
            } else if (arr[l] != '?') {
                arr[r] = arr[l];
            } else if (arr[r] != '?') {
                arr[l] = arr[r];
            }
            l++;
            r--;
        }
        
        // Step 2: Compute minimum adjacent difference sum
        char prev = '#';
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] != '?') {
                if (prev != '#') {
                    sum += Math.abs(arr[i] - prev);
                }
                prev = arr[i];
            }
        }
        
        return sum;
    }
}
