// Sum of Beauty of All Substrings
// GFG POTD (25 October)
// URL: https://www.geeksforgeeks.org/problems/sum-of-beauty-of-all-substrings-1662962118/1
// Difficulty: Easy
// Language: Java

class SumOfBeautyOfAllSubstrings {
    // Time Complexity: O(n^2 * 26)
    // Space Complexity: O(1)
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                
                for (int count : freq) {
                    if (count > 0) {
                        maxFreq = Math.max(maxFreq, count);
                        minFreq = Math.min(minFreq, count);
                    }
                }
                
                totalBeauty += (maxFreq - minFreq);
            }
        }
        
        return totalBeauty;
    }
}
