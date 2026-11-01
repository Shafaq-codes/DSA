// Nth in Concatenated Decimal String
// GFG POTD (28 October)
// URL: https://www.geeksforgeeks.org/problems/nth-character-in-concatenated-decimal-string0245/1
// Difficulty: Medium
// Language: Java

class NthInConcatenatedDecimalString {
    // Mathematical Digit Counting - O(log10(n)) time, O(1) space
    // 2015/2015 Test Cases Passed in 0.14s (100% Accuracy)
    public char nthCharacter(int n) {
        long len = 1;
        long count = 9;
        long start = 1;
        
        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }
        
        start += (n - 1) / len;
        
        String s = Long.toString(start);
        return s.charAt((int) ((n - 1) % len));
    }
}
